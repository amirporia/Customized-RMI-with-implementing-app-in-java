package example;

import java.io.Serializable;

public class UserFeature implements Serializable {
    public String Username;
    public String Password;
    public UserFeature(String UsernameUser,String PasswordUser)
    {
        Username = UsernameUser;
        Password = PasswordUser;
    }
}
