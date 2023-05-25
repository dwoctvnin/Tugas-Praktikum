package Tugas7;

public class employee implements payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private invoice[] invoices;

    employee(int registrationNumber, String name, int salaryPerMonth, invoice[] invoices){
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalaryPerMonth(int salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public void setInvoices(invoice[] invoices) {
        this.invoices = invoices;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getName() {
        return name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public invoice[] getInvoices() {
        return invoices;
    }

    public double getPayableAmount(){
        double totalInvoicesAmount = 0;
        for (invoice invoice : invoices) {
            totalInvoicesAmount += invoice.getPayableAmount();
        }
        return this.salaryPerMonth - totalInvoicesAmount;
    }

    public void display(){
        System.out.println("\n===========================================================================");
        System.out.println("Employee name\t\t: " + this.name);
        System.out.println("Registration number\t: " + this.registrationNumber);
        System.out.println("Monthly salary\t\t: " +"Rp " + this.salaryPerMonth);
        System.out.println("-------------------------TRANSAKSI PEMBELIAN----------------------------");
        System.out.print("Nama Produk\t\tQuantity\t@\t\tSubtotal");
        for(invoice e : getInvoices()){
            System.out.printf("\n%10s\t\t%5d\t\t%2d\t\t%5d", e.getProductName(), e.getQuantity(), e.getPricePerItem(), e.getQuantity() * e.getPricePerItem());
        }
        System.out.println();
        System.out.printf("\nTotal gaji setelah dipotong hutang belanjaan\t: %.0f", this.getPayableAmount());
        System.out.println("\n===========================================================================");
    }
}