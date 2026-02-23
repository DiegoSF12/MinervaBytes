package secao12.enumeracaoComposicao.conteudo.models;

import secao12.enumeracaoComposicao.conteudo.models.enums.OrderStatus;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Order {
    private Integer id;
    private LocalDate moment;
    private OrderStatus status;
    public Order(){

    }
    public Order(Integer id, LocalDate moment, OrderStatus status){
        this.id = id;
        this.moment = moment;
        this.status = status;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return this.id;
    }
    public void setMoment(){
        this.moment = LocalDate.now();
    }
    public LocalDate getLocal(){
        return this.moment;
    }
    public void setOrderStatus(OrderStatus status){
        this.status = status;
    }
    public OrderStatus getStatus(){
        return this.status;
    }
    @Override
    public String toString(){
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("==============================================\nID: %d\nData Pedido: %s\nStatus: %s\n==============================================", this.getId() ,fmt1.format(this.getLocal()),this.getStatus());
    }
}
