/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeraventana;
import javax.swing.*;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
/**
 *
 * @author DELL
 */
public class Usuario extends JFrame{
 
 public Usuario(){
    IniciarVentana();
    IniciarComponentes();
    setVisible(true);

}
 
    ////VENTANA////
    public void IniciarVentana() {
    setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
    setSize(300,200); 
    setLayout(null);
    setTitle("Inicio de Sesión");
    
    setResizable(false);
    }
    
    
    public void IniciarComponentes() {
    ////TEXTO////
    JTextField texto = new JTextField();
    texto.setBounds(20, 40, 150, 30);
    texto.setText("Usuario");
    
    JPasswordField texto2 = new JPasswordField();
    texto2.setBounds(20, 90, 150, 30);
    texto2.setText("Contraseña");
            

    add(texto);
    add(texto2);
    
    
    
        ////BOTON////
    JButton boton = new JButton();
    boton.setText("Ingresar");
    boton.setBounds(190, 40, 90, 30);
    
    
    add(boton);
    
    
    
        ////FUNCIONES DEL BOTON////
    boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            if (texto.getText().equals("FrancoRossiV") && texto2.getText().equals("qwerty")){
                String nombre = "FrancoRossiV";
                MiVentana ventana = new MiVentana();
                ventana.IniciarVentana();
                dispose();
                
            }else{
                System.out.println("ERROR");
            }
         };
    
        
    });

    
    
    setVisible(true);
    }
    

    
    
    
    
/*    JTextField username = new JTextField();
    JTextField password = new JPasswordField();
    Object[] message = {
       "Username:", username,
       "Password:", password
    };

    int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
    if (option == 0) {
        if (username.getText().equals("h") && password.getText().equals("h")) {
            System.out.println("Login successful");
        } else {
            System.out.println("login failed");
        }
    } else {
        System.out.println("Login canceled");
    }


    */
    

    
}
