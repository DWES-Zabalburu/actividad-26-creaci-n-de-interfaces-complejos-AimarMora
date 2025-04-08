/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.ejercicio26.viewa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author DAW1
 */
public class FrmVentana extends JFrame{
    private Dimension dmVentana = new Dimension(520,490);
    private JLabel lblTitulo = new JLabel("Actualiza tu Perfil");
    private JLabel lblNombre= new JLabel("Nombre Completo");
    private JTextField txtNombre = new JTextField();
    private JLabel lblCorreo= new JLabel("Correo electrónico");
    private JTextField txtCorreo = new JTextField();
    private JLabel lblTelefono= new JLabel("Telefono");
    private JTextField txtTelefono = new JTextField();
    private JLabel lblDireccion= new JLabel("Direccion");
    private JTextField txtDireccion = new JTextField();
    private JLabel lblWeb= new JLabel("Sitio Web");
    private JTextField txtWeb = new JTextField();
    
    private JButton btnCancelar = new JButton("Cancelar");
    private JButton btnGuardar = new JButton("Guardar Cambios");
    
    private JPanel pnlDatos = new JPanel(new GridLayout(0,1));
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    private final Font FUENTE=new Font("Arial",Font.ITALIC,16);
    
    private final Color COLOR_AZUL = new Color(0, 120, 191);
    private final Color COLOR_BLANCO = new Color(255, 255, 255);
    private final Color COLOR_GRIS = new Color(159,163,165);
    
    public FrmVentana() {
        this.setSize(dmVentana);
        this.setTitle("Ventana Principal");
        
        lblTitulo.setFont(new Font("Arial",Font.BOLD,24));
        lblTitulo.setHorizontalAlignment(JLabel.LEFT);
        lblTitulo.setForeground(new Color(255,255,255));
        lblTitulo.setBackground(COLOR_AZUL);
        lblTitulo.setOpaque(true);
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        this.add(lblTitulo, BorderLayout.NORTH);  
        
        txtNombre.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, COLOR_AZUL));
        txtCorreo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, COLOR_AZUL));
        txtDireccion.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, COLOR_AZUL));
        txtTelefono.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, COLOR_AZUL));
        txtWeb.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, COLOR_AZUL));
        
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        pnlDatos.add(lblCorreo);
        pnlDatos.add(txtCorreo);
        pnlDatos.add(lblTelefono);
        pnlDatos.add(txtTelefono);
        pnlDatos.add(lblDireccion);
        pnlDatos.add(txtDireccion);
        pnlDatos.add(lblWeb);
        pnlDatos.add(txtWeb);
        
        pnlDatos.setForeground(new Color(72, 72, 72));
        pnlDatos.setBackground(new Color(250,250,250));
        pnlDatos.setBorder(BorderFactory.createEmptyBorder(20,20,40,20));
        this.add(pnlDatos, BorderLayout.CENTER);
        
        
        btnCancelar.setBackground(COLOR_GRIS);
        btnCancelar.setForeground(COLOR_BLANCO);
        btnGuardar.setBackground(COLOR_AZUL);
        btnGuardar.setForeground(COLOR_BLANCO);
        pnlBotones.add(btnGuardar);
        pnlBotones.add(btnCancelar);
       
        this.add(pnlBotones, BorderLayout.SOUTH);


        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);     
        this.setLocationRelativeTo(null);
    }

   
}
