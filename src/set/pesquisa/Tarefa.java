package set.pesquisa;

public class Tarefa {
    private String descricao;
    private Boolean concluido;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluido = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean isConcluida() {
        return concluido;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluido=" + concluido +
                '}';
    }
}
