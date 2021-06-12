/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kode;

import java.sql.ResultSet;

/**
 *
 * @author USER
 */
public interface InterfaceAmbilDataRiwayat {
    ResultSet ambilData(int id);
    ResultSet ambilData(String id);
}
