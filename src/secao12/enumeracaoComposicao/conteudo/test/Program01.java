package secao12.enumeracaoComposicao.conteudo.test;

import secao12.enumeracaoComposicao.conteudo.models.Order;
import secao12.enumeracaoComposicao.conteudo.models.enums.OrderStatus;
import java.time.LocalDate;

public class Program01 {
    public static void main(String[] args) {
        Order order = new Order(1,LocalDate.now(),OrderStatus.PENDING_PAYMENT);
        System.out.println(order);
    }
}
