package secao12.enumeracaoComposicao.atividades.models;

import secao12.enumeracaoComposicao.atividades.enums.OrderStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Order {
    static final SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private OrderStatus status;
    
    private Client client;
    List<OrderItem> items = new ArrayList<>();

    public Order(OrderStatus status, Client client){
        this.status = status;
        this.client = client;
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

    public void removeItem(OrderItem item) {
        items.remove(item);
    }
    
    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return this.client;
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
        sb.append("ORDER SUMMARY: \n");
        sb.append(String.format("Order moment: %s\n", sdf1.format(this.getMoment()).toString()));
        sb.append(String.format("Order status: %s\n", this.getStatus()));
        sb.append(String.format("Client: %s (%s) - %s\n", client.getName(),sdf1.format(client.getBirthDate()), client.getEmail()));
        sb.append("Order items:\n");
        for (OrderItem i : items) {

            sb.append(String.format("%s,Quantity: %d, Subtotal: $%.2f\n", i.getProduct(), i.getQuantity(),i.subTotal()));
        }
        sb.append(String.format("Total price: $%.2f\n", this.total()));
        return sb.toString();
    }
}