/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonatanjavier
 */
public class Main {

    private Connection cn;
    private final String bd="saludguru";
    private final String usuario="root";
    private final String pass="root";
    
    public void conectar() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+bd,usuario,pass);
            System.out.println("Conexion Exitosa");
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error Al Conectar: "+ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new Main().conectar();
    }
}
