package kuis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormHitung extends JFrame{
    JLabel labelAlas, labelTinggi, labelHasil;
    JTextField fieldAlas, fieldTinggi;
    JButton bHitung;
    public FormHitung(String a, String b){
        setTitle("Menu Hitung");
        // label alas dan tinggi
        labelAlas = new JLabel("Alas");
        labelTinggi = new JLabel("Tinggi");
        labelHasil = new JLabel("Hasil:");

        //field alas dan tinggi
        fieldAlas = new JTextField();
        fieldTinggi = new JTextField();
        bHitung = new JButton("Hitung");

        setLayout(null);
        add(labelAlas);
        add(labelTinggi);
        add(labelHasil);
        add(fieldAlas);
        add(fieldTinggi);
        add(bHitung);
        
        labelAlas.setBounds(15, 60, 150, 30);
        labelTinggi.setBounds(15, 90, 150, 30);
        labelHasil.setBounds(15, 150, 150, 30);

        fieldAlas.setBounds(170, 60, 150, 30);
        fieldTinggi.setBounds(170, 90, 150, 30);
    
        bHitung.setBounds(170, 180, 100, 30);
        //hitung sisi miring
        bHitung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double alas = Double.parseDouble(fieldAlas.getText());
                    double tinggi = Double.parseDouble(fieldTinggi.getText());
                    double sisimiring = Math.sqrt((alas*alas) + (tinggi*tinggi));
                    labelHasil.setText("Hasil\t\t\t : " + sisimiring);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid untuk alas dan tinggi!");
                }
            }
        });

        setSize(400, 550);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new FormHitung("", "");
    }
}
