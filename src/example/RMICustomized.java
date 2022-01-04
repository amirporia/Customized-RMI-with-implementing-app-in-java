package example;

import java.io.IOException;

public interface RMICustomized {

    public int DecreaseCreditCard(int x) throws IOException, ClassNotFoundException;

    public int IncreaseCreditCard(int x) throws IOException, ClassNotFoundException;

    public double DecreaseCreditCard(double x) throws IOException, ClassNotFoundException;

    public double IncreaseCreditCard(double x) throws IOException, ClassNotFoundException;

//    public String setName(String x) throws IOException;

    public boolean IsValid() throws IOException;

    public String IsAuthenticationUsername(String Username) throws IOException, ClassNotFoundException;

    public String IsAuthenticationPassword(String Password) throws IOException, ClassNotFoundException;

    public String GetCostFood(String FoodName) throws IOException, ClassNotFoundException;

    public String GetNameFood(String DayName) throws IOException, ClassNotFoundException;

    public int GetCurrentAmount(int x) throws IOException,ClassNotFoundException;

    public String GetFamilyName(String name) throws IOException,ClassNotFoundException;

    public double GetTotalCalories(double c) throws IOException,ClassNotFoundException;

    public String IsServerRMI(String BindName) throws IOException,ClassNotFoundException;
}

