package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoPalavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra)
    {
        conjuntoPalavrasUnicasSet.add(new String(palavra));
    }

    public void removerPalavra(String palavra)
    {
        String palavraUnicaParaRemover = null;
        for(String palavraUnica: conjuntoPalavrasUnicasSet)
        {
            if(Objects.equals(palavraUnica, palavra))
            {
                palavraUnicaParaRemover = palavra;
                break;
            }
        }
        conjuntoPalavrasUnicasSet.remove(palavraUnicaParaRemover);
    }

    public boolean verificarPalavra(String palavra)
    {
        return conjuntoPalavrasUnicasSet.contains(palavra);
    }


    public void exibirPalavrasUnicas() {
        System.out.println(conjuntoPalavrasUnicasSet);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

        // Adicionando linguagens únicas ao conjunto
        conjuntoLinguagens.adicionarPalavra("Java");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("JavaScript");
        conjuntoLinguagens.adicionarPalavra("Python");
        conjuntoLinguagens.adicionarPalavra("C++");
        conjuntoLinguagens.adicionarPalavra("Ruby");

        // Exibindo as linguagens únicas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem do conjunto
        conjuntoLinguagens.removerPalavra("Python");
        conjuntoLinguagens.exibirPalavrasUnicas();

        // Removendo uma linguagem inexistente
        conjuntoLinguagens.removerPalavra("Swift");

        // Verificando se uma linguagem está no conjunto
        System.out.println("A linguagem 'Java' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Java"));
        System.out.println("A linguagem 'Python' está no conjunto? " + conjuntoLinguagens.verificarPalavra("Python"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoLinguagens.exibirPalavrasUnicas();
    }


}
