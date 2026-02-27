package secao12.enumeracaoComposicao.atividades.models;

import secao12.enumeracaoComposicao.atividades.enums.OrderStatus;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Order {
    static final SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private OrderStatus status;
    ArrayList<OrderItem> items = new ArrayList<>();

    public Order(OrderStatus status){
        this.status = status;
        moment = new Date();
    }

    public Date getMoment() {
        return moment;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    
    public OrderStatus getStatus() {
        return this.status;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total() {
        double total = 0;
        for (OrderItem x : items) {
            total += x.subTotal();
        }
        return total;
    }
    
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("Order Summary:\n");
        sb.append(String.format("Order moment: %s", sdf1.format(this.getMoment())));
        sb.append(String.format("Order status: %s", this.getStatus()));
        sb.append(String.format("Client: %s (%s) - %s", this.get().getName(), ))

    }
}