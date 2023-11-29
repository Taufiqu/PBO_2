/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanxyz;

import java.util.ArrayList;

/**
 *
 * @author Hafizh
 */
public class AnggotaPerpustakaan {
        private String nama;
        private String nomorAnggota;
        private String alamat;
        private String sejarahPinjam;

    public AnggotaPerpustakaan(String nama, String nomorAnggota, String alamat, String sejarahPinjam) {
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
        this.alamat = alamat;
        this.sejarahPinjam = sejarahPinjam;
    }

    
        public String getNama() {
            return nama;
        }

        public String getNomorAnggota() {
            return nomorAnggota;
        }

        public String getAlamat() {
            return alamat;
        }

        public String getSejarahPinjam() {
            return sejarahPinjam;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public void setNomorAnggota(String nomorAnggota) {
            this.nomorAnggota = nomorAnggota;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public void setSejarahPinjam(String sejarahPinjam) {
            this.sejarahPinjam = sejarahPinjam;
        }        
        
        public void pinjamBuku(Buku buku, ArrayList<Buku> daftarBuku) {
            System.out.println(nama + " ingin meminjam buku '" + buku.getJudul() + "'");
    if (buku.getKetersediaan().equals("Tersedia")) {
        buku.setKetersediaan("Dipinjam");
//        String tanggalPinjam = new Date().toString();
//        sejarahPinjam += "Meminjam buku '" + buku.getJudul() + "' pada " + tanggalPinjam + "\n";
        System.out.println("Buku '" + buku.getJudul() + "' berhasil dipinjam oleh " + nama);
    } else {
        System.out.println("Buku '" + buku.getJudul() + "' tidak tersedia untuk dipinjam.");
    }
}


    public void kembalikanBuku(Buku buku, ArrayList<Buku> daftarBuku) {
        if (daftarBuku.contains(buku)) {
            buku.setKetersediaan("Tersedia"); // Ubah status ketersediaan buku
//            String tanggalKembali = new Date().toString();
//            sejarahPinjam += "Mengembalikan buku '" + buku.getJudul() + "' pada " + tanggalKembali + "\n";
            System.out.println("Buku '" + buku.getJudul() + "' telah dikembalikan oleh " + nama);
        } else {
            System.out.println("Anda tidak meminjam buku '" + buku.getJudul() + "'.");
        }
    }


    public void perpanjangPinjaman(String judulBuku, String tanggalPerpanjangan) {
//        String tanggalPerpanjangan = new Date().toString();
//        sejarahPinjam += "Perpanjang - '" + judulBuku + "' pada " + tanggalPerpanjangan + "\n";
        System.out.println("Peminjaman buku '" + judulBuku + "' berhasil diperpanjang oleh " + nama);
    }
}

