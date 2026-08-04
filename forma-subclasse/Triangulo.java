public class Triangulo extends Retangulo {

    public Triangulo(double altura, double largura) {
        super(altura, largura);
    }

    @Override
    public double calcularArea() {
        return super.calcularArea() / 2;
    }
}
