package controller;

import UICmpack.MainPage;
import UICmpack.UI;
import com.sun.tools.javac.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.reflect.Method;

public class MainPageController implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Method method = this.getClass().getDeclaredMethod(e.getActionCommand());
            method.invoke(this);
        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    public void Confirm() throws IOException, ClassNotFoundException {
//        MainPage.DM;
        try {
            int totalOrderFee = Integer.parseInt(MainPage.getCostSaturday()) * Integer.parseInt(MainPage.getNumberOfOrderedSaturday()) +
                    Integer.parseInt(MainPage.getCostSunday()) * Integer.parseInt(MainPage.getNumberOfOrderedSunday()) +
                    Integer.parseInt(MainPage.getCostMonday()) * Integer.parseInt(MainPage.getNumberOfOrderedMonday()) +
                    Integer.parseInt(MainPage.getCostTuesday()) * Integer.parseInt(MainPage.getNumberOfOrderedTuesday()) +
                    Integer.parseInt(MainPage.getCostWednesday()) * Integer.parseInt(MainPage.getNumberOfOrderedWednesday());

            MainPage.setTotalFeeSaturday(Double.toString((MainPage.DM.GetTotalCalories(1.0)) * (double) Integer.parseInt(MainPage.getNumberOfOrderedSaturday())));
            MainPage.setTotalFeeSunday(Double.toString((MainPage.DM.GetTotalCalories(2.0)) * (double) Integer.parseInt(MainPage.getNumberOfOrderedSunday())));
            MainPage.setTotalFeeMonday(Double.toString((MainPage.DM.GetTotalCalories(3.0)) * (double) Integer.parseInt(MainPage.getNumberOfOrderedMonday())));
            MainPage.setTotalFeeTuesday(Double.toString((MainPage.DM.GetTotalCalories(4.0)) * (double) Integer.parseInt(MainPage.getNumberOfOrderedTuesday())));
            MainPage.setTotalFeeWednesday(Double.toString((MainPage.DM.GetTotalCalories(5.0)) * (double) Integer.parseInt(MainPage.getNumberOfOrderedWednesday())));
            MainPage.setCurrentAmountCreditCard(Integer.toString(MainPage.DM.DecreaseCreditCard(totalOrderFee)));

        } catch (IOException e) {
            if (MainPage.getNumberOfOrderedSaturday().trim().equals(""))
            {
                MainPage.setNumberOfOrderedSaturday("لطفا عدد وارد نمایید");
            } else if (MainPage.getNumberOfOrderedSunday().trim().equals(""))
            {
                MainPage.setNumberOfOrderedSunday("لطفا عدد وارد نمایید");
            } else if (MainPage.getNumberOfOrderedMonday().trim().equals(""))
            {
                MainPage.setNumberOfOrderedMonday("لطفا عدد وارد نمایید");
            } else if (MainPage.getNumberOfOrderedTuesday().trim().equals(""))
            {
                MainPage.setNumberOfOrderedTuesday("لطفا عدد وارد نمایید");
            } else if (MainPage.getNumberOfOrderedWednesday().trim().equals(""))
            {
                MainPage.setNumberOfOrderedWednesday("لطفا عدد وارد نمایید");
            }
        }
    }

    public void Cancel() {
        MainPage.setTotalFeeSaturday("0");
        MainPage.setTotalFeeSunday("0");
        MainPage.setTotalFeeMonday("0");
        MainPage.setTotalFeeTuesday("0");
        MainPage.setTotalFeeWednesday("0");

        MainPage.setNumberOfOrderedSaturday("0");
        MainPage.setNumberOfOrderedSunday("0");
        MainPage.setNumberOfOrderedMonday("0");
        MainPage.setNumberOfOrderedTuesday("0");
        MainPage.setNumberOfOrderedWednesday("0");
    }
}
