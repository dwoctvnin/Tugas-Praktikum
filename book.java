public class book {
    private String Kategori;
    private String Judul;
    private String Penulis;
    private String Penerbit;
    private String tahunTerbit;

    public void setKategori (String Kategori){
        this.Kategori = Kategori;
    }
    public void setJudul (String Judul){
        this.Judul = Judul;
    }
    public void setPenulis (String Penulis){
        this.Penulis = Penulis;
    }
    public void setPenerbit (String Penerbit) {
        this.Penerbit = Penerbit;
    }
    public void setTahunTerbit (String tahunTerbit){
        this.tahunTerbit = tahunTerbit;
    }
    public void ketBuku() {
        System.out.println("Kategori Buku : " + Kategori);
        System.out.println("Judul Buku    : " + Judul);
        System.out.println("Penulis Buku  : " + Penulis);
        System.out.println("Penerbit Buku : " + Penerbit);
        System.out.println("Tahun Terbit  : " + tahunTerbit);
        System.out.println();

    }


    }



