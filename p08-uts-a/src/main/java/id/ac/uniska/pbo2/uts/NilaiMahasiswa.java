//Nama : Rahmat Ramadhan
//NPM : 2410010285

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

/**
 *
 * @author MyBook Hype AMD
 */
public class NilaiMahasiswa {

    private final String npm;
    private final String nama;
    private final int tugas;
    private final int uts;
    private final int uas;

    public NilaiMahasiswa(String npm, String nama, int tugas, int uts, int uas) {
        this.npm = npm;
        this.nama = nama;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    /** 30% tugas + 30% UTS + 40% UAS, dihitung dengan integer dulu agar tidak ada galat desimal. */
    public double getNilaiAkhir() {
        return (tugas * 30 + uts * 30 + uas * 40) / 100.0;
    }

    public String getHuruf() {
        double n = getNilaiAkhir();
        if (n >= 80) return "A";
        if (n >= 75) return "B+";
        if (n >= 70) return "B";
        if (n >= 65) return "C+";
        if (n >= 60) return "C";
        if (n >= 40) return "D";
        return "E";
    }

    public String getNpm()  { return npm; }
    public String getNama() { return nama; }
    public int getTugas()   { return tugas; }
    public int getUts()     { return uts; }
    public int getUas()     { return uas; }
}
