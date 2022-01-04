package example;

import java.io.*;

public class GeneralMethod implements Serializable{
    public final int PORT = 5555;

    public GeneralMethod() throws IOException, ClassNotFoundException, NoSuchMethodException {
        FileOutputStream fileOutputStream = new FileOutputStream(System.getProperty("user.dir") + "\\DataBase");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(new ObjectDB());
        MethodObjectSerialize RMICustom = new MethodObjectSerialize(PORT, "localhost" , "Hello","1.0.0.0");

    }

    public static void main(String[] args) throws Exception {
        new GeneralMethod();
    }
}