
package uas;

import javax.swing.JTable;


public interface Interface {
    public void read(JTable jTable1);
    public void create(Pegawai pegawai);
    public void update(String nik, Pegawai pegawai);
    public void delete (int id);
    public void find (JTable jTable1, String key);
}
