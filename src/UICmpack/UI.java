package UICmpack;

import controller.MasterFramController;
import example.DeployingMethods;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class UI {
    public static JTextField getjTextFieldUserName() {
        return jTextFieldUserName;
    }

    public static void setjTextFieldUserName(String jTextFieldUserName) {
        UI.jTextFieldUserName.setText(jTextFieldUserName);
    }

    public static JTextField getjTextFieldPassword() {
        return jTextFieldPassword;
    }

    public static void setjTextFieldPassword(String jTextFieldPassword) {
        UI.jTextFieldPassword.setText(jTextFieldPassword);
    }

    private static JTextField jTextFieldUserName = new JTextField(10);
    private static JPasswordField jTextFieldPassword = new JPasswordField(10);

    public static DeployingMethods DM = null;

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        DM = new DeployingMethods("Hello","1.0.0.0");
        final int BaseVertically = 150;
        final int BaseHorizontally = 150;

        MasterFramController masterFramController = new MasterFramController();

        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();


        jFrame.setBounds(550, 100, 400, 400);
        jFrame.setPreferredSize(new Dimension(300, 200));
        jFrame.setTitle("سامانه رزرو غذا");
        jFrame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                titleAlign(jFrame);
            }

            private void titleAlign(JFrame jFrame) {
                Font font = jFrame.getFont();

                String currentTitle = jFrame.getTitle().trim();
                FontMetrics fm = jFrame.getFontMetrics(font);
                int frameWidth = jFrame.getWidth();
                int titleWidth = fm.stringWidth(currentTitle);
                int spaceWidth = fm.stringWidth(" ");
                int centerPos = (frameWidth / 2) - (titleWidth / 2);
                int spaceCount = centerPos / spaceWidth;
                String pad = "";
                pad = String.format("%" + (spaceCount - 14) + "s", pad);
                jFrame.setTitle(pad + currentTitle);
            }

        });
        jPanel.setLayout(null);
        jPanel.setBackground(Color.getHSBColor(288, 90, 89));

        File file = new File("src\\UICmpack\\assert\\Amirkabir.png");
        BufferedImage bufferedImage = ImageIO.read(file);
        ImageIcon imageIcon = new ImageIcon(bufferedImage);
        jFrame.setIconImage(imageIcon.getImage());
        JLabel labelLogo = new JLabel();
        labelLogo.setBounds(BaseHorizontally + 20, BaseHorizontally - 140, 200, 120);
        labelLogo.setIcon(imageIcon);
        jPanel.add(labelLogo);

        JButton jButtonLogin = new JButton("ورود");
        jButtonLogin.addActionListener(masterFramController);
        jButtonLogin.setActionCommand("Login");
        jButtonLogin.setBounds(BaseVertically, BaseHorizontally + 80, 100, 20);
        jPanel.add(jButtonLogin);

        JButton jButtonForgetPassword = new JButton("فراموشی رمز عبور");
        jButtonForgetPassword.addActionListener(masterFramController);
        jButtonForgetPassword.setActionCommand("ForgetPassword");
        jButtonForgetPassword.setBounds(BaseVertically - 10, BaseHorizontally + 120, 120, 20);
        jPanel.add(jButtonForgetPassword);


        JLabel UserNameLabel = new JLabel("نام کاربری");
        jTextFieldUserName.setBounds(BaseVertically, BaseHorizontally, 100, 20);
        UserNameLabel.setLabelFor(jTextFieldUserName);
        UserNameLabel.setDisplayedMnemonic('E');
        UserNameLabel.setBounds(BaseVertically + 55, BaseHorizontally - 20, 100, 20);

        JLabel PasswordLabel = new JLabel("رمز عبور");
        jTextFieldPassword.setBounds(BaseVertically, BaseHorizontally + 40, 100, 20);
        PasswordLabel.setLabelFor(jTextFieldPassword);
        PasswordLabel.setDisplayedMnemonic('E');
        PasswordLabel.setBounds(BaseHorizontally + 60, BaseHorizontally + 20, 100, 20);

        jPanel.add(UserNameLabel);
        jPanel.add(jTextFieldUserName);
        jPanel.add(PasswordLabel);
        jPanel.add(jTextFieldPassword);

        jFrame.add(jPanel);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
