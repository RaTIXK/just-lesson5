package com.project5;
public class OrderNode {

    private OrderNode prev;
    private  OrderNode next;
    private Order value;

    public OrderNode() {
    }

    public OrderNode getPrev() {
        return prev;
    }

    public void setPrev(OrderNode prev) {
        this.prev = prev;
    }

    public OrderNode(OrderNode prev, OrderNode next, Order value) {
        this.prev = prev;
        this.next = next;
        this.value = value;
    }

    public OrderNode getNext() {
        return next;
    }

    public void setNext(OrderNode next) {
        this.next = next;
    }

    public Order getValue() {
        return value;
    }

    public void setValue(Order value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "OrderNode{" +
                "prev=" + prev +
                ", next=" + next +
                ", value=" + value +
                '}';
    }
}
