public abstract class Forma {
    protected double altura;
    protected double largura;

    public Forma(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public abstract double calcularArea();
}
