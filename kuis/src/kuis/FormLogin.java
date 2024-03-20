package kuis;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormLogin extends JFrame{
    JLabel labelNama, labelPassword;
    JTextField fieldNama, fieldPassword;

    JButton bmasuk;
    FormLogin(){
        setTitle("Menu login");
        //label nama pass
        labelNama = new JLabel ("Nama");
        labelPassword = new JLabel ("password");
        //field nama pass
        fieldNama = new JTextField ();
        fieldPassword = new JTextField ();
        // tombol masuk
        bmasuk = new JButton ("masuk");
      
        setLayout(null);
        add(labelNama);
        add(labelPassword);
        add(fieldNama);
        add(fieldPassword);
        add(bmasuk);
    
    
        labelNama.setBounds(15, 60, 150, 30);
        labelPassword.setBounds(15, 90, 150, 30);
        
        fieldNama.setBounds(170, 60, 150, 30);
        fieldPassword.setBounds(170, 90, 150, 30);
    
        bmasuk.setBounds(170, 150, 150, 30);
       
       // cek username dan password 
        bmasuk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String namauser = fieldNama.getText();
                    String passworduser = fieldNama.getText();
                    String nama = "tukang_109";
                    String password = "tukang_109";

                    if (namauser.equals(nama) && passworduser.equals(password)) {
                        dispose();
                        new FormHitung(namauser, passworduser).setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Nama pengguna atau password salah!");
                    }
                } catch (HeadlessException ex) {
                    JOptionPane.showMessageDialog(null, "Terjadi kesalahan!");
                }
            }
        });

        
    setSize(400, 300);
	setVisible(true);
    setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
