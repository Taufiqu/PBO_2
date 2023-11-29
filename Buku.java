package perpustakaanxyz;

public class Buku{
    private String judul;
    private String pengarang;
    private String ISBN;
    private String ketersediaan;

    public Buku(String judul, String pengarang, String ISBN, String ketersediaan){
        this.judul = judul;
        this.pengarang = pengarang;
        this.ISBN = ISBN;
        this.ketersediaan = ketersediaan;
        }

    public String getJudul(){
        return judul;
    }

    public String getPengarang(){
        return pengarang;
    }

    public String getISBN(){
        return ISBN;
    }

    public String getKetersediaan(){
        return ketersediaan;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setKetersediaan(String ketersediaan) {
        this.ketersediaan = ketersediaan;
    }
}
