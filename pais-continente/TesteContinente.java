public class TesteContinente {
    public static void main(String[] args) {
        Continente americaDoSul = new Continente("América do Sul");

        Pais brasil = new Pais("BRA", "Brasil", 214000000, 8515767);
        Pais argentina = new Pais("ARG", "Argentina", 45800000, 2780400);
        Pais uruguai = new Pais("URY", "Uruguai", 3420000, 176215);
        Pais chile = new Pais("CHL", "Chile", 19500000, 756102);

        americaDoSul.adicionarPais(brasil);
        americaDoSul.adicionarPais(argentina);
        americaDoSul.adicionarPais(uruguai);
        americaDoSul.adicionarPais(chile);

        System.out.println("Área Total: " + americaDoSul.getAreaKM() + " km²");
        System.out.println("População Total: " + americaDoSul.getPopulacao() + " habitantes");

        System.out.println("Densidade Populacional: " + americaDoSul.getDensidadePopulacional());

        System.out.println();

        System.out.println("País com maior população: " + americaDoSul.getPaisMaiorPopulacao().getNome()
                + ": " + americaDoSul.getPaisMaiorPopulacao().getPopulacao());
        System.out.println("País com menor população: " + americaDoSul.getPaisMenorPopulacao().getNome()
                + ": " + americaDoSul.getPaisMenorPopulacao().getPopulacao());

        System.out.println();

        System.out.println("País com maior área: " + americaDoSul.getPaisMaiorDimensao().getNome()
                + ": " + americaDoSul.getPaisMaiorDimensao().getAreaKM() + " km2");
        System.out.println("País com menor área: " + americaDoSul.getPaisMenorDimensao().getNome()
                + ": " + americaDoSul.getPaisMenorDimensao().getAreaKM() + " km2");

        System.out.println();

        System.out.println("Razão Maior/Menor Área: " + americaDoSul.getRazaoMaiorMenorPais());
    }
}
