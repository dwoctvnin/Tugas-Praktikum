package tugas2;

import java.util.Scanner;
public class mainbook1 {
    public static char[] pilihan;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        book1[] teknologi = new book1[5];
        book1[] filsafat = new book1[5];
        book1[] sejarah = new book1[5];
        book1[] agama = new book1[5];
        book1[] psikologi = new book1[5];
        book1[] politik = new book1[5];
        book1[] fiksi = new book1[5];

    
    
     teknologi[0]= new book1("Teknologi", "Pengantar Teknologi Informasi", "Buhori Muslim", "Pendidikan Deepublish", "2017", "Teknologi merupakan kebutuhan yang sangat meningkat pesat dalam kalangan masyarakat luas.");
    teknologi[1]= new book1("Teknologi", "Metode Penelitian Teknik Informatika", "Ade Johar Maturidi", "Pendidikan Deepublish", "2015","Pemanfaatan teknologi sangat berpangaruh besar terhadap pekerjaan manusia khusunya dikalangan para perlajar");
    teknologi[2]= new book1("Teknologi", "Komputer Cerdas untuk Mahasiswa Teknik Informatika", "Nur Nafi'iyah", "Pendidikan Deepublish", "2017","Mahasiswa Teknik Informatika memerlukan teknologi canggih untuk mememuhi kebutuhan akademik mereka.");
    teknologi[3] = new book1("Teknologi", "Dasar-Dasar Teknik Informatika", "Novega Pratama Adiputra", "Pendidikan Deepublish", "2020","Kemampuan Dasar dalam menggunakan teknologi dapat dikembangkan dengan berbagai cara");
    teknologi[4]= new book1("Teknologi", "Pengantar Teknologi Informatika dan Komunikasi Data", "Bagaskoro S.Kom.,M.M.", "Pendidikan Deepublish", "2019","Teknologi Informatika dan komunikasi data dalam perkembangan zaman terus berkembang pesat");
  
     filsafat[0]= new book1("Filsafat", "Studi Dasar Filsafat", "Tazkiyah Basa'ad", "Pendidikan Deepublish", "2018", "Memahami dan mengimplementasikan beberapa studi dasar dalam filsafat dapat membantu menenangkan banyak kaum");
    filsafat[1]= new book1("Filsafat", "Filsafat Pendidikan Islam", "Sehat Sultoni Dalimunthe", "Pendidikan Deepublish", "2018", "Pentingnya melaksanakan studi filsafat pendidikan Islam dalam kehidupan bermasyarakat untuk menciptakan lingkungan yang harmonnis");
    filsafat[2]= new book1("Filsafat", "Filsafat Pendidikan Operasional", "Aswasulasikin", "Pendidikan Deepublish", "2018","Memahami arti pentingnya ilmu filsafat akan menjadikan kamu menjadi seseorang yang lebih optimal");
    filsafat[3]= new book1("Filsafat", "Filsafat Pendidikan Vokasi", "Soetyono Iskandar dan Mardi Syahir", "Pendidikan Deepublish", "2017","Filsafat pendidikan vokasi menjadi salah satu tolak ukur keberhasilan mahasiswa dalam menjalankan kewajiban");
    filsafat[4]= new book1("Filsafat", "Bunga Rampai Hukum dan Filsafat Indonesia", "H. Santhos Wachjoe Prijambodo, S.H.,M.H.", "Pendidikan Deepublish", "2019","Memahami segala hukum dan filsafat Indonesia akan menunjang keberhasilan dalam masyarakat");
    
  
     sejarah[0] = new book1("Sejarah", "Sapiens Riwayat Singkat Manusia", "Yuval Noah Harari", "Gramedia", "2017","Ketahuilah sejarah perkembangan manusia serta riwayatnya dalam fase beberapa zaman");
    sejarah[1] = new book1("Sejarah", "The World until Yesterday", "Jared Diamond", "Gramedia", "2017","The World Until Yesterday identifies some of the most valuable lessons we can learn from societies of the past like hunter-gatherers");
    sejarah[2] = new book1("Sejarah", "Isme Isme yang Mengguncang Dunia", "William Ebenstein", "Narasi", "2006","Beberapa pandangan politik berbeda menjadi pemecah belah antar masyarakat Indonesia");
    sejarah[3] = new book1("Sejarah", "Sejarah Dunia yang Disembunyikan", "Jonathan Black", "Pustaka Alvabet", "2015","Peran pentingnya masyarakat dalam mengelola kehidupannya harus dimulai dengan memahami sejarah negaranya");
    sejarah[4] = new book1("Sejarah", "History of the World War", "Saut Pasaribu", "Alexander Books", "2018","");

   
     agama[0]= new book1("Agama", "Nalar Tasawuf sebagai Revolusi Pendidikan Islam", "Istania Widayati Hidayati", "Deepublish", "2019","Tasawuf sebagai revolusi spiritual dalam kehidupan masyarakat modern terutama kalangan pemuda");
    agama[1] = new book1("Agama", "Satu Tuhan Seribu Jalan", "Abdul Wadud Kasyful Humam,S.Th.I", "Forum", "2017","Manusia hanyalah makhluk ciptaan yang tidak dapat mengandalkan kekuatannya sendiri");
    agama[2] = new book1("Agama", "Maharah Kitabah Berbasis Kolokasi", "Achmad Tito Rusady", "Gramedia", "2016","Seringnya terjadi campuran pola atau gaya bahasa-bahasa Indonesia ke dalam bahasa Arab");
    agama[3] = new book1("Agama", "Islam Dialektis", "Pradana Boy", "Deepublish", "2005","lahir dari sebuah kesadaran bahwa Islam tidak pernah berhenti berdialektika dengan berbagai hal");
    agama[4] = new book1("Agama", "Secrets of Divine Love", "A Helwa", "Elex Media Komputindo", "2022","Rahasia untuk menemukan cinta sejati yang ditakdirkan untuk diri dalam kesepian");
   
   
     psikologi[0] = new book1("Psikologi", "Warna Warni Psikologi untuk Negeri", "Tim Pengajar Fakultas Psikologi YARSI", "Deepublish", "2017","Psikologi warna merupakan cabang dari ilmu psikologi yang mempelajari tentang warna sebagai faktor dalam perilaku manusia.");
     psikologi[1] = new book1("Psikologi", "Bimbingan dan Konseling Belajar", "Abdul Saman dan Agustan Arifin", "Deepublish", "2018","Bimbingan dan konseling bealajar akan memacu menjaga diri kita tetap profesional");
     psikologi[2] = new book1("Psikologi", "Psikologi Pendidikan", "Mahsup dan Yunita Septriana Anwar", "Deepublish", "2018","Tiak hanya dalam kesehatan mental saja, tetapi pendidikan pun juga memiliki beberapa dampak signifikan");
     psikologi[3] = new book1("Psikologi", "Psikologi Belajar", "Afi Parnawi", "Deepublish", "2019","Dalam buku terdapat beberapa hal penting yang perlu diperhatikan dalam menunjang pembelajaran");
     psikologi[4] = new book1("Psikologi", "Psikologi Komunikasi", "Markus Utomo Sukendar", "Deepublish", "2019","Berbicara dengan berbagai kompleksitas nya akan menjadi sebuah nilai dalam diri sesorang");

  
     politik[0] = new book1("Politik", "Mengadvokasi Hak Sipil Politik", "Hendardi", "Gramedia", "2019","Buku ini merupakan bunga rampai yang secara khusus disusun untuk merekam pembelaan yang dilakukan oleh Hendardi");
    politik[1] = new book1("Politik", "Negara dan Politik Kesejahteraan", "Muhaimin Iskandar", "Gramedia", "2021","Negara yang makmur adalah negara yang memperhatikan kesejahteraan para rakyatnya");
    politik[2] = new book1("Politik", "Dramaturgi Politik Indonesia", "Muhamad Sulhan", "Intrans Publishing", "2020","Lika-liku perjalanan politik Indonesia akan dibahas dalam buku ini dan menjadi pedoman kehidupan bermasyarakat");
    politik[3] = new book1("Politik", "Keadaban Politik", "Luthfi J. Kurniawan", "Intrans Publishing", "2021","Maraknya kasus politik di Indonesia melibatkan banyak sekali pihak dari berbagai penjuru");
    politik[4] = new book1("Politik", "Restrukrisasi Politik Indonesia", "Agus Subagyo", "Kompas", "2020"," Buku ini merupakan lanjutan dari kumpulan esai sebelumnya yaitu, Kebebasan dan Moralitas, Kekuasaan dan Moralitas, dan Demokrasi dan Moral Politik");

   
     fiksi[0] = new book1("Fiksi", "Ronggeng Dukuh Paruk", "Ahmad Tohari", "Gramedia", "2003","Ronggeng Dukuh Paruk menceritakan kehidupan di dukuh kecil dan terpencil");
    fiksi[1] = new book1("Fiksi", "Cantik itu Luka", "Eka Kurniawan", "Gramedia", "2004","Kehidupan itu terus dijalaninya hingga ia memiliki tiga anak gadis yang kesemuanya cantik");
    fiksi[2] = new book1("Fiksi", "Dilan 1990", "Pidi Baiq", "Pastel Books(Mizan Group)", "2014","Berlatar tahun 1990 di sebuah sekolah menengah atas di Bandung, Milea pindah ke sekolah tersebut dari Jakarta");
    fiksi[3] = new book1("Fiksi", "Bumi Manusia", "Pramoedya Ananta Toer", "Hasta Mitra", "1980","Kisah yang diangkat adalah percintaaan warga pribumi dengan seorang gadis Indo yang merupakan keturunan Belanda.");
    fiksi[4] = new book1("Fiksi", "Tenggelamnya Kapal Van Der Wijck", "Haji Abdul Malik", "Gema Insani", "1938","Karya yang akan membuatkan pembaca turut tenggelam dalam emosi dan makna, seperti Tenggelamnya Kapal Van Der Wijck");

   
System.out.println("===============================================");
System.out.println("Silakan pilih kategori buku: \n 1. Teknologi \n 2.Filsafat \n 3. Sejarah \n 4. Agama \n 5. Psikologi \n 6. Politik \n 7.Fiksi");
int pilihan = in.nextInt();
System.out.println();

   switch (pilihan){
    case 1 :{
        teknologi[0].tampilkanKategori("Teknologi");
        for(int i = 0; i < teknologi.length; i++){
            teknologi[i].tampilkan();
        }
        break;
    }
    case 2 :{
        filsafat[0].tampilkanKategori("Filsafat");
        for(int i = 0; i < filsafat.length; i++){
            filsafat[i].tampilkan();
        }
        break;
    }
    case 3 :{
        sejarah[0].tampilkanKategori("Sejarah");
        for(int i = 0; i < sejarah.length; i++){
            sejarah[i].tampilkan();
        }
        break;  
    }
    case 4 :{
        agama[0].tampilkanKategori("Agama");
        for(int i = 0; i < agama.length; i++){
            agama[i].tampilkan();
        }
        break; 
    }
    case 5 :{
        psikologi[0].tampilkanKategori("Psikologi");
        for(int i = 0; i < psikologi.length; i++){
            psikologi[i].tampilkan();
        }
        break; 
    }
    case 6 :{
        politik[0].tampilkanKategori("Politik");
        for(int i = 0; i < politik.length; i++){
            politik[i].tampilkan();
        }
        break; 
    }
    case 7 :{
        politik[0].tampilkanKategori("Fiksi");
        for(int i = 0; i < fiksi.length; i++){
            fiksi[i].tampilkan();
        }
        break; 
    }
    default:
    if (pilihan >=8){
        System.out.println("ERROR!");
    } break;
    }
}
    
    
}

    

        
  




