package map;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String,Integer> contagemPalavras = new HashMap<String,Integer>();

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavras.put(palavra,contagem);
    }

    public void removerPalavra(String palavra){
        contagemPalavras.remove(palavra);
    }

    public void exibirContagemPalavras(){
        System.out.println(contagemPalavras);
    }

    public int encontrarPalavraMaisFrequente(){
        int maior = 0;
        for (int i : contagemPalavras.values()){
            if(i > maior){
                maior = i;
            }
        }
        return maior;

    }
}
