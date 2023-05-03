import java.util.Scanner;
public class mainJacket {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.println("Welcome to Labkomdas Store!");
    System.out.println("================ Daftar Barang ================");
    System.out.printf("%s", """
                    |TIPE| Nama jacket | Harga (@) |
                    | A  |  jacket A   | Rp 100000 |
                    | B  |  jacket B   | Rp 125000 |
                    | C  |  jacket C   | Rp 175000 |
            ================================================
            """);
    System.out.print("Masukkan tipe jacket : ");
    String tipe = input.next();
    System.out.print("Jumlah jacket        : ");
    int jumlah = input.nextInt();
    System.out.println();
    jacket pesanan = new jacket(tipe, jumlah);
    pesanan.tampilkan();
}
}