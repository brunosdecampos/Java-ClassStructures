package com.campos.bruno.invoice;

class Invoice {

    String partNum;
    private String desc;
    private int quantity;
    private double price;

    Invoice(String partNum, String desc, int quantity, double price) {
        this.partNum = partNum;
        this.desc = desc;
        this.quantity = quantity;
        this.price = price;
    }

    double getInvoiceAmount() {
        if (quantity < 0)
            quantity = 0;

        if (price < 0)
            price = 0.0;

        return quantity * price;
    }

    String getPartNum() {
        return partNum;
    }

    void setPartNum(String partNum) {
        this.partNum = partNum;
    }

    String getDesc() {
        return desc;
    }

    void setDesc(String desc) {
        this.desc = desc;
    }

    int getQuantity() {
        return quantity;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

}