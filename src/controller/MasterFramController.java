package controller;

import UICmpack.MainPage;
import UICmpack.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.lang.reflect.Method;

public class MasterFramController implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Method method = this.getClass().getDeclaredMethod(e.getActionCommand());
            method.invoke(this);
        } catch (Exception error) {
            System.out.println("مشکل در سیستم بوجود امده است لطفا دوباره متصل شوید");
        }
    }

    public void Login() throws IOException, ClassNotFoundException {
        if (UI.DM.IsAuthenticationUsername(UI.getjTextFieldUserName().getText()).equals("ok")) {
            if (UI.DM.IsAuthenticationPassword(UI.getjTextFieldPassword().getText()).equals("ok"))
            {
                MainPage mainPage = new MainPage(UI.DM);
            } else
            {
                System.out.println("Password is not Correct .....");
            }
        }else
        {
            System.out.println("Username not Found .....");
        }
    }

    public void ForgetPassword() {
        System.out.println(UI.getjTextFieldPassword().getText());
        System.out.println(UI.getjTextFieldUserName().getText());
        UI.setjTextFieldUserName("This not implement");
    }
}
