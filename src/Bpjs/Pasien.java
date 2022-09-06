/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bpjs;

/**
 *
 * @author DaffaRadhitya
 */
public class Pasien implements Status{
    public String rm, nama;
    double tinggi, berat;
    double BMI;
    Integer umur;
    String sUmur,status;

    public Pasien(String rm, String nama, double tinggi, double berat, Integer umur) {
        this.rm = rm;
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
        this.umur = umur;
    }
    
    public double BMI(){
        double ceil = berat/Math.pow(tinggi, 2);
        return Math.ceil(ceil);
    }

    @Override
    public String getSumur(Integer umur) {
        if (umur >=  46) {
            sUmur ="Lansia";
        }else if(umur >= 26 && umur < 45){
            sUmur ="Dewasa";
        }else if(umur >= 12 && umur <25){
            sUmur = "Remaja";
        }else if(umur >= 5 && umur < 11){
            sUmur = "Anak";
        }else{
            sUmur= "Bayi";
        }
        return sUmur;
    }

    @Override
    public String getStatus(Double BMI) {
      if(BMI < 18.5){
        status ="Kekurangan BB";
        }else if (BMI >= 18.5 && BMI < 24.9) {
            status ="Normal (ideal)";
        }else if (BMI >= 25.0 && BMI <29.9) {
            status="Kelebihan BB";
        }else if (BMI >= 30.0) {
            status ="kegemukan (obesitas)";
        }
     return status;
    }
    
    

}
