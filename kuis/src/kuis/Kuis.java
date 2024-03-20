package kuis;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Kuis {
    
    static class BLayout extends JFrame {
        JButton bLogin;
        JLabel lhead;

        public BLayout() {
            setTitle("PT Ukang");
            bLogin = new JButton("Login");
            lhead = new JLabel("Selamat Datang : ");
            
            bLogin.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    new FormLogin().setVisible(true);
                    dispose();
                }
            });
            
            setLayout(new BorderLayout());
            add(bLogin, BorderLayout.SOUTH);
            add(lhead, BorderLayout.NORTH);
            
            pack();
            setVisible(true);
            setLocationRelativeTo(null);
            setSize(200, 100);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    
    public static void main(String[] args) {
        BLayout xx = new BLayout();
    }
}
