
## Ringkasan

Projek ini berisi program Java yang mendemonstrasikan berbagai konsep termasuk:
- Wrapper classes
- Enum
- Operasi file I/O
- Sistem perpustakaan sederhana

## File-file

### 1. E1_WrapperClass.java
Demonstrasi sederhana wrapper class Java:
- Mengkonversi angka String ke Integer
- Melakukan operasi matematika dasar
- Menunjukkan penggunaan wrapper class

### 2. E2_Enum.java
Contoh penggunaan enum Java:
- Mendemonstrasikan deklarasi dan penggunaan enum
- Menunjukkan cara menggunakan enum dalam switch statement

### 3. E3_FileReading.java
Operasi pembacaan file:
- Membaca data dari file `nilai.txt`
- Menghasilkan data dummy secara otomatis
- Menampilkan output terformat
- Menggunakan path file relatif

### 4. E4_FileWritting.java
Operasi penulisan file:
- Menulis data ke file
- Mendemonstrasikan pembuatan dan penulisan file

### 5. E5_Perpustakaan.java - Sistem Perpustakaan Sederhana

Sistem manajemen perpustakaan sederhana yang lengkap dengan:

#### Fitur:
- **Penyimpanan Data Buku**: Menyimpan informasi buku (judul, pengarang, tahun, status) di `buku.txt`
- **Operasi File**: Membaca dan menulis data buku ke/dari file
- **Fungsi Pencarian**: Mencari buku berdasarkan judul
- **Manajemen Status**: Menggunakan enum untuk status buku (TERSEDIA, DIPINJAM)
- **Tampilan Tabel**: Menampilkan buku dalam format tabel

#### Kelas dan Komponen:
- Enum `StatusBuku`: TERSEDIA, DIPINJAM
- Kelas `Buku`: Merepresentasikan objek buku dengan properti dan metode
- Operasi file: Menggunakan BufferedReader/BufferedWriter untuk I/O file
- Tampilan tabel: Memformat output dalam struktur tabel yang rapi

#### Data Contoh:
Menggunakan 5 buku sastra Indonesia:
1. Laskar Pelangi - Andrea Hirata (2005)
2. Bumi Manusia - Pramoedya Ananta Toer (1980)
3. Pulang - Leila S. Chudori (2012)
4. Cantik Itu Luka - Eka Kurniawan (2002)
5. Perahu Kertas - Dewi Lestari (2009)

## Cara Menjalankan

1. Masuk ke direktori projek:
```bash
cd {nama_folder}
```

2. Jalankan program:
```bash
java.java E1_WrapperClass
java E2_Enum.java
java E3_FileReading.java
java E4_FileWritting.java
java E5_Perpustakaan.java
```

## Konsep Utama yang Didemonstrasikan

- Wrapper class Java dan autoboxing
- Tipe enum dan penggunaannya
- Operasi file I/O (membaca dan menulis)
- Prinsip pemrograman berorientasi objek
- Serialisasi data ke file
- Format tabel untuk output konsol
- Penanganan error dengan try-catch

## Catatan

- Semua program menggunakan path file relatif
- Operasi file termasuk penanganan error yang tepat
- Kode mengikuti struktur yang bersih dan sederhana
- Program menghasilkan data uji sendiri secara otomatis

