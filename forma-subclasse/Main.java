public class Main {
    public static void main(String[] args) {
        Forma a = new Triangulo(5.0, 5.0);
        Forma b = new Retangulo(4.0, 4.0);
        Forma c = new Triangulo(6.0, 6.0);

        System.out.println("A área do triângulo a é " + a.calcularArea());
        System.out.println("A área do retângulo b é " + b.calcularArea());
        System.out.println("A área de triângulo c é " + c.calcularArea());
    }
}
