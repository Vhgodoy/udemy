package entities03;

import entities03.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
    private static SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date momentOrder = new Date();
    private OrderStatus status;

    public Order(Date momentOrder, OrderStatus status) {
        this.momentOrder = momentOrder;
        this.status = status;
    }

    public Order() {
    }

    public Date getMomentOrder() {
        return momentOrder;
    }

    public void setMomentOrder(Date momentOrder) {
        this.momentOrder = momentOrder;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}
