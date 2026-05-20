package map;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class LivrariaOnline {
    Map<String, Livro> livraria = new HashMap<String,Livro>();

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livraria.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        String chaveRemover = null;
        for(Map.Entry<String, Livro> entry : livraria.entrySet()){
            if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                chaveRemover = entry.getKey();
                break;
            }
        }
        livraria.remove(chaveRemover);
    }

    public void exibirLivrosOrdenadosPorPreco(){
        List<Livro> livrosOrdenados = new ArrayList<Livro>(livraria.values());
        Collections.sort(livrosOrdenados, new ComparatorPorPreco());
        System.out.println(livrosOrdenados);
    }

    public void pesquisarLivrosPorAutor(String autor){
        List<String> encontrados = new ArrayList<String>();
        for(Livro l:livraria.values()){
            if (l.getAutor().equalsIgnoreCase(autor)){
                encontrados.add(l.getTitulo());
            }
        }
        System.out.println(encontrados);
    }
    public void obterLivroMaisCaro(){
        Livro maisCaro = null;
        double maiorValor = 0.0;
        for(Livro l :livraria.values()){
            if(l.getPreco()>maiorValor){
                maiorValor = l.getPreco();
                maisCaro = l;
            }
        }
        System.out.println(maisCaro);
    }

    public void maisBarato(){
        Livro maisBarato = null;
        double menorValor = Double.MAX_VALUE;
        for(Livro l : livraria.values()){
            if(l.getPreco() < menorValor){
                menorValor = l.getPreco();
                maisBarato = l;
            }
        }
        System.out.println(maisBarato);
    }



}
