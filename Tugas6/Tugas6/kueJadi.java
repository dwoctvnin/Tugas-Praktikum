package Tugas6;

public class kueJadi extends kue {
    private double jumlah;

    public kueJadi(String nama, double harga, double jumlah){
        super(nama, harga);
        this.jumlah = jumlah;
    }
    public double getJumlah() {
        return jumlah;
    }
    public double hitungHarga() {
        return super.getHarga() * this.jumlah * 2;
    }
}