/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.ejercicio26.viewa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author DAW1
 */
public class FrmGameZoneRegistro extends JFrame{
    private Dimension dmVentana = new Dimension(520,490);
    private JLabel lblTitulo = new JLabel("GAME ZONE");
    private JLabel lblGamer= new JLabel("GAMERTAG");
    private JTextField txtGamer = new JTextField();
    private JLabel lblEmail= new JLabel("EMAIL");
    private JTextField txtEmail = new JTextField();
    private JLabel lblContraseña= new JLabel("PASSWORD");
    private JPasswordField txtContraseña = new JPasswordField();
    
    private JButton btnRegistrar = new JButton("REGISTRAR");
    private JButton btnCancelar = new JButton("Cancelar");

    private final Color COLOR_VERDE = new Color(0, 255,170);  
    private final Color COLOR_ROJO = new Color(255, 67, 67);
    private final Color COLOR_GRIS_OSCURO = new Color(24,24,36);  
    private final Color COLOR_GRIS = new Color(44,44,64); 
    private final Color COLOR_BLANCO = new Color(255,255,255); 
    private final Font FUENTE_TITULO=new Font("Impact",Font.BOLD,32);
    private final Font FUENTE=new Font("Impact",Font.PLAIN,18);
    private JPanel pnlDatos = new JPanel(new GridLayout(0,1));
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.CENTER));
    
    public FrmGameZoneRegistro() {
        this.setSize(dmVentana);
        this.setTitle("GameZone Registro");
        
        lblTitulo.setBackground(COLOR_GRIS);
        lblTitulo.setOpaque(true);
        lblTitulo.setForeground(COLOR_VERDE);
        lblTitulo.setFont(FUENTE_TITULO);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        this.add(lblTitulo, BorderLayout.NORTH);
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
        lblTitulo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, COLOR_VERDE));
        lblGamer.setFont(FUENTE);
        lblGamer.setForeground(COLOR_VERDE);
        pnlDatos.add(lblGamer);
        txtGamer.setBorder(BorderFactory.createMatteBorder(1, 2, 1, 1, COLOR_VERDE));
        txtGamer.setBackground(COLOR_GRIS);
        txtGamer.setForeground(COLOR_BLANCO);
        pnlDatos.add(txtGamer);
        lblEmail.setFont(FUENTE);
        lblEmail.setForeground(COLOR_VERDE);
        pnlDatos.add(lblEmail);
        txtEmail.setBorder(BorderFactory.createMatteBorder(1, 2, 1, 1, COLOR_VERDE));
        txtEmail.setBackground(COLOR_GRIS);
        txtEmail.setForeground(COLOR_BLANCO);
        pnlDatos.add(txtEmail);
        lblContraseña.setFont(FUENTE);
        lblContraseña.setForeground(COLOR_VERDE);
        pnlDatos.add(lblContraseña);
        txtContraseña.setBorder(BorderFactory.createMatteBorder(1, 2, 1, 1, COLOR_VERDE));
        txtContraseña.setBackground(COLOR_GRIS);
        txtContraseña.setForeground(COLOR_BLANCO);
        pnlDatos.add(txtContraseña);
        
        pnlDatos.setBackground(COLOR_GRIS_OSCURO);
        pnlDatos.setBorder(BorderFactory.createEmptyBorder(10,30,20,30));
        this.add(pnlDatos, BorderLayout.CENTER);
        
        btnRegistrar.setBackground(COLOR_VERDE);
        btnRegistrar.setSize(15, 15);
        btnCancelar.setBackground(COLOR_ROJO);
        pnlBotones.setBackground(COLOR_GRIS_OSCURO);
        pnlBotones.add(btnRegistrar);
        pnlBotones.add(btnCancelar);
        pnlBotones.setBorder(BorderFactory.createEmptyBorder(10,30,10,30));
        this.add(pnlBotones, BorderLayout.SOUTH);
        
        
        
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);     
        this.setLocationRelativeTo(null);
    }
    
    
    
}
