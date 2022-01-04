package example;

import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;

public class DeployingMethods implements RMICustomized, Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private static String BindName;
    private static String SUID;
    private final RMICustom rmiCustomerPublic;

    public DeployingMethods(String bindName , String SUId) throws IOException, ClassNotFoundException {
        BindName = bindName;
        SUID = SUId;
        rmiCustomerPublic = new RMICustom(BindName , SUID);
    }

    @Override
    public int DecreaseCreditCard(int x) throws IOException, ClassNotFoundException {

        return (int) rmiCustomerPublic.getMethodName(new Throwable()
                .getStackTrace()[0]
                .getMethodName(), x);
    }

    @Override
    public int IncreaseCreditCard(int x) throws IOException, ClassNotFoundException {
        return (int) rmiCustomerPublic.getMethodName(new Throwable()
                .getStackTrace()[0]
                .getMethodName(), x);
    }

    @Override
    public double DecreaseCreditCard(double x) throws IOException, ClassNotFoundException {
        return (double) rmiCustomerPublic.getMethodName(new Throwable()
                .getStackTrace()[0]
                .getMethodName(), x);
    }

    @Override
    public double IncreaseCreditCard(double x) throws IOException, ClassNotFoundException {
        return (double) rmiCustomerPublic.getMethodName(new Throwable()
                .getStackTrace()[0]
                .getMethodName(), x);
    }

//    @Override
//    public String setName(String x) throws IOException {
//        return rmiCustomerPublic.getMethodName(new Throwable()
//                .getStackTrace()[0]
//                .getMethodName());
//    }

    @Override
    public boolean IsValid() throws IOException {
        return false;
    }

    @Override
    public String IsAuthenticationUsername(String Username) throws IOException, ClassNotFoundException {
        return (String) rmiCustomerPublic.getMethodName(new Throwable()
                .getStackTrace()[0]
                .getMethodName(), Username);
    }
    @Override
    public String IsAuthenticationPassword(String Password) throws IOException, ClassNotFoundException {
        return (String) rmiCustomerPublic.getMethodName(new Throwable()
                .getStackTrace()[0]
                .getMethodName(), Password);
    }

    @Override
    public String GetCostFood(String FoodName) throws IOException, ClassNotFoundException {
        return (String) rmiCustomerPublic.getMethodName(new Throwable()
                .getStackTrace()[0]
                .getMethodName(), FoodName);
    }

    @Override
    public String GetNameFood(String DayName) throws IOException, ClassNotFoundException {
        return (String) rmiCustomerPublic.getMethodName(new Throwable()
                .getStackTrace()[0]
                .getMethodName(), DayName);
    }

    @Override
    public int GetCurrentAmount(int x) throws IOException, ClassNotFoundException {
        return (int) rmiCustomerPublic.getMethodName(new Throwable()
                .getStackTrace()[0]
                .getMethodName(),0);
    }

    @Override
    public String GetFamilyName(String name) throws IOException, ClassNotFoundException {
        return (String) rmiCustomerPublic.getMethodName(new Throwable()
                .getStackTrace()[0]
                .getMethodName(),"FamilyName");
    }

    @Override
    public double GetTotalCalories(double c) throws IOException, ClassNotFoundException {
        return (double) rmiCustomerPublic.getMethodName(new Throwable()
                .getStackTrace()[0]
                .getMethodName(),c);
    }

    @Override
    public String IsServerRMI(String BindName) throws IOException, ClassNotFoundException {
        return (String) rmiCustomerPublic.getMethodName(new Throwable()
                .getStackTrace()[0]
                .getMethodName(),BindName);
    }
}
