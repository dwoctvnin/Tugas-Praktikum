package Tugas7;

public class main {
    public static void main(String[] args) {
        invoice invoice1 = new invoice("Shampoo", 3, 25000);
        invoice invoice2 = new invoice("Case", 1, 30000);
        invoice invoice3 = new invoice("Snack",12, 12000);
        invoice invoice4 = new invoice("Detergen", 2, 14000);
        invoice[] invoices1 = {invoice1, invoice2, invoice3, invoice4};

        employee employee1 = new employee(12170890, "Ananda Annisa Sungkar", 7000000, invoices1);
        employee1.display();

        invoice invoice5 = new invoice("Sandal", 2, 15000);
        invoice invoice6 = new invoice("HVS", 4, 35000);
        invoice invoice7 = new invoice("Jacket", 1, 95000);
        invoice[] invoices2 = {invoice5, invoice6, invoice7};

        employee employee2 = new employee(12189087, "Dwi Oktaviani Naibaho", 9000000, invoices2);
        employee2.display();
    }
}