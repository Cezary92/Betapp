import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class PierwszaStrona implements ActionListener {

    JFrame frame = new JFrame();
    JButton myButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("Login:");
    JLabel userPasswordLabel = new JLabel("Hasło:");
    JLabel sLabel = new JLabel();
    JLabel messageLabel = new JLabel();






    HashMap<String, String> logininfo = new HashMap<String, String>();

    PierwszaStrona(HashMap<String, String> logininfoOrginal){

        logininfo = logininfoOrginal;

        userIDLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);
        sLabel.setBounds(420, 420, 1, 1);

        messageLabel.setBounds(125, 259, 250, 35);
        messageLabel.setFont(new Font(null, Font.ITALIC, 25 ));

        userIDField.setBounds(125, 100, 200,25);
        userPasswordField.setBounds(125, 150, 200,25);

        myButton.setBounds(125, 200, 100,25);
        myButton.setFocusable(false);
        myButton.addActionListener(this);

        resetButton.setBounds(225, 200, 100,25);
        resetButton.addActionListener(this);


        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(myButton);
        frame.add(resetButton);
        frame.add(sLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setTitle("Bet app");
        ImageIcon image = new ImageIcon("ikon2.jpg");
        frame.setIconImage(image.getImage());


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==resetButton){
            userIDField.setText("");
            userPasswordField.setText("");

        }

        if(e.getSource()==myButton){
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if(logininfo.containsKey(userID)){
                if(logininfo.get(userID).equals(password)){
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Zalogowano");
                    frame.dispose();
                    Ramka ramka = new Ramka();
                }
                else{
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Złe hasło!");
                }
            }
            else{
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Nie znaleziono loginu");
            }
        }

    }


}
