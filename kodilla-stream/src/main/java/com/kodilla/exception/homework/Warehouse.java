package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orderList.stream().filter(orderNumber -> orderNumber.getNumber().equals(number))
                .findAny().orElseThrow(OrderDoesntExistException::new);

    }
}
