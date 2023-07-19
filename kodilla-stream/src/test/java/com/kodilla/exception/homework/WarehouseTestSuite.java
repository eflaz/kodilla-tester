package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testIsOrderNumberActive() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order 1"));
        warehouse.addOrder(new Order("Order 2"));
        warehouse.addOrder(new Order("Order 3"));
        warehouse.addOrder(new Order("Order 4"));
        warehouse.addOrder(new Order("Order 5"));
        // when
        Order order = warehouse.getOrder("Order 2");
        // then
        Order expected = new Order("Order 2");
        assertEquals(expected, order);
    }

    @Test
    public void getTestIsOrderNumberActive_withException() {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("Order 1"));
        warehouse.addOrder(new Order("Order 2"));
        warehouse.addOrder(new Order("Order 3"));
        warehouse.addOrder(new Order("Order 4"));
        warehouse.addOrder(new Order("Order 5"));

        // when
        // then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("Order 9"));
    }
}
