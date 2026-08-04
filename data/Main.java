public class Main {
    public static void main(String[] args) {
        Data data = new Data(12, 9, 2007);

        data.definirFormato("dd/mm/aaaa");
        data.imprimir();

        data.definirFormato("dddd/m/aaaa");
        data.imprimir();

        data.definirFormato("d:m:aa");
        data.imprimir();

        data.definirFormato("aaa/m/d");
        data.imprimir();

    }
}
