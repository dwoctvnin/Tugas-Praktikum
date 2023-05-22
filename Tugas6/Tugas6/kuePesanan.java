package Tugas6;

public class kuePesanan extends kue{
    private double berat;
    
    public kuePesanan(String nama, double harga, double berat){
        super(nama, harga);
        this.berat = berat;
    }
    public double getBerat() {
        return berat;
    }
    public double hitungHarga() {
        return this.berat * super.getHarga();
    }
}