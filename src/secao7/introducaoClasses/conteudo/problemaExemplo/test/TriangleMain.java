package secao7.introducaoClasses.conteudo.problemaExemplo.test;

import secao7.introducaoClasses.conteudo.problemaExemplo.model.Triangle;

public class TriangleMain {
    public static void main(String[] args) {
        Triangle tr = new Triangle(5,5,9);
        double area = tr.areaTriangulo();
        System.out.printf("A área é igual a: %.2f", area);
    }
}
