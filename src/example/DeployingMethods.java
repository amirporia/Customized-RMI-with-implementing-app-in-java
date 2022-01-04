package example;

import java.io.*;

public class DeployingMethods implements RMICustomized, Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private boolean IsFinished;
    private String BindName;
    private String SUID;
    ObjectDB objectDB;


    public DeployingMethods(String bindName, String SUId) {
        SUID = SUId;
        BindName = bindName;
    }

    @Override
    public int DecreaseCreditCard(int x) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\DataBase");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectDB = (ObjectDB) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        FileOutputStream fileOutputStream = new FileOutputStream(System.getProperty("user.dir") + "\\DataBase");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectDB.CurrentAmount = objectDB.CurrentAmount - x;
        if (objectDB.CurrentAmount == 0) {
            IsFinished = true;
        }
        objectOutputStream.writeObject(objectDB);
        objectOutputStream.close();
        fileOutputStream.close();
//        fileInputStream.close();
//        fileOutputStream.close();
//        objectInputStream.close();
//        objectOutputStream.close();
        return (int) this.GetCurrentAmount(0);
    }

    @Override
    public int IncreaseCreditCard(int x) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\DataBase");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectDB = (ObjectDB) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        FileOutputStream fileOutputStream = new FileOutputStream(System.getProperty("user.dir") + "\\DataBase");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectDB.CurrentAmount = objectDB.CurrentAmount + x;
        if (objectDB.CurrentAmount != 0) {
            IsFinished = false;
        }
        objectOutputStream.writeObject(objectDB);
        objectOutputStream.close();
        fileOutputStream.close();
//        fileInputStream.close();
//        fileOutputStream.close();
//        objectInputStream.close();
//        objectOutputStream.close();
        return (int) objectDB.CurrentAmount;
    }

    @Override
    public double DecreaseCreditCard(double x) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\DataBase");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectDB = (ObjectDB) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        FileOutputStream fileOutputStream = new FileOutputStream(System.getProperty("user.dir") + "\\DataBase");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectDB.CurrentAmount = (int) (objectDB.CurrentAmount - x);
        if (objectDB.CurrentAmount == 0) {
            IsFinished = true;
        }
        objectOutputStream.writeObject(objectDB);
        objectOutputStream.close();
        fileOutputStream.close();
//        fileInputStream.close();
//        fileOutputStream.close();
//        objectInputStream.close();
//        objectOutputStream.close();
        return objectDB.CurrentAmount;
    }

    @Override
    public double IncreaseCreditCard(double x) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\DataBase");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectDB = (ObjectDB) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        FileOutputStream fileOutputStream = new FileOutputStream(System.getProperty("user.dir") + "\\DataBase");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectDB.CurrentAmount = (int) (objectDB.CurrentAmount + x);
        if (objectDB.CurrentAmount != 0) {
            IsFinished = false;
        }
        objectOutputStream.writeObject(objectDB);
        objectOutputStream.close();
        fileOutputStream.close();
//        fileInputStream.close();
//        fileOutputStream.close();
//        objectInputStream.close();
//        objectOutputStream.close();
        return objectDB.CurrentAmount;
    }

    @Override
    public boolean IsValid() throws IOException {
        return IsFinished;
    }

    @Override
    public String IsAuthenticationUsername(String Username) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\DataBase");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectDB = (ObjectDB) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
//        fileInputStream.close();
//        objectInputStream.close();
        return (objectDB.userFeature.Username.equals(Username)) ? "ok" : "nok";
    }

    @Override
    public String IsAuthenticationPassword(String Password) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\DataBase");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectDB = (ObjectDB) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
//        fileInputStream.close();
//        objectInputStream.close();
        return (objectDB.userFeature.Password.equals(Password)) ? "ok" : "nok";
    }

    @Override
    public String GetCostFood(String FoodName) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\DataBase");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectDB = (ObjectDB) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        for (int i = 0; i < 5; i++) {
            if (objectDB.DB[i].getFoodName().equals(FoodName))
                return Integer.toString(objectDB.DB[i].getCost());
        }
        return "0";
    }

    @Override
    public String GetNameFood(String DayName) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\DataBase");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectDB = (ObjectDB) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        for (int i = 0; i < 5; i++) {
            if (objectDB.DB[i].getDayName().equals(DayName))
                return objectDB.DB[i].getFoodName();
        }
        return "غذا موجود نیست";
    }

    @Override
    public int GetCurrentAmount(int x) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\DataBase");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectDB = (ObjectDB) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return objectDB.CurrentAmount;
    }

    @Override
    public String GetFamilyName(String name) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\DataBase");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectDB = (ObjectDB) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return objectDB.FamilyName;
    }

    @Override
    public double GetTotalCalories(double c) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\DataBase");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        objectDB = (ObjectDB) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
//        fileInputStream.close();
//        objectInputStream.close();
        return objectDB.DB[(int) (c - 1.0)].Calories;
    }

    @Override
    public String IsServerRMI(String bindName) throws IOException, ClassNotFoundException {
        if (BindName.equals(bindName))
            return SUID;
        return "0";
    }
}
