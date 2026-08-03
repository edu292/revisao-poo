public class Main {

    public static void main(String[] args) {
        Contador c = new Contador();
        System.out.println("Um novo contador foi criado com o valor de: " + c.get());
        c.incrementar();
        c.incrementar();
        c.incrementar();
        System.out.println("O valor do contador é: " + c.get());
        c.zerar();
        System.out.println("O contador foi reiniciado, seu valor agora é: " + c.get());
    }
}
