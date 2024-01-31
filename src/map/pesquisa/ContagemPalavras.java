package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem)
    {
        contagemPalavrasMap.put(palavra,contagem );
    }

    public void removerPalavra(String palavra)
    {
        if(!contagemPalavrasMap.isEmpty())
        {
            contagemPalavrasMap.remove(palavra);
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        for (int contagem : contagemPalavrasMap.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente()
    {
        String palavraMaisFrquente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrquente = entry.getKey();
            }
        }
        return palavraMaisFrquente;

    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
        // Remove a linguagens passada por parametro
        contagemLinguagens.removerPalavra("C#");
        // Exibe a contagem total de linguagens depois de remover
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");
    }
}
