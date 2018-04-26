/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Rafael
 */
public class LoginFoto extends JPanel{
    private JLabel photo;
    
    public LoginFoto(){
       super();
       super.setLayout(new BorderLayout());
       
       photo = new JLabel();
       this.cagarIcono("/images/user (1).png", photo);
       super.add(photo,BorderLayout.NORTH);
    }
    private void cagarIcono(String Path,JLabel lbl){
        URL url = System.class.getResource(Path);
        ImageIcon im = new ImageIcon(url);
        lbl.setIcon(im);
    }
}
