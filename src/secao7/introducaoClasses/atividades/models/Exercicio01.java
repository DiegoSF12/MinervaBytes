/*
     Fazer um programa para ler os valores da largura e altura 
    de um retângulo. Em seguida, mostrar na tela o valor de 
    sua área, perímetro e diagonal. Usar uma classe como 
    mostrado no projeto ao lado
*/
package secao7.introducaoClasses.atividades.models;

public class Exercicio01 {
    private double width;
    private double height;

    public Exercicio01(double width, double height){
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double areaRetangulo(){
        return width * height;
    }
    public double perimetroRetangulo(){
        return 2 * (width + height);
    }
    public double diagonalRetangulo(){
        return  Math.sqrt((Math.pow(width, 2) + Math.pow(height, 2)));
    }
    public void info(){
        System.out.println("Informações do Retangulo");
        System.out.printf("Altura: %.2f\n", height);
        System.out.printf("Largura : %.2f\n", width);
        System.out.printf("Area total: %.2f\nPerimetro total: %.2f\nDiagonal: %.2f\n", this.areaRetangulo(), this.perimetroRetangulo(), this.diagonalRetangulo());

    }
}
