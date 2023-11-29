package perpustakaanxyz;

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
        System.out.println("Transaksi Peminjaman:");
        System.out.println("Nama\t\t\t: " + anggota.getNama());
        System.out.println("Buku\t\t\t: " + buku.getJudul()+"");
        System.out.println("Tanggal Peminjaman\t: " + tanggalPinjam);
        System.out.println("Note\t\t\t: Harus dikembalikan sebelum 1 minggu dari peminjaman");
        System.out.println("-------------------------------------------------");
    }
}
