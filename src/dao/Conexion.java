/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Manuel
 */
public class Conexion {
    
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String TIPO = "jdbc:postgresql://";
    private String server;
    private String puerto;
    private String user;
    private String pass;

    public Conexion(String server, String puerto, String user, String pass) {
        this.server = server;
        this.puerto = puerto;
        this.user = user;
        this.pass = pass;
    }

    public Connection connect() throws Exception {
        Connection c = null;
        try {
            Class.forName(DRIVER);
            c = DriverManager.getConnection(TIPO + this.server + ":" + this.puerto
                    + "/" , this.user, this.pass);
            System.out.println("Se conecto");
            return c;
        } catch (Exception e) {
            throw e;
        }
    }
}
