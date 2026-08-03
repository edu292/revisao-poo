import java.util.ArrayList;

public class Continente {
    private String nome;
    private ArrayList<Pais> paises;

    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarPais(Pais p) {
        this.paises.add(p);
    }

    public int getAreaKM() {
        int area = 0;
        for (Pais pais : paises) {
            area += pais.getAreaKM();
        }

        return area;
    }

    public int getPopulacao() {
        int populacao = 0;
        for (Pais pais : paises) {
            populacao += pais.getPopulacao();
        }

        return populacao;
    }

    public double getDensidadePopulacional() {
        return (double) this.getPopulacao() / (double) this.getAreaKM();
    }

    public Pais getPaisMaiorPopulacao() {
        if (paises.isEmpty()) {
            return null;
        }

        Pais maisPopuloso = paises.get(0);
        int maiorPopulacao = maisPopuloso.getPopulacao();
        for (int i = 1; i < paises.size(); i++) {
            Pais pais = paises.get(i);
            int populacao = pais.getPopulacao();
            if (populacao > maiorPopulacao) {
                maisPopuloso = pais;
                maiorPopulacao = populacao;
            }
        }

        return maisPopuloso;
    }

    public Pais getPaisMenorPopulacao() {
        if (paises.isEmpty()) {
            return null;
        }

        Pais menosPopuloso = paises.get(0);
        int menorPopulacao = menosPopuloso.getPopulacao();
        for (int i = 1; i < paises.size(); i++) {
            Pais pais = paises.get(i);
            int populacao = pais.getPopulacao();
            if (populacao < menorPopulacao) {
                menosPopuloso = pais;
                menorPopulacao = populacao;
            }
        }

        return menosPopuloso;
    }

    public Pais getPaisMaiorDimensao() {
        if (paises.isEmpty()) {
            return null;
        }

        Pais maisExtenso = paises.get(0);
        int maiorArea = maisExtenso.getAreaKM();
        for (int i = 1; i < paises.size(); i++) {
            Pais pais = paises.get(i);
            int area = pais.getAreaKM();
            if (area > maiorArea) {
                maisExtenso = pais;
                maiorArea = area;
            }
        }

        return maisExtenso;
    }

    public Pais getPaisMenorDimensao() {
        if (paises.isEmpty()) {
            return null;
        }

        Pais menosExtenso = paises.get(0);
        int menorArea = menosExtenso.getAreaKM();
        for (int i = 1; i < paises.size(); i++) {
            Pais pais = paises.get(i);
            int area = pais.getAreaKM();
            if (area < menorArea) {
                menosExtenso = pais;
                menorArea = area;
            }
        }

        return menosExtenso;
    }

    public double getRazaoMaiorMenorPais() {
        return (double) this.getPaisMaiorDimensao().getAreaKM() / (double) this.getPaisMenorDimensao().getAreaKM();
    }
}
