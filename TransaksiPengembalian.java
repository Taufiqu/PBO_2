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
public class TransaksiPengembalian{
    public AnggotaPerpustakaan anggota;
    public Buku buku;
    public String tanggalPengembalian;

    public TransaksiPengembalian(AnggotaPerpustakaan anggota, Buku buku, String tanggalPengembalian){
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPengembalian = tanggalPengembalian;
    }

    public void displayInfo(){
//        String tanggalKembali = new Date().toString();
        System.out.println("Transaksi Pengembalian:");
        System.out.println("Nama\t\t\t: " + anggota.getNama());
        System.out.println("Buku\t\t\t: '" + buku.getJudul()+"'");
        System.out.println("Tanggal Pengembalian\t: " + tanggalPengembalian);
        System.out.println("-------------------------------------------------");
    }
}
