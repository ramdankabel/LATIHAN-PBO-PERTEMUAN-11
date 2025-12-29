package Pertemuan11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class E5_Perpustakaan {
    private static final String FILE_NAME = "buku.txt";

    // Enum untuk status buku
    public enum StatusBuku {
        TERSEDIA, DIPINJAM
    }

    // Class untuk merepresentasikan buku
    public static class Buku {
        private String judul;
        private String pengarang;
        private int tahun;
        private StatusBuku status;

        public Buku(String judul, String pengarang, int tahun, StatusBuku status) {
            this.judul = judul;
            this.pengarang = pengarang;
            this.tahun = tahun;
            this.status = status;
        }

        public String getJudul() {
            return judul;
        }

        public String getPengarang() {
            return pengarang;
        }

        public int getTahun() {
            return tahun;
        }

        public StatusBuku getStatus() {
            return status;
        }

        public void setStatus(StatusBuku status) {
            this.status = status;
        }

        @Override
        public String toString() {
            return String.format("%s,%s,%d,%s", judul, pengarang, tahun, status);
        }

        public static Buku fromString(String data) {
            String[] parts = data.split(",");
            return new Buku(
                parts[0].trim(),
                parts[1].trim(),
                Integer.parseInt(parts[2].trim()),
                StatusBuku.valueOf(parts[3].trim())
            );
        }
    }

    public static void main(String[] args) {
        tambahBukuDummy();

        System.out.println("=== Daftar Buku ===");
        tampilkanBukuDalamTabel();

        // Cari buku berdasarkan judul
        System.out.println("\n=== Pencarian Buku ===");
        String judulDicari = "Perahu Kertas";
        System.out.println("Mencari buku dengan judul: " + judulDicari);
        Buku bukuDitemukan = cariBukuByJudul(judulDicari);
        if (bukuDitemukan != null) {
            System.out.println("Buku ditemukan: " + bukuDitemukan.getJudul() +
                             " oleh " + bukuDitemukan.getPengarang());
        } else {
            System.out.println("Buku dengan judul '" + judulDicari + "' tidak ditemukan.");
        }
        System.out.println();
    }

    public static void tampilkanBukuDalamTabel() {
        List<Buku> semuaBuku = bacaSemuaBuku();

        // Header tabel
        System.out.println("+--------------------------------+---------------------+-------+------------+");
        System.out.println("| Judul Buku                     | Pengarang           | Tahun | Status     |");
        System.out.println("+--------------------------------+---------------------+-------+------------+");

        // Data buku
        for (Buku buku : semuaBuku) {
            System.out.printf(
                "| %-30s | %-19s | %-5d | %-10s |\n",
                buku.getJudul(), buku.getPengarang(), buku.getTahun(), buku.getStatus()
            );
        }

        // Footer tabel
        System.out.println("+--------------------------------+---------------------+-------+------------+");
    }

    public static void tambahBukuDummy() {
        List<Buku> bukuDummy = new ArrayList<>();
        bukuDummy.add(new Buku("Laskar Pelangi", "Andrea Hirata", 2005, StatusBuku.TERSEDIA));
        bukuDummy.add(new Buku("Bumi Manusia", "Pramoedya Ananta Toer", 1980, StatusBuku.DIPINJAM));
        bukuDummy.add(new Buku("Pulang", "Leila S. Chudori", 2012, StatusBuku.TERSEDIA));
        bukuDummy.add(new Buku("Cantik Itu Luka", "Eka Kurniawan", 2002, StatusBuku.TERSEDIA));
        bukuDummy.add(new Buku("Perahu Kertas", "Dewi Lestari", 2009, StatusBuku.DIPINJAM));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Buku buku : bukuDummy) {
                writer.write(buku.toString());
                writer.newLine();
            }
            System.out.println("Data buku dummy berhasil ditambahkan!");
        } catch (IOException e) {
            System.err.println("Error menulis file: " + e.getMessage());
        }
    }

    public static List<Buku> bacaSemuaBuku() {
        List<Buku> bukuList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                bukuList.add(Buku.fromString(line));
            }
        } catch (IOException e) {
            System.err.println("Error membaca file: " + e.getMessage());
        }
        return bukuList;
    }

    public static Buku cariBukuByJudul(String judul) {
        List<Buku> semuaBuku = bacaSemuaBuku();
        for (Buku buku : semuaBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                return buku;
            }
        }
        return null;
    }
}
