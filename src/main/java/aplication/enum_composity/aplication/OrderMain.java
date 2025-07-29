package aplication.enum_composity.aplication;

import aplication.enum_composity.entities.OrderStatus;
import aplication.enum_composity.entities.Order;


import java.time.LocalDateTime;

public class OrderMain {
    public static void main(String[] args) {
        Order order = new Order(1080, LocalDateTime.now(), OrderStatus.PENDING_PAYMENT);
        //Para converter uma string para um objeto enum, devemos usar o metodo valueOf, da seguinte forma

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);

        System.out.println(order);
    }
}
