package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumero {
    private List<Integer> listaNumero;

    public SomaNumero() {this.listaNumero = new ArrayList<>();}

    public void adicionarNumero(int numero)
    {
        this.listaNumero.add(numero);
    }

    public int calcularSoma()
    {
        int somaTotal = 0;
        if(!listaNumero.isEmpty())
        {
            for (int numero : listaNumero)
            {
                somaTotal += numero;
            }
        }
        return somaTotal;
    }

    public int encontrarMaiorNumero()
    {
        int maiorNumero = Integer.MIN_VALUE;
        if(!listaNumero.isEmpty())
        {
            for (int numero : listaNumero)
            {
                if (numero >= maiorNumero)
                {
                    maiorNumero = numero;
                }
            }
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero()
    {
        int menorNumero = Integer.MAX_VALUE;
        if(!listaNumero.isEmpty())
        {
            for (int numero : listaNumero)
            {
                if (numero <= menorNumero)
                {
                    menorNumero = numero;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros()
    {
        if(!listaNumero.isEmpty())
        {
            System.out.println(this.listaNumero);
        } else {
            System.out.println("A lista de numeros esta vazia");
        }
    }

    public static void main(String[] args) {
        SomaNumero somaNumero = new SomaNumero();
        somaNumero.adicionarNumero(5);
        somaNumero.adicionarNumero(4);
        somaNumero.adicionarNumero(3);
        somaNumero.adicionarNumero(2);
        somaNumero.adicionarNumero(1);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumero.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumero.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumero.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumero.encontrarMenorNumero());
    }

}
