# P07 - Tabel, Menu, dan Dialog (Aplikasi Daftar Kontak)

Nama : Rahmat Ramadhan

NPM  : 2410010285

## Jawaban Eksperimen Praktikum 5

1. Tabel nggak langsung berubah. Datanya sudah masuk ke list (jumlah di model jadi 6) dan label status sudah menulis "Menampilkan 6 dari 6 kontak", tetapi di layar tabel tetap menampilkan 5 baris, dan di jendela Output muncul peringatan `row index is bigger than sorter's row count`. Penyebabnya, JTable nggak menyimpan data. Dia baru tahu ada baris baru kalau model memanggil `fireTableRowsInserted(baris, baris)`.

2. Yang muncul di dialog konfirmasi adalah **Budi Santoso**, bukan Ahmad Fauzi. Setelah dicari "ah", tabel hanya menampilkan Siti Rahmah, Ahmad Fauzi, dan Nur Aisyah. Ahmad Fauzi ada di baris tampilan 1, tetapi di model dia ada di baris 2. Dengan `return kontakTable.getSelectedRow();` nomor baris tampilan 1 dipakai langsung sebagai nomor baris model, dan baris 1 di model adalah Budi Santoso. Kalau waktu itu dijawab Yes, yang terhapus bukan kontak yang kita pilih. Itu sebabnya `convertRowIndexToModel` wajib dipakai.

3. Dialog nggak lagi mengunci jendela utama, jadi jendela utama masih bisa diklik waktu dialog terbuka. Kontak yang ditambahkan nggak pernah masuk ke tabel. Pada dialog non-modal, `setVisible(true)` langsung selesai tanpa menunggu dialog ditutup, sehingga `tampilkan()` langsung mengembalikan `hasil` yang masih `null`. Method `tambah()` menganggap pengguna membatalkan dan nggak menambahkan apa pun, padahal isi dialog baru diisi dan disimpan sesudahnya. Jumlah kontak tetap 5.

4. Ctrl+N bekerja karena `tambahItem` selalu aktif. Ctrl+E dan Ctrl+D nggak bekerja karena method `perbaruiTombol()` menonaktifkan `ubahItem` dan `hapusItem` (`setEnabled(false)`) selama `kontakTable.getSelectedRow() >= 0` bernilai false, yaitu saat nggak ada baris yang dipilih. Item menu yang nonaktif nggak menjalankan aksinya, termasuk lewat pintasan keyboard. Setelah ada baris yang dipilih, kedua pintasan itu bekerja.

5. Baris `hapusItem.setAccelerator(...)` di `initComponents()` berubah. Argumen `java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK` menjadi `java.awt.event.KeyEvent.VK_DELETE, 0`. Tombolnya ganti ke Delete, dan angka 0 berarti nggak ada tombol pengubah (Ctrl nggak dipakai lagi).

6. Muncul `java.lang.IllegalArgumentException: Cannot set a null TableModel`, dan jendela aplikasi gagal terbuka. Error-nya terjadi di `initComponents()` pada baris `kontakTable.setModel(model);`. Konstruktor memanggil `initComponents()` paling awal, sedangkan `model = new KontakTableModel();` baru dijalankan sesudahnya, jadi waktu itu `model` masih `null`. Karena itu atribut model harus sudah dibuat sejak dideklarasikan.
