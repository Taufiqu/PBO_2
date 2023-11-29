/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanxyz;

import java.util.ArrayList;

public class Admin {
    
    
    public void tambahAnggota(ArrayList<AnggotaPerpustakaan> daftarAnggota, AnggotaPerpustakaan anggota) {
        daftarAnggota.add(anggota);
        System.out.println("Anggota atas nama " + anggota.getNama() + " berhasil ditambahkan.");
    }
    
     public void hapusAnggota(ArrayList<AnggotaPerpustakaan> daftarAnggota, AnggotaPerpustakaan anggota) {
        if (daftarAnggota.contains(anggota)) {
            daftarAnggota.remove(anggota);
            System.out.println("Anggota atas nama " + anggota.getNama() + " berhasil dihapus.");
        } else {
            System.out.println("Anggota tidak ditemukan.");
        }
    }
     
    public void updateDataAnggota(AnggotaPerpustakaan anggota, String namaBaru, String alamatBaru) {
        anggota.setNama(namaBaru);
        anggota.setAlamat(alamatBaru);
        System.out.println("Data anggota berhasil diupdate.");
    }
    
    public void tampilkanDataAnggota(ArrayList<AnggotaPerpustakaan> daftarAnggota) {
        System.out.println("Data Anggota Perpustakaan:");
        for (AnggotaPerpustakaan anggota : daftarAnggota) {
            System.out.println("Nama\t\t\t: " + anggota.getNama());
            System.out.println("Nomor Anggota\t\t: " + anggota.getNomorAnggota());
            System.out.println("Alamat\t\t\t: " + anggota.getAlamat());
            System.out.println("Sejarah Peminjaman\t: " + anggota.getSejarahPinjam());
            System.out.println("-------------------------------------------------");
        }
    }
    
    public void tambahBuku(ArrayList<Buku> daftarBuku, Buku buku) {
        daftarBuku.add(buku);
        System.out.println("Buku '" + buku.getJudul() + "' berhasil ditambahkan.");
    }

    public void hapusBuku(ArrayList<Buku> daftarBuku, Buku buku) {
        if (daftarBuku.contains(buku)) {
            daftarBuku.remove(buku);
            System.out.println("Buku " + buku.getJudul() + " berhasil dihapus.");
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }

    public void updateDataBuku(Buku buku, String judulBaru, String pengarangBaru) {
        buku.setJudul(judulBaru);
        buku.setPengarang(pengarangBaru);
        System.out.println("Data buku berhasil diupdate.");
    }
    
    public void tampilkanDataBuku(ArrayList<Buku> daftarBuku) {
    System.out.println("Data Buku Perpustakaan:");
    for (Buku buku : daftarBuku) {
        System.out.println("Judul\t\t: " + buku.getJudul());
        System.out.println("Pengarang\t: " + buku.getPengarang());
        System.out.println("ISBN\t\t: " + buku.getISBN());
        System.out.println("Ketersediaan\t: " + buku.getKetersediaan());
        System.out.println("-------------------------------------------------");
    }
}
    public void kirimNotifikasi(Notifikasi notif ,AnggotaPerpustakaan anggota, Buku buku) {
        System.out.println("Pemberitahuan kepada " + anggota.getNama()+ notif.getNotif()+"'" + buku.getJudul() +"' akan habis dalam 1 hari");
    }
}
    

    