import java.awt.print.Book;
import java.util.Scanner;
public class mainbook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===============================================");
        System.out.println("Silakan pilih kategori buku: \n 1. Teknologi \n 2.Filsafat \n 3. Sejarah \n 4. Agama \n 5. Psikologi \n 6. Politik \n 7.Fiksi");
        KoleksiBuku kolekBuku = new KoleksiBuku();
        kolekBuku.setKategoriBuku(input.nextInt());
    }

        Book book = new Book();

        public static void teknologi() {
            book teknologi1 = new book();
            teknologi1.setKategori("Teknologi");
            teknologi1.setJudul("Pengantar Teknologi Informasi");
            teknologi1.setPenulis("Buhori Muslim");
            teknologi1.setPenerbit("Pendidikan Deepublish");
            teknologi1.setTahunTerbit("2017");
            teknologi1.ketBuku();

            book teknologi2 = new book();
            teknologi2.setKategori("Teknologi");
            teknologi2.setJudul("Metode Penelitian Teknik Informatika");
            teknologi2.setPenulis("Ade Johar Maturidi");
            teknologi2.setPenerbit("Pendidikan Deepublish");
            teknologi2.setTahunTerbit("2015");
            teknologi2.ketBuku();

            book teknologi3 = new book();
            teknologi3.setKategori("Teknologi");
            teknologi3.setJudul("Komputer Cerdas untuk Mahasiswa Teknik Informatika");
            teknologi3.setPenulis("Nur Nafi'iyah");
            teknologi3.setPenerbit("Pendidikan Deepublish");
            teknologi3.setTahunTerbit("2017");
            teknologi3.ketBuku();

            book teknologi4 = new book();
            teknologi4.setKategori("Teknologi");
            teknologi4.setJudul("Dasar-Dasar Teknik Informatika");
            teknologi4.setPenulis("Novega Pratama Adiputra");
            teknologi4.setPenerbit("Pendidikan Deepublish");
            teknologi4.setTahunTerbit("2020");
            teknologi4.ketBuku();

            book teknologi5 = new book();
            teknologi5.setKategori("Teknologi");
            teknologi5.setJudul("Pengantar Teknologi Informatika dan Komunikasi Data");
            teknologi5.setPenulis("Bagaskoro S.Kom.,M.M.");
            teknologi5.setPenerbit("Pendidikan Deepublish");
            teknologi5.setTahunTerbit("2019");
            teknologi5.ketBuku();

        }
        public static void filsafat () {
            book filsafat1 = new book();
            filsafat1.setKategori("Filsafat");
            filsafat1.setJudul("Studi Dasar Filsafat");
            filsafat1.setPenulis("Tazkiyah Basa'ad");
            filsafat1.setPenerbit("Pendidikan Deepublish");
            filsafat1.setTahunTerbit("2018");
            filsafat1.ketBuku();

            book filsafat2 = new book();
            filsafat2.setKategori("Filsafat");
            filsafat2.setJudul("Filsafat Pendidikan Islam");
            filsafat2.setPenulis("Sehat Sultoni Dalimunthe");
            filsafat2.setPenerbit("Pendidikan Deepublish");
            filsafat2.setTahunTerbit("2018");
            filsafat2.ketBuku();

            book filsafat3 = new book();
            filsafat3.setKategori("Filsafat");
            filsafat3.setJudul("Filsafat Pendidikan Operasional");
            filsafat3.setPenulis("Aswasulasikin");
            filsafat3.setPenerbit("Pendidikan Deepublish");
            filsafat3.setTahunTerbit("2018");
            filsafat3.ketBuku();

            book filsafat4 = new book();
            filsafat4.setKategori("Filsafat");
            filsafat4.setJudul("Filsafat Pendidikan Vokasi");
            filsafat4.setPenulis("Soetyono Iskandar dan Mardi Syahir");
            filsafat4.setPenerbit("Pendidikan Deepublish");
            filsafat4.setTahunTerbit("2017");
            filsafat4.ketBuku();

            book filsafat5 = new book();
            filsafat5.setKategori("Filsafat");
            filsafat5.setJudul("Bunga Rampai Hukum dan Filsafat Indonesia");
            filsafat5.setPenulis("H. Santhos Wachjoe Prijambodo, S.H.,M.H.");
            filsafat5.setPenerbit("Pendidikan Deepublish");
            filsafat5.setTahunTerbit("2019");
            filsafat5.ketBuku();

        }
        public static void sejarah () {
            book sejarah1 = new book();
            sejarah1.setKategori("Sejarah");
            sejarah1.setJudul("Sapiens Riwayat Singkat Manusia");
            sejarah1.setPenulis("Yuval Noah Harari");
            sejarah1.setPenerbit("Gramedia");
            sejarah1.setTahunTerbit("2017");
            sejarah1.ketBuku();

            book sejarah2 = new book();
            sejarah2.setKategori("Sejarah");
            sejarah2.setJudul("The World until Yesterday");
            sejarah2.setPenulis("Jared Diamond");
            sejarah2.setPenerbit("Gramedia");
            sejarah2.setTahunTerbit("2017");
            sejarah2.ketBuku();

            book sejarah3 = new book();
            sejarah3.setKategori("Sejarah");
            sejarah3.setJudul("Isme Isme yang Mengguncang Dunia");
            sejarah3.setPenulis("William Ebenstein");
            sejarah3.setPenerbit("Narasi");
            sejarah3.setTahunTerbit("2006");
            sejarah3.ketBuku();

            book sejarah4 = new book();
            sejarah4.setKategori("Sejarah");
            sejarah4.setJudul("Sejarah Dunia yang Disembunyikan");
            sejarah4.setPenulis("Jonathan Black");
            sejarah4.setPenerbit("Pustaka Alvabet");
            sejarah4.setTahunTerbit("2015");
            sejarah4.ketBuku();

            book sejarah5 = new book();
            sejarah5.setKategori("Sejarah");
            sejarah5.setJudul("History of the World War");
            sejarah5.setPenulis("Saut Pasaribu");
            sejarah5.setPenerbit("Alexander Books");
            sejarah5.setTahunTerbit("2018");
            sejarah5.ketBuku();
        }
        public static void agama () {
            book agama1 = new book();
            agama1.setKategori("Agama");
            agama1.setJudul("Nalar Tasawuf sebagai Revolusi Pendidikan Islam");
            agama1.setPenulis("Istania Widayati Hidayati");
            agama1.setPenerbit("Deepublish");
            agama1.setTahunTerbit("2019");
            agama1.ketBuku();

            book agama2 = new book();
            agama2.setKategori("Agama");
            agama2.setJudul("Satu Tuhan Seribu Jalan");
            agama2.setPenulis("Abdul Wadud Kasyful Humam,S.Th.I");
            agama2.setPenerbit("Forum");
            agama2.setTahunTerbit("2017");
            agama2.ketBuku();

            book agama3 = new book();
            agama3.setKategori("Agama");
            agama3.setJudul("Maharah Kitabah Berbasis Kolokasi");
            agama3.setPenulis("Achmad Tito Rusady");
            agama3.setPenerbit("Gramedia");
            agama3.setTahunTerbit("2016");
            agama3.ketBuku();

            book agama4 = new book();
            agama4.setKategori("Agama");
            agama4.setJudul("Islam Dialektis");
            agama4.setPenulis("Pradana Boy");
            agama4.setPenerbit("Deepublish");
            agama4.setTahunTerbit("2005");
            agama4.ketBuku();

            book agama5 = new book();
            agama5.setKategori("Agama");
            agama5.setJudul("Secrets of Divine Love");
            agama5.setPenulis("A Helwa");
            agama5.setPenerbit("Elex Media Komputindo");
            agama5.setTahunTerbit("2022");
            agama5.ketBuku();

        }
        public static void psikologi () {
            book psikologi1 = new book();
            psikologi1.setKategori("Psikologi");
            psikologi1.setJudul("Warna Warni Psikologi untuk Negeri");
            psikologi1.setPenulis("Tim Pengajar Fakultas Psikologi YARSI");
            psikologi1.setPenerbit("Deepublish");
            psikologi1.setTahunTerbit("2017");
            psikologi1.ketBuku();

            book psikologi2 = new book();
            psikologi2.setKategori("Psikologi");
            psikologi2.setJudul("Bimbingan dan Konseling Belajar");
            psikologi2.setPenulis("Abdul Saman dan Agustan Arifin");
            psikologi2.setPenerbit("Deepublish");
            psikologi2.setTahunTerbit("2018");
            psikologi2.ketBuku();

            book psikologi3 = new book();
            psikologi3.setKategori("Psikologi");
            psikologi3.setJudul("Psikologi Pendidikan");
            psikologi3.setPenulis("Mahsup dan Yunita Septriana Anwar");
            psikologi3.setPenerbit("Deepublish");
            psikologi3.setTahunTerbit("2018");
            psikologi3.ketBuku();

            book psikologi4 = new book();
            psikologi4.setKategori("Psikologi");
            psikologi4.setJudul("Psikologi Belajar");
            psikologi4.setPenulis("Afi Parnawi");
            psikologi4.setPenerbit("Deepublish");
            psikologi4.setTahunTerbit("2019");
            psikologi4.ketBuku();

            book psikologi5 = new book();
            psikologi5.setKategori("Psikologi");
            psikologi5.setJudul("Psikologi Komunikasi");
            psikologi5.setPenulis("Markus Utomo Sukendar");
            psikologi5.setPenerbit("Deepublish");
            psikologi5.setTahunTerbit("2017");
            psikologi5.ketBuku();
        }
        public static void politik () {
            book politik1 = new book();
            politik1.setKategori("Politik");
            politik1.setJudul("Mengadvokasi Hak Sipil Politik");
            politik1.setPenulis("Hendardi");
            politik1.setPenerbit("Gramedia");
            politik1.setTahunTerbit("");
            politik1.ketBuku();

            book politik2 = new book();
            politik2.setKategori("Politik");
            politik2.setJudul("Negara dan Politik Kesejahteraan");
            politik2.setPenulis("Muhaimin Iskandar");
            politik2.setPenerbit("Gramedia");
            politik2.setTahunTerbit("2021");
            politik2.ketBuku();

            book politik3 = new book();
            politik3.setKategori("Politik");
            politik3.setJudul("Dramaturgi Politik Indonesia");
            politik3.setPenulis("Muhamad Sulhan");
            politik3.setPenerbit("Intrans Publishing");
            politik3.setTahunTerbit("2020");
            politik3.ketBuku();

            book politik4 = new book();
            politik4.setKategori("Politik");
            politik4.setJudul("Keadaban Politik");
            politik4.setPenulis("Luthfi J. Kurniawan");
            politik4.setPenerbit("Intrans Publishing");
            politik4.setTahunTerbit("2021");
            politik4.ketBuku();

            book politik5 = new book();
            politik5.setKategori("Politik");
            politik5.setJudul("Restrukrisasi Politik Indonesia");
            politik5.setPenulis("Agus Subagyo");
            politik5.setPenerbit("Kompas");
            politik5.setTahunTerbit("2020");
            politik5.ketBuku();
        }
        public static void fiksi () {
            book fiksi1 = new book();
            fiksi1.setKategori("Fiksi");
            fiksi1.setJudul("Ronggeng Dukuh Paruk");
            fiksi1.setPenulis("Ahmad Tohari");
            fiksi1.setPenerbit("Gramedia");
            fiksi1.setTahunTerbit("2003");
            fiksi1.ketBuku();

            book fiksi2 = new book();
            fiksi2.setKategori("Fiksi");
            fiksi2.setJudul("Cantik itu Luka");
            fiksi2.setPenulis("Eka Kurniawan");
            fiksi2.setPenerbit("Gramedia");
            fiksi2.setTahunTerbit("2004");
            fiksi2.ketBuku();

            book fiksi3 = new book();
            fiksi3.setKategori("Fiksi");
            fiksi3.setJudul("Dilan 1990");
            fiksi3.setPenulis("Pidi Baiq");
            fiksi3.setPenerbit("Pastel Books(Mizan Group)");
            fiksi3.setTahunTerbit("2014");
            fiksi3.ketBuku();

            book fiksi4 = new book();
            fiksi4.setKategori("Fiksi");
            fiksi4.setJudul("Bumi Manusia");
            fiksi4.setPenulis("Pramoedya Ananta Toer");
            fiksi4.setPenerbit("Hasta Mitra");
            fiksi4.setTahunTerbit("1980");
            fiksi4.ketBuku();

            book fiksi5 = new book();
            fiksi5.setKategori("Fiksi");
            fiksi5.setJudul("Tenggelamnya Kapal Van Der Wijck");
            fiksi5.setPenulis("Haji Abdul Malik");
            fiksi5.setPenerbit("Gema Insani");
            fiksi5.setTahunTerbit("1938");
            fiksi5.ketBuku();
        }

}
class KoleksiBuku {
    private int kategoriBuku;

    public void setKategoriBuku(int a){
        this.kategoriBuku = a;

        String kategori1 = "Teknologi";
        String kategori2 = "Filsafat";
        String kategori3 = "Sejarah";
        String kategori4 = "Agama";
        String kategori5 = "Psikologi";
        String kategori6 = "Politik";
        String kategori7 = "Fiksi";

        if (a==1){
            System.out.println();
            System.out.println("Anda memilih kategori " + kategori1);
            System.out.println();
            mainbook.teknologi();
        }
        else if (a==2){
            System.out.println();
            System.out.println("Anda memilih kategori" + kategori2);
            System.out.println();
            mainbook.filsafat();
        }
        else if (a==3){
            System.out.println();
            System.out.println("Anda memilih kategori" + kategori3);
            System.out.println();
            mainbook.sejarah();
        }
        else if(a==4){
            System.out.println();
            System.out.println("Anda memilih kategori" + kategori4);
            System.out.println();
            mainbook.agama();
        }
        else if(a==5){
            System.out.println();
            System.out.println("Anda memilih kategori" + kategori5);
            System.out.println();
            mainbook.psikologi();
        }
        else if(a==6){
            System.out.println();
            System.out.println("Anda memilih kategori" + kategori6);
            System.out.println();
            mainbook.politik();
        }
        else if(a==7){
            System.out.println();
            System.out.println("Anda memilih kategori" + kategori7);
            System.out.println();
            mainbook.fiksi();
        }
    }
}
       
    



