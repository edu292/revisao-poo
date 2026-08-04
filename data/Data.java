public class Data {
    private int dia;
    private int mes;
    private int ano;
    private String formato;

    public Data(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31) {
            throw new IllegalArgumentException("O dia deve ser entre 1 e 31");
        }

        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("O mês dever ser entre 1 e 12");
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void definirFormato(String formato) {
        this.formato = formato;
    }

    public void imprimir() {
        String resultado = "";
        char grupoAtual = '\0';
        int tamanhoGrupo = 1;
        char[] chars = java.util.Arrays.copyOf(formato.toCharArray(), formato.length() + 1);
        for (char c : chars) {
            if (c == grupoAtual) {
                tamanhoGrupo++;
                continue;
            }

            if (grupoAtual == '\0') {
                grupoAtual = c;
                tamanhoGrupo = 1;
                continue;
            }

            int parteData = 0;
            switch (grupoAtual) {
                case 'd' -> parteData = this.dia;
                case 'm' -> parteData = this.mes;
                case 'a' -> parteData = this.ano;
            }
            long modulo = (long) Math.pow(10, tamanhoGrupo);
            resultado += String.format("%0" + tamanhoGrupo + "d", parteData % modulo);

            if (c != 'd' && c != 'm' && c != 'a' && c != '\0') {
                resultado += c;
                grupoAtual = '\0';
                continue;
            }

            grupoAtual = c;
            tamanhoGrupo = 1;
        }

        System.out.println(resultado);
    }
}
