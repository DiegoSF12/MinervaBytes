package basic;

public class SplitString {
    public static void main(String[] args){
        String principal = "Lorem ipsum dolor";
        String[] vect = principal.split(" ");

        for(String i:vect){
            System.out.println(i);
        }
    }
}
