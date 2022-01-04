package example;

import java.io.*;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.util.Enumeration;

public class RMICustom implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    public static String BindName;
    private static ObjectOutputStream outStream;
    private static ObjectInputStream inStream;
    private static InetAddress Hostname = null;
    private static int DynamicPort = 0;
    private static Socket socket;
    private static String SUID;

    public RMICustom(String bindName, String SUId) throws IOException, ClassNotFoundException {
        BindName = bindName;
        SUID = SUId;
        RecoveryServer();
    }

    public int DynamicBinding(int RetryCount) {
        try {
            boolean isConnected = false;
            Enumeration e = NetworkInterface.getNetworkInterfaces();
            while (e.hasMoreElements() && !isConnected) {
                NetworkInterface n = (NetworkInterface) e.nextElement();
                Enumeration ee = n.getInetAddresses();
                while (ee.hasMoreElements() && !isConnected) {
                    InetAddress i = (InetAddress) ee.nextElement();
                    InetAddress[] iaddress
                            = InetAddress.getAllByName(i.getHostName());

                    for (InetAddress ipaddresses : iaddress) {
                        for (int x = 1; x <= 65535; x++) {
                            try {
                                socket = new Socket(
                                        InetAddress.getByName(ipaddresses.getHostName()), x);
                                GeneralizeMethod GM = new GeneralizeMethod();
                                GM.MethodName = "IsServerRMI";
                                GM.obj = (Object) BindName;
                                socket.setSoTimeout(RetryCount);
                                if (socket.isConnected()) {
                                    outStream = new ObjectOutputStream(socket.getOutputStream());
                                    inStream = new ObjectInputStream(socket.getInputStream());
                                    outStream.writeObject(GM);
                                    String obj = (String) inStream.readObject();
                                    outStream.flush();
                                    if (SUID.equals(obj)) {
                                        Hostname = InetAddress.getByName(ipaddresses.getHostName());
                                        DynamicPort = x;
                                        System.out.println("Client connected ...");
                                        isConnected = true;
                                        socket.setSoTimeout(RetryCount * 6);
                                        break;
                                    }
                                    socket.close();
                                }

                            } catch (Exception exception) {
                                if (x % 3000 == 0)
                                    System.out.println("Looking up Server with name: " + BindName + " to connect ...");
                            }
                        }
                        if (isConnected)
                            break;
                    }
                    if (!isConnected) {
                        RetryCount = RetryCount + 3;
                        System.out.println("Server not Found to get Service ....  please waiting more..");
                        return RetryCount;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("connection not available....");
        }
        return 10;
    }

    public void RecoveryServer() throws IOException {
        int Retry = 10;
        while (DynamicPort == 0 && Hostname == null) {
            Retry = DynamicBinding(Retry);
            if(Retry > 100)
                return;
        }
        socket.close();
        inStream.close();
        outStream.close();
        socket = new Socket(Hostname, DynamicPort);
        outStream = new ObjectOutputStream(socket.getOutputStream());
        inStream = new ObjectInputStream(socket.getInputStream());
    }

    public void postMethodName(String nameMethod, Object o) throws IOException, ClassNotFoundException {
        try {
            GeneralizeMethod GM = new GeneralizeMethod();
            GM.MethodName = nameMethod;
            GM.obj = o;
            outStream.writeObject(GM);

        } catch (IOException e) {
            System.out.println("Connection has closed .... Reconnecting to Server , Token was lost!");
            RecoveryServer();
        }
    }

    public Object GetMethodName() throws IOException, ClassNotFoundException {
        try {

            Object obj = (Object) inStream.readObject();
            outStream.flush();
            return obj;
        } catch (IOException e) {
            System.out.println("Connection has closed .... Reconnecting to Server , Token was lost!");
            RecoveryServer();
        }
        return GetMethodName();
    }

    public Object getMethodName(String nameMethod, Object o) throws IOException, ClassNotFoundException {
        postMethodName(nameMethod, o);
        return GetMethodName();
    }
}
