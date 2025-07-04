package aplication.enum_composity.entities;



import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;
    private LocalDate date01;

    DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Order(){

    }
    public Order(Integer id, LocalDate date01, OrderStatus status){
        this.id = id;
        this.date01 = date01;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment ;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public String toString(){
        return "ID: " + this.getId() + "\nData: " + this.date01.format(ftm1) + "\nStatus: " + this.getStatus();
    }
}
