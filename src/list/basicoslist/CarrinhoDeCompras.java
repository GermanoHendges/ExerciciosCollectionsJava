package list.basicoslist;

import java.util.ArrayList;

public class CarrinhoDeCompras {

    private ArrayList<Item> carrinho; // atributo da classe

    public CarrinhoDeCompras(){
        this.carrinho = new ArrayList<>(); // inicializa no construtor
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        carrinho.add(item);
    }

    public void removerItem(String nome){
        ArrayList<Item> itensASeremRemovidos = new ArrayList<>();
        for (Item item : carrinho) {
            if(item.getNome().equalsIgnoreCase(nome)){
                itensASeremRemovidos.add(item);
            }
        }
        carrinho.removeAll(itensASeremRemovidos);
    }
    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item item : carrinho){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }
    public void exibirItens(){
        System.out.println("Itens adicionados: ");
        for (Item item : carrinho){
            System.out.println(item.getNome());
        }
    }

}