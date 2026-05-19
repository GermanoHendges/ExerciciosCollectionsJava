import set.ConjuntoPalavrasUnicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();
        conjunto.adicionarPalavra("peixe");
        conjunto.adicionarPalavra("galho");
        conjunto.adicionarPalavra("banana");
        conjunto.exibirPalavrasUnicas();
    }
}