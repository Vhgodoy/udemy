package entities03;

import entities03.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private List<OrderItem> orderItem = new ArrayList<>();
    private Date momentOrder = new Date();
    private OrderStatus status;
    private Client client;
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

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void addItem(OrderItem product) {
        orderItem.add(product);
    }
    public void removeItem(OrderItem product) {
        orderItem.remove(product);
    }

    public double Total () {
        double sum = 0.0;
        for (OrderItem item : orderItem) {
            sum += item.subTotal();
        }
        return sum;
    }
}
