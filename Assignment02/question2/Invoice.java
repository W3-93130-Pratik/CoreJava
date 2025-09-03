//Q2. Create a class called Invoice that a hardware
// store might use to represent an invoice for an item
// sold at the store. An Invoice should include four pieces of
// information as fields—a part number (type String), a part
// description (type String), a quantity of the item being
// purchased (type int) and a price per item (double).
// Your class should have a constructor that initializes the
// four instance variables. Provide a set and a get method for
// each instance variable. calculates the invoice amount
// (i.e. multiplies the quantity by the price per item),
// then returns the amount as a double value.
// If the quantity is not positive, it should be set to 0.
// If the price per item is not positive, it should be set to 0.0.
// Write a test application named InvoiceTest that demonstrate
// class Invoice’s capabilities.

package com.assignment02.question2;

public class Invoice {
    private String partNumber;
    private String description;
    private int quantityPurchased;
    private double pricePerItem;


    public Invoice(String partNumber, String description, int quantityPurchased, double pricePerItem) {
        this.partNumber = partNumber;
        this.description = description;
        this.quantityPurchased = quantityPurchased;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber(){
        return partNumber;
    }

    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return description;
    }

    public void setPartDescription(String partDescription) {
        this.description = partDescription;
    }

    public int getQuantityPurchased(){
        return quantityPurchased;
    }

    public void setQuantityPurchased(int quantityPurchased){
        this.quantityPurchased = quantityPurchased;
    }

    public double setPricePerItem(){
        return pricePerItem;
    }

    public void setPricePerItem(int pricePerItem){
        this.pricePerItem = pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantityPurchased * pricePerItem;
    }


    public static void main(String[] args) {
        Invoice item1 = new Invoice("100", "Hammer", 5, 12.0);
        Invoice item2 = new Invoice("101", "Screw", 6, 24.0);

        System.out.println("Item 1: " + item1.getPartDescription());
        System.out.println("Amount: " + item1.getInvoiceAmount());
        System.out.println("----------------------");
        System.out.println("Item 2: " + item2.getPartDescription());
        System.out.println("Amount: " + item2.getInvoiceAmount());
    }
}
