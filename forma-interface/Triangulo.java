public class Triangulo implements Forma {
    private double altura;
    private double largura;

    public Triangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return (altura * largura) / 2;
    }
}
