package list.pesquisalist;

import java.util.ArrayList;

public class SomaNumeros {
    private ArrayList<Integer> numeros = new ArrayList<Integer>();
    public void adicionarNumero(int numero){
        numeros.add(numero);
    }
    public int calcularSoma(){
        int soma = 0;
        for (int numero:numeros){
            soma += numero;
        }
        return soma;
    }
    public int encontraMaiorNumero(){
        if (numeros.isEmpty()) {
            throw new RuntimeException("A lista está vazia");
        }
        int maior = numeros.get(0);
        for(int numero : numeros){
            if(numero > maior){
                maior = numero;
            }
        }
        return maior;
    }
    public int encontrarMenorNumero() {
        if (numeros.isEmpty()) {
            throw new RuntimeException("A lista está vazia");
        }
        int menor = numeros.get(0);
        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }
    public void exibirNumeros(){
        System.out.println("Exibindo os números: ");
        for(int numero: numeros){
            System.out.println(numero);
        }
    }
}

