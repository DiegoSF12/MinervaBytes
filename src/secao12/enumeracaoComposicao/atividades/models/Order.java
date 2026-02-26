package secao12.enumeracaoComposicao.atividades.models;

import secao12.enumeracaoComposicao.atividades.enums.OrderStatus;
import java.util.ArrayList;
import java.util.Date;

public class Order{
    private Date moment;
    private OrderStatus status;
    ArrayList<OrderItem> items = new ArrayList<>();

    public Order(Date moment, OrderStatus status){
        this.moment = moment;
        this.status = status;
    }

    public void setMoment(Date moment){
        this.moment = moment;
    } 

    public Date getDate(){
        return moment;
    }

    public void setStatus(OrderStatus status){
        this.status = status;
    }
    public voi


}