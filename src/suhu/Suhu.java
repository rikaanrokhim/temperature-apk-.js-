/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhu;

/**
 *
 * @author lenovo
 */

import javax.swing.*;
import java.awt.event.*;

public class Suhu extends JFrame {

    public Suhu() {
        super("Aplikasi Konversi Suhu");
                setSize(400,320);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        JPanel panel = new JPanel();
       
        JLabel label1 = new JLabel("Celcius         : ");
        JLabel label2 = new JLabel("Fahrenheit   : ");
        JLabel label3 = new JLabel("Reamur        : ");
        JLabel label4 = new JLabel("Kelvin            : ");
       
        JTextField txt1 = new JTextField();
        txt1.setEnabled(true);
        JTextField txt2 = new JTextField();
        txt2.setEnabled(false);
        JTextField txt3 = new JTextField();
        txt3.setEnabled(false);
        JTextField txt4 = new JTextField();
        txt4.setEnabled(false);
       
        JButton btn1 = new JButton("Batal");
        JButton btn2 = new JButton("Convert");
       
        label1.setBounds(75,40,150,30);
        label2.setBounds(75,90,150,30);
        label3.setBounds(75,140,150,30);
        label4.setBounds(75,190,150,30);
        txt1.setBounds(165,40,150,30);
        txt2.setBounds(165,90,150,30);
        txt3.setBounds(165,140,150,30);
        txt4.setBounds(165,190,150,30);
        btn1.setBounds(100,235,90,30);
        btn2.setBounds(200,235,90,30);
       
        panel.setLayout(null);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(txt1);
        panel.add(txt2);
        panel.add(txt3);
        panel.add(txt4);
        panel.add(btn1);
        panel.add(btn2);
        add(panel);
       
        btn2.setToolTipText("Harap masukkan nilai Celcius");
       
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed (ActionEvent e){
                    JOptionPane.showMessageDialog (null,"Keluar");
                    System.exit(0);
            }
        });
               
        btn2.addActionListener(new ActionListener(){
             int r,f,k,c;
             public void actionPerformed (ActionEvent e){
                 try{
                     c = Integer.parseInt(txt1.getText());
                     f = (((9*c)/5)+32);
                     r = 4*c/5;
                     k = (c+273);
                     txt1.setText(c+" C");
                     txt2.setText(f+" F");
                     txt3.setText(r+" R");
                     txt4.setText(k+" K");
                 }
                 catch (Exception ex) {
                     JOptionPane.showMessageDialog (null,"Harap masukkan nilai Celcius");
                 }
             }
        });
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main (String []Args) {
        Suhu app = new Suhu();
    }
}
