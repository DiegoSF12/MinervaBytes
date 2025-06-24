package aplication;

public class TriangleEntitie {
    public double a;
    public double b;
    public double c;

    public TriangleEntitie(){

    }
    public double area(){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
