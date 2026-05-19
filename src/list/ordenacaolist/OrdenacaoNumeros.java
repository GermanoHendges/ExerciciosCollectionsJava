package list.ordenacaolist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class OrdenacaoNumeros {
    private ArrayList<Integer> numeros = new ArrayList<Integer>();
    public void adicionarNumero(int numero){
        numeros.add(numero);
    }
    public void ordenarCrescente(){
        Collections.sort(numeros);
        System.out.println(numeros);
    }

    public void ordenarDecrescente(){
        Collections.sort(numeros, Collections.reverseOrder());

    }

}
