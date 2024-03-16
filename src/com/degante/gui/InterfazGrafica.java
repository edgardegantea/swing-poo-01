package com.degante.gui;

import javax.swing.*;

public class InterfazGrafica {

    public static void main(String[] args) {

        Persona persona = new Persona();

        JFrame jFrame = new JFrame("Persona");
        jFrame.setSize(600, 400);
        jFrame.setLayout(null);

        // Etiqueta para el nombre
        JLabel jLabelNombre = new JLabel();
        jLabelNombre.setText("Ingrese su nombre: ");
        jLabelNombre.setBounds(10, 10, 230, 15);
        jFrame.add(jLabelNombre);

        // TextField para ingresar el nombre
        JTextField jtfNombre = new JTextField();
        jtfNombre.setBounds(10, 42, 230, 25);
        jFrame.add(jtfNombre);



        // Etiqueta para el Apellidos
        JLabel jLabelApellidos = new JLabel();
        jLabelApellidos.setText("Ingrese sus apellidos: ");
        jLabelApellidos.setBounds(260, 10, 230, 15);
        jFrame.add(jLabelApellidos);

        // TextField para ingresar apellidos
        JTextField jtfApellidos = new JTextField();
        jtfApellidos.setBounds(260, 42, 230, 25);
        jFrame.add(jtfApellidos);



        // Etiqueta para el Telefono
        JLabel jLabelTelefono = new JLabel();
        jLabelTelefono.setText("Ingrese su número de teléfono: ");
        jLabelTelefono.setBounds(10, 80, 230, 15);
        jFrame.add(jLabelTelefono);

        // TextField para ingresar el Telefono
        JTextField jtfTelefono = new JTextField();
        jtfTelefono.setBounds(10, 110, 230, 25);
        jFrame.add(jtfTelefono);


        // Etiqueta para el Email
        JLabel jLabelEmail = new JLabel();
        jLabelEmail.setText("Ingrese su Email: ");
        jLabelEmail.setBounds(260, 80, 230, 15);
        jFrame.add(jLabelEmail);

        // TextField para ingresar el Email
        JTextField jtfEmail = new JTextField();
        jtfEmail.setBounds(260, 110, 230, 25);
        jFrame.add(jtfEmail);



        // Etiqueta para el Direccion
        JLabel jLabelDireccion = new JLabel();
        jLabelDireccion.setText("Ingrese su dirección: ");
        jLabelDireccion.setBounds(10, 150, 230, 15);
        jFrame.add(jLabelDireccion);

        // TextField para ingresar el Direccion
        JTextField jtfDireccion = new JTextField();
        jtfDireccion.setBounds(10, 180, 230, 25);
        jFrame.add(jtfDireccion);


        JButton btnAceptar = new JButton();
        btnAceptar.setText("Aceptar");
        btnAceptar.setBounds(450, 360, 140, 30);
        btnAceptar.addActionListener(e -> {
            String nombrePersona = jtfNombre.getText();
            persona.setNombre(nombrePersona);
            JOptionPane.showMessageDialog(null, persona.getNombre());
        });
        jFrame.add(btnAceptar);

        jFrame.setVisible(true);
    }


}
