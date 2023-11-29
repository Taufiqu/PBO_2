package perpustakaanxyz;

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
        System.out.println("Transaksi Pengembalian:");
        System.out.println("Nama\t\t\t: " + anggota.getNama());
        System.out.println("Buku\t\t\t: '" + buku.getJudul()+"'");
        System.out.println("Tanggal Pengembalian\t: " + tanggalPengembalian);
        System.out.println("-------------------------------------------------");
    }
}
