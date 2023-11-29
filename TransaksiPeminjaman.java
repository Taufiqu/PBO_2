/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaanxyz;

/**
 *
 * @author Hafizh
 */
public class TransaksiPeminjaman{
    public AnggotaPerpustakaan anggota;
    public Buku buku;
    public String tanggalPinjam;

    public TransaksiPeminjaman(AnggotaPerpustakaan anggota, Buku buku, String tanggalPinjam) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
    }

    public void displayInfo() {
//        String tanggalPinjam = new Date().toString();
        System.out.println("Transaksi Peminjaman:");
        System.out.println("Nama\t\t\t: " + anggota.getNama());
        System.out.println("Buku\t\t\t: " + buku.getJudul()+"");
        System.out.println("Tanggal Peminjaman\t: " + tanggalPinjam);
        System.out.println("Note\t\t\t: Harus dikembalikan sebelum 1 minggu dari peminjaman");
        System.out.println("-------------------------------------------------");
    }
}
