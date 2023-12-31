/*
 * @author Robby Hidayat
 */
package perpustakaanxyz;

/**
 *
 * @author Hafizh
 */
import java.util.ArrayList;



/**
 *
 * @author ENGGAL BIMA SAKTI
 */
public class PerpustakaanXYZ {

    public static void main(String[] args) {
        
        ArrayList<AnggotaPerpustakaan> daftarAnggota = new ArrayList<>();
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        
        AnggotaPerpustakaan anggota1 = new AnggotaPerpustakaan("Enggal", "123", "Marga Mulya", "");
        AnggotaPerpustakaan anggota2 = new AnggotaPerpustakaan("Mukir", "726", "Marga Alam", "");

        
        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata", "12344", "Tersedia");
        Admin admin = new Admin();
        
        
        admin.tambahAnggota(daftarAnggota, anggota1);
        admin.tambahAnggota(daftarAnggota, anggota2);
        System.out.println("-------------------------------------------------");
        
        admin.tambahBuku(daftarBuku, buku1);
        System.out.println("-------------------------------------------------");
        
        admin.tampilkanDataBuku(daftarBuku);
  
        admin.tampilkanDataAnggota(daftarAnggota);
//       
        anggota1.pinjamBuku(buku1, daftarBuku);
        TransaksiPeminjaman transaksiPinjam = new TransaksiPeminjaman(anggota1, buku1, "");
        transaksiPinjam.displayInfo();
        
//        
        anggota2.pinjamBuku(buku1, daftarBuku);
        System.out.println("-------------------------------------------------");
 
        admin.tampilkanDataBuku(daftarBuku);
        
        Notifikasi notif1 = new Notifikasi(" masa peminjaman ");
        admin.kirimNotifikasi(notif1, anggota1, buku1);
        
       
        anggota1.kembalikanBuku(buku1, daftarBuku);
        TransaksiPengembalian transaksiKembali = new TransaksiPengembalian(anggota1, buku1, "");
        transaksiKembali.displayInfo();
        
        admin.tampilkanDataAnggota(daftarAnggota);
        
        
        
    }
}
