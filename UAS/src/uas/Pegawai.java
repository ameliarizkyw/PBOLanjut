package uas;

public class Pegawai {

    private String nama;
    private String NIK;
    private String alamat;
    private String ttl;
    private String jk;
    private String status;
    private String jabatan;
    private String stts_kep;
    private String tunjangan;
    private String jam_kerja;
    private int gaji_pokok;
    private String tanggal;

    public Pegawai() {
    }

    public Pegawai(String nama, String NIK, String alamat, String ttl, String jk, String status,
            String jabatan, String stts_kep, String tunjangan, String jam_kerja, double gaji_pokok) {
        this.nama = nama;
        this.NIK = NIK;
        this.alamat = alamat;
        this.ttl = ttl;
        this.jk = jk;
        this.status = status;
        this.jabatan = jabatan;
        this.stts_kep = stts_kep;
        this.tunjangan = tunjangan;
        this.jam_kerja = jam_kerja;
        this.gaji_pokok = (int) gaji_pokok;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getStts_kep() {
        return stts_kep;
    }

    public void setStts_kep(String stts_kep) {
        this.stts_kep = stts_kep;
    }

    public String getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(String tunjangan) {
        this.tunjangan = tunjangan;
    }

    public String getJam_kerja() {
        return jam_kerja;
    }

    public void setJam_kerja(String jam_kerja) {
        this.jam_kerja = jam_kerja;
    }

    public double getGaji_pokok() {
        return gaji_pokok;
    }

    public void setGaji_pokok(int gaji_pokok) {
        this.gaji_pokok = (int) gaji_pokok;
    }

}
