package map;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPorPreco implements Comparator<Livro> {

    @Override
    public int compare(Livro o1, Livro o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
