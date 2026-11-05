/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.uniska.pbo2.uts;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MyBook Hype AMD
 */
public class NilaiTableModel extends AbstractTableModel {

    private static final Locale INDONESIA = Locale.forLanguageTag("id-ID");
    private static final String[] NAMA_KOLOM = {"NPM", "Nama", "Tugas", "UTS", "UAS", "Akhir", "Huruf"};

    private final List<NilaiMahasiswa> daftar = new ArrayList<>();

    @Override
    public int getRowCount() {
        return daftar.size();
    }

    @Override
    public int getColumnCount() {
        return NAMA_KOLOM.length;
    }

    @Override
    public String getColumnName(int kolom) {
        return NAMA_KOLOM[kolom];
    }

    @Override
    public Object getValueAt(int baris, int kolom) {
        NilaiMahasiswa m = daftar.get(baris);
        return switch (kolom) {
            case 0 -> m.getNpm();
            case 1 -> m.getNama();
            case 2 -> m.getTugas();
            case 3 -> m.getUts();
            case 4 -> m.getUas();
            case 5 -> String.format(INDONESIA, "%.2f", m.getNilaiAkhir());
            default -> m.getHuruf();
        };
    }

    public void tambah(NilaiMahasiswa m) {
        daftar.add(m);
        int barisBaru = daftar.size() - 1;
        fireTableRowsInserted(barisBaru, barisBaru); // memberi tahu JTable agar menggambar ulang
    }

    public boolean npmSudahAda(String npm) {
        return daftar.stream().anyMatch(m -> m.getNpm().equals(npm));
    }

    public int jumlah() {
        return daftar.size();
    }

    public double rataRataNilaiAkhir() {
        if (daftar.isEmpty()) {
            return 0;
        }
        return daftar.stream().mapToDouble(NilaiMahasiswa::getNilaiAkhir).average().orElse(0);
    }
}   