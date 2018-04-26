/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Rafael
 */
public class Dialogvtn extends JDialog{
    
    private JButton aceptar;
    private JButton cancelar;
    private JTextField editxt;
    
    public Dialogvtn(JFrame parent){
        super(parent,"Ventana",true);
        super.setSize(300,400);
        super.setResizable(false);
        super.setLocationRelativeTo(null);
        
        super.setLayout(new FlowLayout());
        aceptar = new JButton("OK");
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
               //listener.  
                Dialogvtn.this.setVisible(false);

            }
        });
        
        cancelar = new JButton("CANCELAR");
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Dialogvtn.this.setVisible(false);
            }
        });
        editxt = new JTextField(10);
        
        super.add(aceptar);
        super.add(cancelar);
        super.add(editxt);
    }
    
    public void mostrar(){
        
        super.setVisible(true);
        
    }
}
