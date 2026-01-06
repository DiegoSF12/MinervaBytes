package exercicios.I;

import java.util.List;
import java.util.ArrayList;

public class MaiorValorList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Integer maiorValor = 0;

        numeros.add(89);
        numeros.add(871);
        numeros.add(764);
        numeros.add(987);
        numeros.add(22);
        numeros.add(129);
        numeros.add(1000);

        for(Integer numero : numeros){
            if(numero > 0 && numero > maiorValor){
                maiorValor = numero;
            }
        }

        System.out.printf("O maior valor presente no conjunto é: %d", maiorValor);
    }
}
