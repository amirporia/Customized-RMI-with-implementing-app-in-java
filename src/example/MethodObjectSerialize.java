package example;

import java.io.*;
import java.net.*;

public class MethodObjectSerialize implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private static String BindName;
    private static String SUID;
    private static String hostname;

    public MethodObjectSerialize(int port, String Hostname, String bindName, String SUId) throws IOException, ClassNotFoundException, NoSuchMethodException {
        try {
            hostname = Hostname;
            BindName = bindName;
            SUID = SUId;
            InetAddress inetSocketAddress = InetAddress.getByName(hostname);
            ServerSocket serverSocket = new ServerSocket(port, 3, inetSocketAddress);
            serverSocket.setReuseAddress(true);
            System.out.println("Server is up on PORT: " + port + " !");
            int uuid = 0;

            while (true) {
                Socket socket = serverSocket.accept(); /// keep the program running
                System.out.println(socket.getInetAddress().getHostName());
                System.out.println("Server started ...");

                System.out.println("One New Client was attached"
                        + socket.getInetAddress()
                        .getHostAddress());

                ClientHandler clientSocket
                        = new ClientHandler(socket, BindName, SUID, uuid);

                new Thread(clientSocket).start();
                uuid++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
