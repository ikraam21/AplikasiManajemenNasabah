/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.nasabah;

/**
 *
 * @author user
 */
public class Person {
    private String name;
    private String gender;
    private boolean maried;
    private String age;
    private String noIdentitas;
    private String pekerjaan;
    private String alamat;
    private String noTelepon;
    private int jmlTanggungan;
    private int gajiPokok;
    private int penghasilanTambahan;
    private String namaBarang;
    private int hargaBarang;
    private int uangMuka;
    private int lamaKredit;
    
    

    public Person() {
    }


    public Person(String name, String gender, boolean maried, String age, String noIdentitas, String pekerjaan, String alamat, String noTelepon, int jmlTanggungan, int gajiPokok, int penghasilanTambahan, String namaBarang, int hargaBarang, int uangMuka, int lamaKredit) {
        this.name = name;
        this.gender = gender;
        this.maried = maried;
        this.age = age;
        this.noIdentitas = noIdentitas;
        this.pekerjaan = pekerjaan;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.jmlTanggungan = jmlTanggungan;
        this.gajiPokok = gajiPokok;
        this.penghasilanTambahan = penghasilanTambahan;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.uangMuka = uangMuka;
        this.lamaKredit = lamaKredit;
    }
   

    public double hitungTotalPenghasilan(){
        double totalPenghasilan = 0.0;
        
        totalPenghasilan = this.gajiPokok + this.penghasilanTambahan;
        return totalPenghasilan;
    }
        
        

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the maried
     */
    public boolean getMaried() {
        return isMaried();
    }

    /**
     * @param maried the maried to set
     */
    public void setMaried(boolean maried) {
        this.maried = maried;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the maried
     */
    public boolean isMaried() {
        return maried;
    }

    /**
     * @return the noIdentitas
     */
    public String getNoIdentitas() {
        return noIdentitas;
    }

    /**
     * @param noIdentitas the noIdentitas to set
     */
    public void setNoIdentitas(String noIdentitas) {
        this.noIdentitas = noIdentitas;
    }

    /**
     * @return the pekerjaan
     */
    public String getPekerjaan() {
        return pekerjaan;
    }

    /**
     * @param pekerjaan the pekerjaan to set
     */
    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the noTelepon
     */
    public String getNoTelepon() {
        return noTelepon;
    }

    /**
     * @param noTelepon the noTelepon to set
     */
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    /**
     * @return the jmlTanggungan
     */
    public int getJmlTanggungan() {
        return jmlTanggungan;
    }

    /**
     * @param jmlTanggungan the jmlTanggungan to set
     */
    public void setJmlTanggungan(int jmlTanggungan) {
        this.jmlTanggungan = jmlTanggungan;
    }

    /**
     * @return the gajiPokok
     */
    public int getGajiPokok() {
        return gajiPokok;
    }

    /**
     * @param gajiPokok the gajiPokok to set
     */
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    /**
     * @return the penghasilanTambahan
     */
    public int getPenghasilanTambahan() {
        return penghasilanTambahan;
    }

    /**
     * @param penghasilanTambahan the penghasilanTambahan to set
     */
    public void setPenghasilanTambahan(int penghasilanTambahan) {
        this.penghasilanTambahan = penghasilanTambahan;
    }

    /**
     * @return the namaBarang
     */
    public String getNamaBarang() {
        return namaBarang;
    }

    /**
     * @param namaBarang the namaBarang to set
     */
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    /**
     * @return the hargaBarang
     */
    public int getHargaBarang() {
        return hargaBarang;
    }

    /**
     * @param hargaBarang the hargaBarang to set
     */
    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    /**
     * @return the uangMuka
     */
    public int getUangMuka() {
        return uangMuka;
    }

    /**
     * @param uangMuka the uangMuka to set
     */
    public void setUangMuka(int uangMuka) {
        this.uangMuka = uangMuka;
    }

    /**
     * @return the lamaKredit
     */
    public int getLamaKredit() {
        return lamaKredit;
    }

    /**
     * @param lamaKredit the lamaKredit to set
     */
    public void setLamaKredit(int lamaKredit) {
        this.lamaKredit = lamaKredit;
    }
    
    
}
