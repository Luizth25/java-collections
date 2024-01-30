package list.Ordenacap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros  implements Comparable<Integer>{
    List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero)
    {
        this.listaNumeros.add(numero);
    }

    @Override
    public int compareTo(Integer numero) {
        return Integer.compare(numero, listaNumeros.get(numero));
    }
    public List<Integer> ordenarAscendente()
    {
        List<Integer> numerosPorOrdemAscendente = new ArrayList<>(this.listaNumeros);
        if(!listaNumeros.isEmpty())
        {
        Collections.sort(numerosPorOrdemAscendente);
        }
        return numerosPorOrdemAscendente;
    }

    public  List<Integer> ordenarDescendente()
    {
        List<Integer> numerosPorOrdemDescendente = new ArrayList<>(this.listaNumeros);
        if (!listaNumeros.isEmpty()) {
            numerosPorOrdemDescendente.sort(Collections.reverseOrder());
        }
            return numerosPorOrdemDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(42);
        ordenacaoNumeros.adicionarNumero(5);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}

class ComparatorPorDecendente implements Comparator<Integer> {

    @Override
    public int compare(Integer numero1, Integer numero2) {
        return Integer.compare(numero1, numero2);
    }
}