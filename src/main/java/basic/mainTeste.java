package basic;

public class mainTeste {
    public static int max(int a, int b, int c){
        int aux;
        if(a > b && a > c){
            aux = a;
        }
        else if(b > c){
            aux = b;
        }
        else{
            aux = c;
        }
        return aux;
    }
    public static void showResult(int a){
        System.out.printf("Higher: %d",a);
    }
}
