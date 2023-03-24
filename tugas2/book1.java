package tugas2;

public class book1 {
    String Kategori;
    String Judul;
    String Penulis;
    String Penerbit;
    String tahunTerbit;
    String Sinopsis;

    public book1(String Kategori, String Judul, String Penulis, String Penerbit, String tahunTerbit, String Sinopsis) {
        this.Kategori = Kategori;
            this.Judul = Judul;
            this.Penulis = Penulis;
            this.Penerbit = Penerbit;
            this.tahunTerbit = tahunTerbit;
            this.Sinopsis =  Sinopsis;
    }

    public book1() {
    }

    public void tampilkan() {
        System.out.println("Kategori Buku : " + this.Kategori);
        System.out.println("Judul Buku    : " + this.Judul);
        System.out.println("Penulis Buku  : " + this.Penulis);
        System.out.println("Penerbit Buku : " + this.Penerbit);
        System.out.println("Tahun Terbit  : " + this.tahunTerbit);
        System.out.println("Sinopsis      : " + this.Sinopsis);
        System.out.println("Jumlah Kata   : "  + hitungKata());
        System.out.println();

    }
    
    public void tampilkanKategori(String Kategori){
        System.out.println("Kategori yang dipilih yaitu "+ Kategori);
        System.out.println();
    
    }
    public int hitungKata(){
        String[] kata = Sinopsis.split("\\s+");
        return kata.length;
    }

    
   

}



