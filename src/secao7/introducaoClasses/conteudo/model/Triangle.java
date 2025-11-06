package secao7.introducaoClasses.conteudo.problemaExemplo.model;

public class Triangle {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangle(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    public double areaTriangulo(){
        if(ladoA + ladoB <= ladoC || ladoC + ladoA <= ladoB){
            System.out.println("A medidas fornecidas são invalidas para um triângulo");
            return 0;
        }
        else{
            double p = (ladoA + ladoB + ladoC) / 2;
            return Math.sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
        }
    }

}
