package Tugas7;

public class invoice implements payable{
    private String productName;
    private int quantity;
    private int pricePerItem;

    invoice(String productName, int quantity, int pricePerItem){
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPricePerItem(int pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPricePerItem() {
        return pricePerItem;
    }

    public double getPayableAmount(){
        return this.quantity * this.pricePerItem;
    }
}