/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author Rafael
 */
public class RegisterDialog extends JFrame {

    private final TextField txtUsuario;
    private final JPasswordField txtContrasena;
    private final JLabel lblRol;
    private final JLabel lblUsuario;
    private final JLabel lblContrasena;
    private final JButton bttSalir;
    private final JButton bttIngresar;
    private final JPanel pnlFoto;
    private final JPanel pnlEnmedio;
    private final JPanel pnlBotones;
    private final String[] Roles = {"", "Alumno", "Docente"};
    private final JComboBox ListaRoles;
    private LoginFoto foto;

    public RegisterDialog() {
        super.setSize(750, 220);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setTitle("LOGIN");
        super.getContentPane().setBackground(Color.WHITE);
        super.setLocationRelativeTo(null);
        super.setLayout(new BorderLayout());

        //*--------------
        foto = new LoginFoto();
        pnlFoto = new JPanel();
        pnlFoto.add(foto,BorderLayout.NORTH);
        pnlFoto.setBackground(Color.white);
        
        //*-------------
        pnlEnmedio = new JPanel();
        pnlEnmedio.setBackground(Color.white);

        lblUsuario = new JLabel("Usuario: ");
        txtUsuario = new TextField(15);

        lblContrasena = new JLabel("Contraseña: ");
        txtContrasena = new JPasswordField(15);

        lblRol = new JLabel("Rol: ");
        ListaRoles = new JComboBox(Roles);
        ListaRoles.setBackground(Color.white);

        pnlEnmedio.add(foto);
        pnlEnmedio.add(lblUsuario);
        pnlEnmedio.add(txtUsuario);
        pnlEnmedio.add(lblContrasena);
        pnlEnmedio.add(txtContrasena);
        pnlEnmedio.add(lblRol);
        pnlEnmedio.add(ListaRoles);

        //*-------------
        pnlBotones = new JPanel();
        pnlBotones.setBackground(Color.CYAN);

        bttSalir = new JButton("Salir");
        bttSalir.setFont(new Font("Courier New",Font.BOLD,14));
        bttSalir.setForeground(Color.WHITE);
        bttSalir.setBackground(Color.DARK_GRAY);
        bttSalir.addActionListener((ActionEvent ae) -> {
            System.exit(0);
        });

        bttIngresar = new JButton("Ingresar");
        bttIngresar.setBackground(Color.DARK_GRAY);
        bttIngresar.setFont(new Font("Courier New",Font.BOLD,14));
        bttIngresar.setForeground(Color.WHITE);
        
        JButton bttRegistro = new JButton("Registrar");
        bttRegistro.setBackground(Color.DARK_GRAY);
        bttRegistro.setFont(new Font("Courier New",Font.BOLD,14));
        bttRegistro.setForeground(Color.WHITE);
      

        pnlBotones.add(bttIngresar);
        pnlBotones.add(bttRegistro);
        pnlBotones.add(bttSalir);

        super.add(pnlFoto,BorderLayout.NORTH);
        super.add(pnlEnmedio,BorderLayout.CENTER);
        super.add(pnlBotones, BorderLayout.PAGE_END);

        super.setVisible(true);
    }

}

