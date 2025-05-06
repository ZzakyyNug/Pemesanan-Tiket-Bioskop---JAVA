# Sistem Pemesanan Tiket Bioskop

Aplikasi ini adalah simulasi sistem pemesanan tiket bioskop menggunakan Java dengan arsitektur MVC (Model-View-Controller) dan implementasi custom exception. Program ini dikembangkan sebagai tugas pemrograman Java.

## Fitur

- **Pemesanan tiket** dengan validasi stok dan usia
- **Daftar film** dengan kategori dan stok
- **Pencatatan pemesanan**
- **Validasi** melalui custom exception
- **Arsitektur MVC** untuk struktur kode yang bersih

## Struktur Proyek

```
com.bioskop.exception
  |- StokTiketHabisException.java    // Exception untuk stok habis
  |- UsiaTidakCukupException.java    // Exception untuk usia tidak cukup
com.bioskop.model
  |- Film.java                       // Model untuk film
  |- Pemesanan.java                  // Model untuk pemesanan
  |- Database.java                   // Penyimpanan data
com.bioskop.controller
  |- PemesananController.java        // Logika bisnis
com.bioskop.view
  |- BioskopView.java                // Antarmuka pengguna
  |- MainApp.java                    // Entry point program
```

## Persyaratan

- Java Development Kit (JDK) 8 atau lebih tinggi
- IDE Java (seperti NetBeans, Eclipse, IntelliJ IDEA) atau teks editor dan command line

## Cara Penggunaan

### 1. Clone Repository

```bash
git clone https://github.com/zzkydev/sistem-pemesanan-tiket-bioskop.git
cd sistem-pemesanan-tiket-bioskop
```

### 2. Kompilasi Program

Dengan IDE:
- Buka proyek di IDE pilihan Anda
- Build project

Dengan command line:
```bash
mkdir -p bin
javac -d bin src/com/bioskop/view/MainApp.java
```

### 3. Jalankan Program

Dengan IDE:
- Jalankan file MainApp.java

Dengan command line:
```bash
java -cp bin com.bioskop.view.MainApp
```

### 4. Menggunakan Aplikasi

Setelah aplikasi berjalan, Anda akan melihat menu utama dengan opsi berikut:

1. **Lihat Daftar Film**
   - Menampilkan semua film yang tersedia beserta kategori dan stok

2. **Pesan Tiket**
   - Masukkan judul film
   - Masukkan jumlah tiket
   - Masukkan nama pembeli
   - Masukkan usia pembeli
   - Sistem akan melakukan validasi:
     - Apakah stok tersedia
     - Apakah usia cukup untuk film kategori dewasa

3. **Lihat Daftar Pemesanan**
   - Menampilkan semua pemesanan yang telah dilakukan

4. **Keluar**
   - Keluar dari aplikasi

## Ketentuan Program

1. Jumlah tiket yang dipesan tidak boleh melebihi stok tersedia.
2. Usia pemesan harus minimal 17 tahun untuk film kategori Dewasa (D).
3. Jika salah satu aturan dilanggar, program akan melempar custom exception.

## Contoh Film yang Tersedia

Program ini diinisialisasi dengan beberapa film:
- Avengers: Endgame (Kategori: SU, Stok: 50)
- Fast X (Kategori: SU, Stok: 30)
- The Conjuring (Kategori: D, Stok: 20)
- Insidious (Kategori: D, Stok: 25)
- Jumbo Animasi (Kategori: SU, Stok 25)

## Kontribusi

Jika Anda ingin berkontribusi pada proyek ini, silakan:
1. Fork repository
2. Buat branch fitur (`git checkout -b feature/AmazingFeature`)
3. Commit perubahan Anda (`git commit -m 'Add some AmazingFeature'`)
4. Push ke branch (`git push origin feature/AmazingFeature`)
5. Buka Pull Request
