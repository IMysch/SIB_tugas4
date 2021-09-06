package com.company;

public class Tugas4_1 {

   private String warna ;
   private double panjang;
   private double lebar;

    public String getWarna(String white) {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public void cetak(){
        System.out.println("Nilai-nilai variabel didalam 4_1");
        System.out.println("WARNA    :"+warna);
        System.out.println("PANJANG  :"+panjang);
        System.out.println("LEBAR    :"+lebar);
        System.out.println("____________________________________________ : ");


    }
}
