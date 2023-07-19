package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order 1"));
        warehouse.addOrder(new Order("Order 2"));
        warehouse.addOrder(new Order("Order 3"));
        warehouse.addOrder(new Order("Order 4"));
        warehouse.addOrder(new Order("Order 5"));


        try {
            warehouse.getOrder("Order 3");
            System.out.println("Order number is active.");
        } catch (OrderDoesntExistException e) {
            System.out.println("The order is not active. Please try again.");
        }


        try {
            warehouse.getOrder("Order 7");
            System.out.println("Order number is active.");
        } catch (OrderDoesntExistException e) {
            System.out.println("The order is not active. Please try again.");
        }


    }
}
