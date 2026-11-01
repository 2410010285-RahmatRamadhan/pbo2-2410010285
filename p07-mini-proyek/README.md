# P07 - Mini Proyek: Katalog Buku Perpustakaan

Nama : Rahmat Ramadhan

NPM  : 2410010285

## Tautan Video Demo

Tautan video (maksimal 3 menit): _https://drive.google.com/file/d/18uhCpwV7qhxbB1cKQjdysoMi4bavausf/view?usp=sharing_

## Peta Event
 
### KatalogBuku
 
| Komponen | Menu Events | Aksi |
|---|---|---|
| `tambahButton`, `tambahItem` | Action: actionPerformed | Memanggil `tambah()` |
| `ubahButton`, `ubahItem` | Action: actionPerformed | Memanggil `ubah()` |
| `hapusButton`, `hapusItem` | Action: actionPerformed | Memanggil `hapus()` |
| `cariField` | Key: keyReleased | Memanggil `saring()` |
| `bukuTable` | Mouse: mouseClicked | Klik dua kali memanggil `ubah()` |
| `keluarItem` | Action: actionPerformed | Menutup jendela |
| `tentangItem` | Action: actionPerformed | Menampilkan informasi |
  
### DialogBuku
 
| Komponen | Menu Events | Aksi |
|---|---|---|
| `tahunField` | Key: keyTyped | Membatalkan karakter bukan angka dan angka ke-5 dengan `evt.consume()` |
| `batalButton` | Action: actionPerformed | Menutup dialog tanpa menyimpan |
| `simpanButton` | Action: actionPerformed | Memanggil `simpan()` |

## Deklarasi Penggunaan AI

Saya menggunakan Claude (Anthropic) untuk:
- Membantu merapikan jawaban eksperimen pada Praktikum 5
