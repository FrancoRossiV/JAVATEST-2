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
import main.ClienteChat;

/**
 *
 * @author DELL
 */
public class MiVentana extends JFrame{
    JTextArea area;
    
    //-- LE AGREGAMOS TODO A LA VENTANA MEDIANTE EL CONSTRUCTOR
public MiVentana(){
IniciarVentana();
IniciarComponentes();
setVisible(true);
ClienteChat clienteChat = new ClienteChat("192.168.61.11","2000",area);
clienteChat.conectar();

}



    public void IniciarVentana() {
    setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
    setSize(500,500); 
    setLayout(null);
    setTitle("ola");
            
    
    setResizable(false);
    }

    
    public void IniciarComponentes() {
    ////AREA////    
    area = new JTextArea();
    area.setEditable(false);
    
    area.setBounds(10, 10, 470, 300);
    add(area);
    
    ////TEXTFIELD////
    JTextField texto = new JTextField();
    texto.setBounds(10,320,470,15);
    texto.setText("Escriba aquí");

            

    add(texto);
    
    
    
    ////BOTON////
    JButton boton = new JButton();
    boton.setText("Copiar");
    JButton boton2 = new JButton();
    boton2.setText("Borrar");
    
    boton.setBounds(130, 415, 100, 30);
    boton2.setBounds(240, 415, 100, 30);
    
    add(boton);
    add(boton2);
    
    ////FUNCIONES DEL BOTON////
    boton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            String txt = texto.getText();
            area.append("FrancoRossiV: " + txt); 
            area.append(System.getProperty("line.separator"));
            }
         });
    
       boton2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae2) {
            texto.setText("Escriba Aqui");
            area.setText("");
            }
         });  
       
    ////CHECKBOTON////
    JCheckBox check = new JCheckBox("Activar para escribir arriba");
    check.setBounds(142, 370, 220, 23);
    add(check);
    
      check.addItemListener(new ItemListener(){
    @Override
    public void itemStateChanged(ItemEvent e) 
    {
    if(e.getStateChange()==ItemEvent.SELECTED){
      //Acción cuando está seleccionado
      String txt2 = texto.getText();
      area.setText("");
      area.append(texto.getName());
      area.append(System.getProperty("line.separator"));
      area.append(txt2);
      
      
      
     }
    }
    });
    
       
   ////SCROLL////
    JScrollPane scroll = new JScrollPane(area);
    scroll.setBounds(10, 10, 470, 300);
    add(scroll);
    
    scroll.setVisible(true);
    
    
    ////COLOR////
    Color c=Color.RED;
    getContentPane().setBackground(c);
    

    setVisible( true);      

        
    }
 


    
    
    
    
    
    
    
    
    
    
    
    
}
