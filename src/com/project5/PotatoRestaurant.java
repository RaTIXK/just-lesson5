package com.project5;
public class PotatoRestaurant {
    private OrderLinkedList orderLinkedList = new OrderLinkedList();
    public PotatoRestaurant() {
    }



    public void addOrder(Order order) {
        orderLinkedList.addOrder(order);
        System.out.println("Added Order:" + order);
    }


    public void addOrder(Order... orders) {
        for (Order order : orders) {
            addOrder(order);
        }
    }

    public void serve() {

        final Order order = orderLinkedList.popOrderNode().getValue();
        System.out.printf("Order: %s, Amount: %d has been served. It cost: %.2f, total: %.2f\n",
                order.getName(), order.getAmount(), order.getSinglePrice(), order.getSinglePrice() * order.getAmount());

    }

}
