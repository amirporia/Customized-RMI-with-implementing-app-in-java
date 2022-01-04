package example;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private final Socket clientSocket;
    private static int UUID = 0;
    private String BindName;
    private String SUID;

    // Constructor
    public ClientHandler(Socket socket , String bindName , String SUId , int uuid) {
        this.clientSocket = socket;
        this.BindName = bindName;
        this.SUID = SUId;
        this.UUID = uuid;
    }

    public void run() {

        try {
            ObjectOutputStream outStream = new ObjectOutputStream(clientSocket.getOutputStream());
            ObjectInputStream inStream = new ObjectInputStream(clientSocket.getInputStream());
            DeployingMethods MOS = new DeployingMethods(BindName , SUID);
            Class<?> classObj = MOS.getClass();


            // get all methods in the class
            Method[] allMethods = classObj.getDeclaredMethods();

            try {
                while (clientSocket.isConnected()) {
                    GeneralizeMethod GM = (GeneralizeMethod) inStream.readObject();
                    // loop through the methods to find the method addMe
                    for (Method m : allMethods) {

                        String methodName = m.getName();
                        if (methodName.equals(GM.MethodName) && (((m.getGenericReturnType()).toString()).equals(GetPrimitiveType(((GM.obj).getClass()).getSimpleName())) || ((GM.obj).getClass().toString()).equals(((m.getGenericReturnType()).toString())))) {
                            try {

                                outStream.writeObject(m.invoke(MOS, GM.obj));
                                break;
                            } catch (InvocationTargetException | IllegalAccessException ignored) {
                                System.out.println("Client is closed....request was failed!!!");
                            }
                        }
                    }
                }
            } catch (IOException e) {
//            e.printStackTrace();
                System.out.println("Connection is closed from ClientSide with ID : " + UUID);
            } catch (ClassNotFoundException classNotFoundException) {
                classNotFoundException.printStackTrace();
            }

        } catch (IOException e) {
            System.out.println("Server Connection was failed.... Please Check your Network Connection!!!!");
        }
    }

    public String GetPrimitiveType(String obj) {
        return switch (obj) {
            case "Integer" -> "int";
            case "Long" -> "long";
            case "Short" -> "short";
            case "String" -> "String";
            case "Double" -> "double";
            case "Boolean" -> "boolean";
            case "Float" -> "float";
            case "Byte" -> "byte";
            case "Character" -> "char";
            default -> "";
        };
    }

}
