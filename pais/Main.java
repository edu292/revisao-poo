import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pais brasil = new Pais("BRA", "Brasil", 214000000, 8515767);
        Pais argentina = new Pais("ARG", "Argentina", 45800000, 2780400);
        Pais uruguai = new Pais("URY", "Uruguai", 3420000, 176215);
        Pais chile = new Pais("CHL", "Chile", 19500000, 756102);

        brasil.adicionarVizinho(argentina);
        brasil.adicionarVizinho(uruguai);

        argentina.adicionarVizinho(brasil);
        argentina.adicionarVizinho(uruguai);
        argentina.adicionarVizinho(chile);

        System.out.println("Nome: " + brasil.getNome());
        System.out.println("ISO: " + brasil.getIso());
        System.out.println("População: " + brasil.getPopulacao());
        System.out.println("Área: " + brasil.getAreaKM() + " km²");
        System.out.println("Densidade Populacional: " + brasil.getDensidadePopulacional());

        System.out.println();

        Pais brasilCopia = new Pais("BRA", "Brasil", 214000000, 8515767);
        System.out.println("Brasil é igual a Brasil Cópia? " + brasil.igual(brasilCopia));
        System.out.println("Brasil é igual a Argentina? " + brasil.igual(argentina));

        System.out.println();

        System.out.println("Argentina é vizinha do Brasil? " + brasil.isVizinho(argentina));
        System.out.println("Chile é vizinho do Brasil? " + brasil.isVizinho(chile));

        System.out.println();

        for (Pais vizinho : brasil.getVizinhos()) {
            System.out.println("- " + vizinho.getNome());
        }

        System.out.println();

        ArrayList<Pais> vizinhosEmComum = Pais.getVizinhosEmComum(brasil, argentina);
        for (Pais vizinho : vizinhosEmComum) {
            System.out.println("- " + vizinho.getNome());
        }
    }
}
