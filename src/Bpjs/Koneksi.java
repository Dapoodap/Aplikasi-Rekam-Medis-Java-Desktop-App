/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bpjs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DaffaRadhitya
 */
public class Koneksi {
    public Connection getConnection(){
    Connection kon = null;
        try {
            kon = DriverManager.getConnection("jdbc:mysql://localhost/pbouas","root","");
            JOptionPane.showMessageDialog(null, "Koneksi Sukses");
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Koneksi Gk Sukses");
        }
    return kon;
    }
    
}
