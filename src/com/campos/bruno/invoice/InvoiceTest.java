package com.campos.bruno.invoice;

public class InvoiceTest {

    public static void main(String[] args) {

        Invoice invoice = new Invoice("100", "First invoice", 20, 100);

        System.out.println("Invoice #1: " + invoice.getInvoiceAmount());
        System.out.println(invoice.partNum);

    }

}