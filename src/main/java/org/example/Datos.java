package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Datos {
    private JTextField Nota1Usuario;
    private JTextField NombreUsuario;
    private JTextField CedulaUsuario;
    private JTextField Nota2Usuario;
    private JTextField EdadUsuario;
    private JTextField TelefonoUsuario;
    private JButton registrarButton;
    private JLabel PromedioLabel;
    public JPanel mainPanel;

    public Datos() {
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre=NombreUsuario.getText();
                String cedula=CedulaUsuario.getText();
                double nota1=Double.parseDouble(Nota1Usuario.getText());
                int edad=Integer.parseInt(EdadUsuario.getText());
                String telefono=TelefonoUsuario.getText();
                double nota2=Double.parseDouble(Nota2Usuario.getText());
                double promedio=(nota1+nota2)/2;
                ESTUDIANTE est1=new ESTUDIANTE();
                est1.setNombre(nombre);
                est1.setCedula(cedula);
                est1.setEdad(edad);
                est1.setTelefono(telefono);
                est1.setNota1(nota1);
                est1.setNota2(nota2);
                PromedioLabel.setText("Promedio: "+String.format("%.2f", promedio));
            }
        });
    }
}
