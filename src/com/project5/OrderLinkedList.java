package com.project5;

import java.awt.color.ICC_ColorSpace;

public class OrderLinkedList {

    private OrderNode head = null;

    public OrderLinkedList() {
    }

    public OrderLinkedList(OrderNode head) {
        this.head = head;
    }


    public OrderNode addOrder(Order order) {
        if (head == null) {
            head = new OrderNode(null, null, order);
            return head;
        }
        OrderNode cursor = head;
        while (cursor.getNext() != null){
            cursor = cursor.getNext();
        }
        OrderNode newNode = new OrderNode(null, null, order);
        cursor.setNext(newNode);
        return newNode;
    }


    public OrderNode popOrderNode(){
        if (head == null){
           return null;
        }


        OrderNode cursor = head;
        if(cursor.getNext() != null ) {



            cursor.getNext().setPrev(null);



        }
        head = cursor.getNext();
        return cursor;
    }
}


