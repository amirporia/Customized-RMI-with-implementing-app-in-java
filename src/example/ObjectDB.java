package example;

import java.io.Serializable;

public class ObjectDB implements Serializable {
    public int CurrentAmount;
    public String FamilyName;
    public UserFeature userFeature;
    public DataBase[] DB;

    public ObjectDB() {
        userFeature = new UserFeature("Dr.Kalbasi", "123456");
        DB = new DataBase[5];
        DB[0] = new DataBase("Saturday", "چلوکباب", 5000, 0, 0, 127.5);
        DB[1] = new DataBase("Sunday", "فسنجان پلو", 4000, 0, 0, 201.3);
        DB[2] = new DataBase("Monday", "شامی", 6500, 0, 0, 755.6);
        DB[3] = new DataBase("Tuesday", "ته چین مرغ", 7000, 0, 0, 128.9);
        DB[4] = new DataBase("Wednesday", "قرمزه", 3500, 0, 0, 65.5);
        CurrentAmount = 50000;
        FamilyName = "دکتر امیر کلباسی";
    }
}

