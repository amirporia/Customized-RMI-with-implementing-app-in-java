package example;

import java.io.Serializable;

public class DataBase implements Serializable {
    public String getDayName() {
        return dayName;
    }

    public String getFoodName() {
        return FoodName;
    }

    public int getCost() {
        return cost;
    }

    public int getNumberOfOrdered() {
        return numberOfOrdered;
    }

    public int getTotalFee() {
        return TotalFee;
    }

    private String dayName;
    private String FoodName;
    private int cost;
    public int numberOfOrdered;
    public int TotalFee;
    public double Calories;
    public DataBase(String DayName , String foodName , int Cost , int NumberOfOrdered , int totalFee , double calories)
    {
        dayName = DayName;
        FoodName = foodName;
        cost = Cost;
        numberOfOrdered = NumberOfOrdered;
        TotalFee = totalFee;
        Calories = calories;
    }


}
