import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pais {
    private String iso;
    private String nome;
    private int populacao;
    private int areaKM;
    private ArrayList<Pais> vizinhos;

    public Pais(String iso, String nome, int populacao, int areaKM) {
        this.iso = iso;
        this.nome = nome;
        this.populacao = populacao;
        this.areaKM = areaKM;
        this.vizinhos = new ArrayList<>();
    }

    public String getIso() {
        return iso;
    }

    public void setIso(String iso) {
        this.iso = iso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public int getAreaKM() {
        return areaKM;
    }

    public void setAreaKM(int area_km) {
        this.areaKM = area_km;
    }

    public void adicionarVizinho(Pais visinho) {
        this.vizinhos.add(visinho);
    }

    public List<Pais> getVizinhos() {
        return Collections.unmodifiableList(this.vizinhos);
    }

    public boolean igual(Pais pais) {
        return this.iso == pais.iso;
    }

    public boolean isVizinho(Pais pais) {
        return this.vizinhos.contains(pais);
    }

    public double getDensidadePopulacional() {
        return (double) this.populacao / (double) this.areaKM;
    }

    static ArrayList<Pais> getVizinhosEmComum(Pais a, Pais b) {
        ArrayList<Pais> vizinhosEmComum = new ArrayList<>(a.getVizinhos());
        vizinhosEmComum.retainAll(b.getVizinhos());
        return vizinhosEmComum;
    }
}
