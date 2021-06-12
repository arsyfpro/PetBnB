/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kode;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Reservasi implements InterfaceAmbilDataRiwayat {
    private PreparedStatement pst = null;
    private Connection cn = koneksi.Koneksi.Koneksi();
    
    @Override
    public ResultSet ambilData(int id_u) {
        ResultSet rs = null;
        
        try {
            String sql = "SELECT * FROM pesanan WHERE id_user = '"+id_u+"'";
            
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Host.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    @Override
    public ResultSet ambilData(String id_p) {
        ResultSet rs = null;
        
        try {
            String sql = "SELECT * FROM pesanan WHERE id_pesanan = '"+id_p+"'";
            
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Host.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
}
