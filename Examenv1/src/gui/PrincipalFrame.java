/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import static javafx.scene.paint.Color.color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author Rafael
 */
public class PrincipalFrame extends JFrame {
    
    private JButton btnVentana;
    private Dialogvtn otraventana;
   
     
        
    public PrincipalFrame(){
        super("Clase");
        super.setSize(500, 400);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new FlowLayout());
        
        otraventana = new Dialogvtn(this);
        btnVentana = new JButton("Ventana");
        btnVentana.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                otraventana.setVisible(true);
            }
        });
        
        super.add(btnVentana);
        
        super.setVisible(true);
    }
    
    
    
    
    private JMenuBar createMenu(){
        JMenuBar menu = new JMenuBar();
        
        JMenu mmArchivo = new JMenu("Archivo");
        
        JMenuItem nnSalir = new JMenuItem("Salir");
        mmArchivo.add(nnSalir);  
        nnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
        JMenu mmAiuda = new JMenu("Ayuda");
        JMenuItem nnAbout = new JMenuItem("Acerca...");
        mmAiuda.add(nnAbout);
  
        menu.add(mmArchivo);
        menu.add(mmAiuda);
        
        return menu;
    }
    
}
