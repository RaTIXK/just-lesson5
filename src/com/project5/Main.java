package com.project5;

public class Main {

     public static void main(String[] args) {
         PotatoRestaurant restaurant = new PotatoRestaurant();
         restaurant.addOrder(new Order[]{
                 new Order("Order_1", 4, .50),
                 new Order("Order_2", 3, 2.50),
                 new Order("Order_3", 2, 3.50),
                 new Order(),
         });

         restaurant.serve();
         restaurant.serve();
         restaurant.serve();
         restaurant.serve();
    }

}
