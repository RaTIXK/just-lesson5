package com.project5;

public class Order {

    private String name;
    private int amount;
    private double singlePrice;

    {
        name= "No Name";
    }

    public Order() {
    }

    public Order(String name, int amount, double singlePrice) {
        this.name = name;
        this.amount = amount;
        this.singlePrice = singlePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getSinglePrice() {
        return singlePrice;
    }

    public void setSinglePrice(double singlePrice) {
        this.singlePrice = singlePrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", singlePrice=" + singlePrice +
                '}';
    }
}
