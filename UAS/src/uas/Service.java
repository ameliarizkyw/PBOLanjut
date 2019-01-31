
package uas;

import config.Conection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Service implements Interface{
    String sql = "";
    private DefaultTableModel dtm;
    
    Conection koneksi = new Conection();
    PreparedStatement ps;
    ResultSet rs;
    

    @Override
    public void read(JTable jTable1) {
         String kolom[] = {"NIK","Nama","TTL","Alamat","Jenis kelamin","Status","Jabatan",
         "Status Kepegawaian","Jam Kerja","Tunjangan","Gaji Pokok","Tanggal"};
        dtm = new DefaultTableModel(null, kolom);
        sql = "SELECT * FROM pegawai";
        try {
            rs = koneksi.getStm().executeQuery(sql);
            while (rs.next()) {
                Object o[] = new Object[12];
                o[0] = rs.getString("nik");
                o[1] = rs.getString("nama");
                o[2] = rs.getString("ttl");
                o[3] = rs.getString("alamat");
                o[4] = rs.getString("jk");
                o[5] = rs.getString("status");
                o[6] = rs.getString("jabatan");
                o[7] = rs.getString("status_kep");
                o[8] = rs.getString("jam_kerja");
                o[9] = rs.getString("tunjangan");
                o[10] = rs.getString("gaji_pokok");
                o[11] = rs.getString("tanggal");
                dtm.addRow(o);
                
            }
            jTable1.setModel(dtm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void create(Pegawai pegawai) {
        sql = "insert into pegawai values(?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            ps = koneksi.getKon().prepareStatement(sql);
            ps.setString(1,pegawai.getNIK());
            ps.setString(2, pegawai.getNama());
            ps.setString(3, pegawai.getTtl());
            ps.setString(4, pegawai.getAlamat());
            ps.setString(5,pegawai.getJk());
            ps.setString(6,pegawai.getStatus());
            ps.setString(7,pegawai.getJabatan());
            ps.setString(8,pegawai.getStts_kep());
            ps.setString(9,pegawai.getJam_kerja());
            ps.setString(10,pegawai.getTunjangan());
            ps.setDouble(11, pegawai.getGaji_pokok());
            ps.setString(12, pegawai.getTanggal());
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void update(String nik, Pegawai pegawai) {
        sql = "UPDATE pegawai SET nama=?,ttl=?,alamat=?,jk=?,status=?,jabatan=?,"
                + "status_kep=?,jam_kerja=?,tunjangan=?,gaji_pokok= ?, tanggal=? WHERE nik=?";
        try {
            ps = koneksi.getKon().prepareStatement(sql);
            ps.setString(1, pegawai.getNama());
            ps.setString(2, pegawai.getTtl());
            ps.setString(3, pegawai.getAlamat());
            ps.setString(4, pegawai.getJk());
            ps.setString(5, pegawai.getStatus());
            ps.setString(6, pegawai.getJabatan());
            ps.setString(7, pegawai.getStts_kep());
            ps.setString(8, pegawai.getJam_kerja());
            ps.setString(9, pegawai.getTunjangan());
            ps.setDouble(10, pegawai.getGaji_pokok());
            ps.setString(11, pegawai.getTanggal());
            ps.setString(12, pegawai.getNIK());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "berhsil");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
       
    }

    @Override
    public void delete(int id) {
           sql = "delete from pegawai where nik = ?";
        try {

            ps = koneksi.getKon().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(null, ex.getMessage());
        }
    }

    @Override
    public void find(JTable jTable1, String key) {
    }

  
    
}
