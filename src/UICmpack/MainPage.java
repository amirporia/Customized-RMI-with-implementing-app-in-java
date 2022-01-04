package UICmpack;

import controller.MainPageController;
import example.DeployingMethods;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;


/////reservation of Food in University of AmirKabir
/////Current Credit Amount
/////7 row for 7 days of a week
////each row has 5 column
////////// 1. dayName 2.FoodName 3.cost 4.numberOfOrdered 5.TotalFee
////////// one Btn for commit
/////////one Btn for cancel
////  optional  ///// depose committed table of Order

public class MainPage extends JFrame {
    public static String getNumberOfOrderedSaturday() {
        return numberOfOrderedSaturday.getText();
    }

    public static void setNumberOfOrderedSaturday(String numberOfOrderedSaturday) {
        MainPage.numberOfOrderedSaturday.setText(numberOfOrderedSaturday);
    }

    public static String getTotalFeeSaturday() {
        return TotalFeeSaturday.getText();
    }

    public static void setTotalFeeSaturday(String totalFeeSaturday) {
        TotalFeeSaturday.setText(totalFeeSaturday);
    }

    public static String getCostSaturday() {
        return costSaturday.getText();
    }

    public static void setCostSaturday(String costSaturday) {
        MainPage.costSaturday.setText(costSaturday);
    }

    public static String getFoodNameSaturday() {
        return FoodNameSaturday.getText();
    }

    public static void setFoodNameSaturday(String foodNameSaturday) {
        FoodNameSaturday.setText(foodNameSaturday);
    }

    public static String getDayNameSaturday() {
        return dayNameSaturday.getText();
    }

    public static void setDayNameSaturday(String dayNameSaturday) {
        MainPage.dayNameSaturday.setText(dayNameSaturday);
    }

    public static String getNumberOfOrderedSunday() {
        return numberOfOrderedSunday.getText();
    }

    public static void setNumberOfOrderedSunday(String numberOfOrderedSunday) {
        MainPage.numberOfOrderedSunday.setText(numberOfOrderedSunday);
    }


    public static String getTotalFeeSunday() {
        return TotalFeeSunday.getText();
    }

    public static void setTotalFeeSunday(String totalFeeSunday) {
        TotalFeeSunday.setText(totalFeeSunday);
    }

    public static String getCostSunday() {
        return costSunday.getText();
    }

    public static void setCostSunday(String costSunday) {
        MainPage.costSunday.setText(costSunday);
    }

    public static String getFoodNameSunday() {
        return FoodNameSunday.getText();
    }

    public static void setFoodNameSunday(String foodNameSunday) {
        FoodNameSunday.setText(foodNameSunday);
    }

    public static String getDayNameSunday() {
        return dayNameSunday.getText();
    }

    public static void setDayNameSunday(String dayNameSunday) {
        MainPage.dayNameSunday.setText(dayNameSunday);
    }

    public static String getNumberOfOrderedMonday() {
        return numberOfOrderedMonday.getText();
    }

    public static void setNumberOfOrderedMonday(String numberOfOrderedMonday) {
        MainPage.numberOfOrderedMonday.setText(numberOfOrderedMonday);
    }

    public static String getTotalFeeMonday() {
        return TotalFeeMonday.getText();
    }

    public static void setTotalFeeMonday(String totalFeeMonday) {
        TotalFeeMonday.setText(totalFeeMonday);
    }

    public static String getCostMonday() {
        return costMonday.getText();
    }

    public static void setCostMonday(String costMonday) {
        MainPage.costMonday.setText(costMonday);
    }

    public static String getFoodNameMonday() {
        return FoodNameMonday.getText();
    }

    public static void setFoodNameMonday(String foodNameMonday) {
        FoodNameMonday.setText(foodNameMonday);
    }

    public static String getDayNameMonday() {
        return dayNameMonday.getText();
    }

    public static void setDayNameMonday(String dayNameMonday) {
        MainPage.dayNameMonday.setText(dayNameMonday);
    }

    public static String getNumberOfOrderedTuesday() {
        return numberOfOrderedTuesday.getText();
    }

    public static void setNumberOfOrderedTuesday(String numberOfOrderedTuesday) {
        MainPage.numberOfOrderedTuesday.setText(numberOfOrderedTuesday);
    }

    public static String getTotalFeeTuesday() {
        return TotalFeeTuesday.getText();
    }

    public static void setTotalFeeTuesday(String totalFeeTuesday) {
        TotalFeeTuesday.setText(totalFeeTuesday);
    }

    public static String getCostTuesday() {
        return costTuesday.getText();
    }

    public static void setCostTuesday(String costTuesday) {
        MainPage.costTuesday.setText(costTuesday);
    }

    public static String getFoodNameTuesday() {
        return FoodNameTuesday.getText();
    }

    public static void setFoodNameTuesday(String foodNameTuesday) {
        FoodNameTuesday.setText(foodNameTuesday);
    }

    public static String getDayNameTuesday() {
        return dayNameTuesday.getText();
    }

    public static void setDayNameTuesday(String dayNameTuesday) {
        MainPage.dayNameTuesday.setText(dayNameTuesday);
    }

    public static String getNumberOfOrderedWednesday() {
        return numberOfOrderedWednesday.getText();
    }

    public static void setNumberOfOrderedWednesday(String numberOfOrderedWednesday) {
        MainPage.numberOfOrderedWednesday.setText(numberOfOrderedWednesday);
    }

    public static String getTotalFeeWednesday() {
        return TotalFeeWednesday.getText();
    }

    public static void setTotalFeeWednesday(String totalFeeWednesday) {
        TotalFeeWednesday.setText(totalFeeWednesday);
    }

    public static String getCostWednesday() {
        return costWednesday.getText();
    }

    public static void setCostWednesday(String costWednesday) {
        MainPage.costWednesday.setText(costWednesday);
    }

    public static String getFoodNameWednesday() {
        return FoodNameWednesday.getText();
    }

    public static void setFoodNameWednesday(String foodNameWednesday) {
        FoodNameWednesday.setText(foodNameWednesday);
    }

    public static String getDayNameWednesday() {
        return dayNameWednesday.getText();
    }

    public static void setDayNameWednesday(String dayNameWednesday) {
        MainPage.dayNameWednesday.setText(dayNameWednesday);
    }

    static NumberFormat longFormat = NumberFormat.getIntegerInstance();

    static NumberFormatter numberFormatter = new NumberFormatter(longFormat);

    public static String getCurrentAmountCreditCard() {
        return CurrentAmountCreditCard.getText();
    }

    public static void setCurrentAmountCreditCard(String currentAmountCreditCard) {
        CurrentAmountCreditCard.setText(currentAmountCreditCard);
    }

    private static JFormattedTextField CurrentAmountCreditCard = new JFormattedTextField(numberFormatter);

    private static JFormattedTextField numberOfOrderedSaturday = new JFormattedTextField(numberFormatter);
    private static JTextField TotalFeeSaturday = new JTextField(10);
    private static JTextField costSaturday = new JTextField(10);
    private static JTextField FoodNameSaturday = new JTextField(10);
    private static JTextField dayNameSaturday = new JTextField(10);

    private static JFormattedTextField numberOfOrderedSunday = new JFormattedTextField(numberFormatter);
    private static JTextField TotalFeeSunday = new JTextField(10);
    private static JTextField costSunday = new JTextField(10);
    private static JTextField FoodNameSunday = new JTextField(10);
    private static JTextField dayNameSunday = new JTextField(10);

    private static JFormattedTextField numberOfOrderedMonday = new JFormattedTextField(numberFormatter);
    private static JTextField TotalFeeMonday = new JTextField(10);
    private static JTextField costMonday = new JTextField(10);
    private static JTextField FoodNameMonday = new JTextField(10);
    private static JTextField dayNameMonday = new JTextField(10);

    private static JFormattedTextField numberOfOrderedTuesday = new JFormattedTextField(numberFormatter);
    private static JTextField TotalFeeTuesday = new JTextField(10);
    private static JTextField costTuesday = new JTextField(10);
    private static JTextField FoodNameTuesday = new JTextField(10);
    private static JTextField dayNameTuesday = new JTextField(10);

    private static JFormattedTextField numberOfOrderedWednesday = new JFormattedTextField(numberFormatter);
    private static JTextField TotalFeeWednesday = new JTextField(10);
    private static JTextField costWednesday = new JTextField(10);
    private static JTextField FoodNameWednesday = new JTextField(10);
    private static JTextField dayNameWednesday = new JTextField(10);
    public static DeployingMethods DM = null;

    public MainPage(DeployingMethods DMInstance) throws IOException, ClassNotFoundException {

        DM = DMInstance;

        JPanel jPanel = new JPanel();
        jPanel.setLayout(null);
        jPanel.setBackground(Color.getHSBColor(288, 90, 89));

        MainPageController mainPageController = new MainPageController();

        this.setBounds(350, 50, 800, 650);
        this.setPreferredSize(new Dimension(300, 200));
        this.setTitle("سامانه رزرو غذا");

        File file = new File("src\\UICmpack\\assert\\Amirkabir.png");
        BufferedImage bufferedImage = ImageIO.read(file);
        ImageIcon imageIcon = new ImageIcon(bufferedImage);
        this.setIconImage(imageIcon.getImage());
        final int BaseVertically = 150;
        final int BaseHorizontally = 50;

        JTextField FamilyName = new JTextField(DM.GetFamilyName("FamilyName"));
        FamilyName.setEnabled(false);
        FamilyName.setBounds(BaseHorizontally + 500, BaseVertically-100, 180, 30);
        FamilyName.setFont(new Font("Arial", Font.BOLD, 15));
        FamilyName.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        FamilyName.setBackground(Color.lightGray);
        FamilyName.setDisabledTextColor(Color.BLUE);
        jPanel.add(FamilyName);

        JLabel DayNameLabel = new JLabel("ایام هفته");
        DayNameLabel.setLabelFor(dayNameSaturday);
        DayNameLabel.setDisplayedMnemonic('E');
        DayNameLabel.setBounds(BaseHorizontally + 635, BaseVertically - 20, 100, 20);
        jPanel.add(DayNameLabel);

        JLabel FoodNameLabel = new JLabel("نام غذا");
        FoodNameLabel.setLabelFor(FoodNameSaturday);
        FoodNameLabel.setDisplayedMnemonic('E');
        FoodNameLabel.setBounds(BaseHorizontally + 480, BaseVertically - 20, 100, 20);
        jPanel.add(FoodNameLabel);

        JLabel FoodCostLabel = new JLabel("قیمت غذا");
        FoodCostLabel.setLabelFor(costSaturday);
        FoodCostLabel.setDisplayedMnemonic('E');
        FoodCostLabel.setBounds(BaseHorizontally + 330, BaseVertically - 20, 100, 20);
        jPanel.add(FoodCostLabel);

        JLabel NumOfOrderedLabel = new JLabel("تعداد سفارش");
        NumOfOrderedLabel.setLabelFor(numberOfOrderedSaturday);
        NumOfOrderedLabel.setDisplayedMnemonic('E');
        NumOfOrderedLabel.setBounds(BaseHorizontally + 180, BaseVertically - 20, 100, 20);
        jPanel.add(NumOfOrderedLabel);

        JLabel totalCostLabel = new JLabel("میزان کالری مصرفی");
        totalCostLabel.setLabelFor(TotalFeeSaturday);
        totalCostLabel.setDisplayedMnemonic('E');
        totalCostLabel.setBounds(BaseHorizontally + 10, BaseVertically - 20, 100, 20);
        jPanel.add(totalCostLabel);

        CurrentAmountCreditCard.setEnabled(false);
        CurrentAmountCreditCard.setBounds(BaseHorizontally + 300, BaseVertically + 300, 100, 20);
        JLabel CurrentAmountCreditCardLabel = new JLabel("موجودی حساب");
        CurrentAmountCreditCardLabel.setLabelFor(CurrentAmountCreditCard);
        CurrentAmountCreditCardLabel.setDisplayedMnemonic('E');
        CurrentAmountCreditCardLabel.setBounds(BaseHorizontally + 335, BaseVertically + 280, 100, 20);
        CurrentAmountCreditCard.setText(Integer.toString(DM.GetCurrentAmount(0)));
        CurrentAmountCreditCard.setDisabledTextColor(Color.BLACK);
        CurrentAmountCreditCard.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);


        TotalFeeSaturday.setEnabled(false);
        costSaturday.setEnabled(false);
        FoodNameSaturday.setEnabled(false);
        dayNameSaturday.setEnabled(false);

        TotalFeeSaturday.setBounds(BaseHorizontally, BaseVertically, 100, 20);
        TotalFeeSaturday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        TotalFeeSaturday.setDisabledTextColor(Color.RED);
        numberOfOrderedSaturday.setBounds(BaseHorizontally + 150, BaseVertically, 100, 20);
        numberOfOrderedSaturday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        numberOfOrderedSaturday.setText("0");
        costSaturday.setBounds(BaseHorizontally + 300, BaseVertically, 100, 20);
        costSaturday.setText(DM.GetCostFood(DM.GetNameFood("Saturday")));
        costSaturday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        costSaturday.setDisabledTextColor(Color.BLACK);
        FoodNameSaturday.setBounds(BaseHorizontally + 450, BaseVertically, 100, 20);
        FoodNameSaturday.setText(DM.GetNameFood("Saturday"));
        FoodNameSaturday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        FoodNameSaturday.setDisabledTextColor(Color.blue);
        dayNameSaturday.setBounds(BaseHorizontally + 600, BaseVertically, 100, 20);
        dayNameSaturday.setText("              شنبه");
        dayNameSaturday.setDisabledTextColor(Color.BLACK);


        TotalFeeSunday.setEnabled(false);
        costSunday.setEnabled(false);
        FoodNameSunday.setEnabled(false);
        dayNameSunday.setEnabled(false);

        TotalFeeSunday.setBounds(BaseHorizontally, BaseVertically + 50, 100, 20);
        TotalFeeSunday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        TotalFeeSunday.setDisabledTextColor(Color.RED);
        numberOfOrderedSunday.setBounds(BaseHorizontally + 150, BaseVertically + 50, 100, 20);
        numberOfOrderedSunday.setText("0");
        numberOfOrderedSunday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        costSunday.setBounds(BaseHorizontally + 300, BaseVertically + 50, 100, 20);
        costSunday.setText(DM.GetCostFood(DM.GetNameFood("Sunday")));
        costSunday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        costSunday.setDisabledTextColor(Color.BLACK);
        FoodNameSunday.setBounds(BaseHorizontally + 450, BaseVertically + 50, 100, 20);
        FoodNameSunday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        FoodNameSunday.setText(DM.GetNameFood("Sunday"));
        FoodNameSunday.setDisabledTextColor(Color.BLUE);
        dayNameSunday.setBounds(BaseHorizontally + 600, BaseVertically + 50, 100, 20);
        dayNameSunday.setText("             یکشنبه");
        dayNameSunday.setDisabledTextColor(Color.BLACK);

        TotalFeeMonday.setEnabled(false);
        costMonday.setEnabled(false);
        FoodNameMonday.setEnabled(false);
        dayNameMonday.setEnabled(false);

        TotalFeeMonday.setBounds(BaseHorizontally, BaseVertically + 100, 100, 20);
        TotalFeeMonday.setDisabledTextColor(Color.RED);
        TotalFeeMonday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        numberOfOrderedMonday.setBounds(BaseHorizontally + 150, BaseVertically + 100, 100, 20);
        numberOfOrderedMonday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        numberOfOrderedMonday.setText("0");
        costMonday.setBounds(BaseHorizontally + 300, BaseVertically + 100, 100, 20);
        costMonday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        costMonday.setText(DM.GetCostFood(DM.GetNameFood("Monday")));
        costMonday.setDisabledTextColor(Color.BLACK);
        FoodNameMonday.setBounds(BaseHorizontally + 450, BaseVertically + 100, 100, 20);
        FoodNameMonday.setText(DM.GetNameFood("Monday"));
        FoodNameMonday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        FoodNameMonday.setDisabledTextColor(Color.BLUE);
        dayNameMonday.setBounds(BaseHorizontally + 600, BaseVertically + 100, 100, 20);
        dayNameMonday.setText("             دوشنبه");
        dayNameMonday.setDisabledTextColor(Color.BLACK);

        TotalFeeTuesday.setEnabled(false);
        costTuesday.setEnabled(false);
        FoodNameTuesday.setEnabled(false);
        dayNameTuesday.setEnabled(false);

        TotalFeeTuesday.setBounds(BaseHorizontally, BaseVertically + 150, 100, 20);
        TotalFeeTuesday.setDisabledTextColor(Color.RED);
        TotalFeeTuesday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        numberOfOrderedTuesday.setBounds(BaseHorizontally + 150, BaseVertically + 150, 100, 20);
        numberOfOrderedTuesday.setText("0");
        numberOfOrderedTuesday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        costTuesday.setBounds(BaseHorizontally + 300, BaseVertically + 150, 100, 20);
        costTuesday.setText(DM.GetCostFood(DM.GetNameFood("Tuesday")));
        costTuesday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        costTuesday.setDisabledTextColor(Color.BLACK);
        FoodNameTuesday.setBounds(BaseHorizontally + 450, BaseVertically + 150, 100, 20);
        FoodNameTuesday.setText(DM.GetNameFood("Tuesday"));
        FoodNameTuesday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        FoodNameTuesday.setDisabledTextColor(Color.BLUE);
        dayNameTuesday.setBounds(BaseHorizontally + 600, BaseVertically + 150, 100, 20);
        dayNameTuesday.setText("            سه شنبه");
        dayNameTuesday.setDisabledTextColor(Color.BLACK);

        TotalFeeWednesday.setEnabled(false);
        costWednesday.setEnabled(false);
        FoodNameWednesday.setEnabled(false);
        dayNameWednesday.setEnabled(false);

        TotalFeeWednesday.setBounds(BaseHorizontally, BaseVertically + 200, 100, 20);
        TotalFeeWednesday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        TotalFeeWednesday.setDisabledTextColor(Color.RED);
        numberOfOrderedWednesday.setBounds(BaseHorizontally + 150, BaseVertically + 200, 100, 20);
        numberOfOrderedWednesday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        numberOfOrderedWednesday.setText("0");
        costWednesday.setBounds(BaseHorizontally + 300, BaseVertically + 200, 100, 20);
        costWednesday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        costWednesday.setText(DM.GetCostFood(DM.GetNameFood("Wednesday")));
        costWednesday.setDisabledTextColor(Color.BLACK);
        FoodNameWednesday.setBounds(BaseHorizontally + 450, BaseVertically + 200, 100, 20);
        FoodNameWednesday.setText(DM.GetNameFood("Wednesday"));
        FoodNameWednesday.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        FoodNameWednesday.setDisabledTextColor(Color.BLUE);
        dayNameWednesday.setBounds(BaseHorizontally + 600, BaseVertically + 200, 100, 20);
        dayNameWednesday.setText("           چهارشنبه");
        dayNameWednesday.setDisabledTextColor(Color.BLACK);

        JButton jButtonConfirm = new JButton("تایید");
        JButton jButtonCancel = new JButton("کنسل");


        jButtonConfirm.addActionListener(mainPageController);
        jButtonConfirm.setActionCommand("Confirm");

        jButtonCancel.addActionListener(mainPageController);
        jButtonCancel.setActionCommand("Cancel");

        jButtonCancel.setBounds(BaseHorizontally + 200, BaseVertically + 350, 100, 20);
        jButtonConfirm.setBounds(BaseHorizontally + 400, BaseVertically + 350, 100, 20);

        jPanel.add(CurrentAmountCreditCard);
        jPanel.add(CurrentAmountCreditCardLabel);
        jPanel.add(jButtonConfirm);
        jPanel.add(jButtonCancel);


        jPanel.add(numberOfOrderedSaturday);
        jPanel.add(TotalFeeSaturday);
        jPanel.add(costSaturday);
        jPanel.add(FoodNameSaturday);
        jPanel.add(dayNameSaturday);

        jPanel.add(numberOfOrderedSunday);
        jPanel.add(TotalFeeSunday);
        jPanel.add(costSunday);
        jPanel.add(FoodNameSunday);
        jPanel.add(dayNameSunday);

        jPanel.add(numberOfOrderedMonday);
        jPanel.add(TotalFeeMonday);
        jPanel.add(costMonday);
        jPanel.add(FoodNameMonday);
        jPanel.add(dayNameMonday);

        jPanel.add(numberOfOrderedTuesday);
        jPanel.add(TotalFeeTuesday);
        jPanel.add(costTuesday);
        jPanel.add(FoodNameTuesday);
        jPanel.add(dayNameTuesday);

        jPanel.add(numberOfOrderedWednesday);
        jPanel.add(TotalFeeWednesday);
        jPanel.add(costWednesday);
        jPanel.add(FoodNameWednesday);
        jPanel.add(dayNameWednesday);

        this.add(jPanel);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
