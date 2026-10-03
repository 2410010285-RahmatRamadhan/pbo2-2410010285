1. Kompiler menampilkan error Koleksi is abstract; cannot be instantiated karena Koleksi merupakan abstract class, sehingga tidak dapat dibuat objek secara langsung menggunakan new.

2. Jika @Override tetap ada, terjadi error karena hitungdenda() tidak sama dengan method hitungDenda() pada interface. Jika @Override dihapus, error anotasi hilang, tetapi Buku tetap error karena belum mengimplementasikan method abstract hitungDenda(int).

3. Saat program dijalankan, terjadi IllegalArgumentException karena judul buku kosong. Constructor Koleksi memiliki validasi yang melarang judul kosong sehingga program berhenti.

4. Aturan enkapsulasi dilanggar karena atribut status yang seharusnya private dapat diubah langsung dari luar kelas. Akibatnya, status koleksi dapat diubah tanpa melalui method pinjam() dan kembalikan() sehingga B002 dapat dipinjam kembali oleh Budi saat sebelumnya masih dipinjam Siti.

