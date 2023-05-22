package Tugas6;

public class mainKue {
    public static void main(String[] args) {
        
        kue jenisKue[] = new kue[20];
        jenisKue[0] = new kuePesanan("DadarGulung", 2000, 9);
        jenisKue[1] = new kuePesanan("Klepon", 2500, 7);
        jenisKue[2] = new kuePesanan("Onde-onde", 2500, 12);
        jenisKue[3] = new kuePesanan("Talam", 3000, 10);
        jenisKue[4] = new kuePesanan("Serabi", 5000, 40);
        jenisKue[5] = new kuePesanan("Lemper", 3000, 20);
        jenisKue[6] = new kuePesanan("Lumpia", 4000, 24);
        jenisKue[7] = new kuePesanan("Getuk Lindri", 2000, 30);
        jenisKue[8] = new kuePesanan("Kue Putu", 7000, 70);
        jenisKue[9] = new kuePesanan("Apem", 4500, 20);
        jenisKue[10] = new kueJadi("Masiro", 3500, 25);
        jenisKue[11] = new kueJadi("Wajik", 5000, 35);
        jenisKue[12] = new kueJadi("Kue Talam", 7000, 15);
        jenisKue[13] = new kueJadi("Bika Ambon", 24000, 10);
        jenisKue[14] = new kueJadi("Meranti", 35000, 25);
        jenisKue[15] = new kueJadi("Bikang", 6000, 60);
        jenisKue[16] = new kueJadi("Molen", 2000, 65);
        jenisKue[17] = new kueJadi("Kue Talam", 27000, 25);
        jenisKue[18] = new kueJadi("Cenil", 6000, 45);
        jenisKue[19] = new kueJadi("Lupis", 5000, 30);

        double totalHargaKuePesanan = 0, totalHargaKueJadi = 0, totalBerat = 0, totalJumlah = 0;
        double hargaKueTermahal = 0;
        String kueTermahal = "";

        for(int i = 0; i < jenisKue.length; i++){
            System.out.printf("\n%s\n", jenisKue[i]);
            if(jenisKue[i] instanceof kuePesanan){
                totalBerat += ((kuePesanan) jenisKue[i]).getBerat();
                totalHargaKuePesanan += ((kuePesanan) jenisKue[i]).hitungHarga();
            }
            else if(jenisKue[i] instanceof kueJadi){
                totalJumlah += ((kueJadi) jenisKue[i]).getJumlah();
                totalHargaKueJadi += ((kueJadi) jenisKue[i]).hitungHarga();
            }
            if(jenisKue[i].hitungHarga() > hargaKueTermahal) {
                hargaKueTermahal = jenisKue[i].hitungHarga();
                kueTermahal = jenisKue[i].getNama();
            }
            System.out.printf("%-15s: %s\n", "Jenis Kue", jenisKue[i].getClass().getSimpleName().equals("kuePesanan") ? "Kue Pesanan" : "Kue Jadi");
        }

        double totalHargaKue = totalHargaKueJadi + totalHargaKuePesanan;
        
        System.out.println("==================================================");
        System.out.println("Total Harga Semua Kue      : " + "Rp " + totalHargaKue);
        System.out.println("Total Harga Kue Jadi       : " + "Rp " + totalHargaKueJadi);
        System.out.println("Total Jumlah Kue Jadi      : " + totalJumlah);
        System.out.println("Total Harga Kue Pesanan    : " + "Rp " + totalHargaKuePesanan);
        System.out.println("Total Berat Kue Pesanan    : " + totalBerat);
        System.out.println("Kue dengan Harga Termahal  : " + kueTermahal);
        System.out.println("==================================================");
    }
}