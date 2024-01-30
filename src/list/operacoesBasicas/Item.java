package list.operacoesBasicas;

public class Item {
    //atributos
    private String nome;
    private double preco;
    private int quantidade;

    public  Item (String nome, Double preco, Integer quantidade)
    {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return nome + preco + quantidade ;
    }
}
