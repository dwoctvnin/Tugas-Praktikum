public class jacket {
    String tipe;
    int harga;
    int jumlah;
    final int jacketA = 100000;
    final int jacketB = 125000;
    final int jacketC = 175000;
    public jacket (String tipe, int jumlah){
        this.tipe = tipe;
        this.jumlah = jumlah;
    }
    void hargaA(){
        if (jumlah>100)
            harga = jacketA - 5000;
        else
            harga = jacketA;
        }
    void hargaB(){
        if (jumlah>100)
            harga = jacketB - 5000;
        else
            harga = jacketB;
        }
    void hargaC(){
        if (jumlah>100)
            harga = jacketC - 15000;
        else
            harga = jacketC;
        }

    void tampilkan(){
        if (tipe.equalsIgnoreCase("A")) {
            hargaA();
            setPesanan();
        }
        else if (tipe.equalsIgnoreCase("B")) {
            hargaB();
            setPesanan();
        }
        else if (tipe.equalsIgnoreCase("C")) {
            hargaC();
            setPesanan();
        }
        else 
        System.out.println("ERROR : Silahkan menginput tipe Jacket yang tersedia");
        }
    void setPesanan(){
        String tipe_jacket = null;
        if (tipe.equalsIgnoreCase("A"))
            tipe_jacket = "jacket A";
        else if (tipe.equalsIgnoreCase("B")) {
            tipe_jacket = "jacket B";
        } else if (tipe.equalsIgnoreCase("C")) {
            tipe_jacket = "jacket C";
        }
        System.out.println("Anda berhasil melakukan pemesanan!");
        System.out.println("Tipe Jacket        : " + tipe_jacket);
        System.out.println("Jumlah Pembelian   : " + jumlah + " pcs");
        System.out.println("Harga @            : " + "Rp " + harga);
        System.out.println("Total harga        : " + "Rp " + harga*jumlah);

        if (jumlah > 100 && tipe.equalsIgnoreCase("A")){
            System.out.println("-- Pembelian barang lebih dari 100 pcs mendapatkan potongan harga --");
        } else if (jumlah > 100 && tipe.equalsIgnoreCase("B")){
            System.out.println("-- Pembelian barang lebih dari 100 pcs mendapatkan potongan harga --");
        } else if (jumlah > 100 && tipe.equalsIgnoreCase("C")){
            System.out.println("-- Pembelian barang lebih dari 100 pcs mendapatkan potongan harga --");
        }
    }
}
