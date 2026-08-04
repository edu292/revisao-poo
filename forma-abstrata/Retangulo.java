public class Retangulo extends Forma {

    public Retangulo(double altura, double largura) {
        super(altura, largura);
    }

    @Override
    public double calcularArea() {
        return altura * largura;
    }

}
