public class Triangulo extends Forma {

    public Triangulo(double altura, double largura) {
        super(altura, largura);
    }

    @Override
    public double calcularArea() {
        return (this.altura * this.largura) / 2;
    }

}
