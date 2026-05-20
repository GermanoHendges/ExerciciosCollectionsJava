import map.ContagemPalavras;
import map.Dicionario;
import set.ConjuntoPalavrasUnicas;

public class Main {
    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();
        contagem.adicionarPalavra("Bernardo" , 9);
        contagem.adicionarPalavra("João" , 2);
        contagem.adicionarPalavra("Lucas" , 10);
        contagem.adicionarPalavra("Lucas" , 2);
        contagem.exibirContagemPalavras();
        System.out.println(contagem.encontrarPalavraMaisFrequente());
    }
}