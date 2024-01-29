package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa()
    {
        //Esse contrutor e para sinalizar que eu sempre vou criar a tarefaList com um array vazio dentro dela
        this.tarefaList = new ArrayList<>();
    }
    //metodo para adicionar uma tarefa a lista de tarefas.
    public void adicionarTarefa(String descricao)
    {
        tarefaList.add(new Tarefa(descricao));
    }
    //metodo de remover uma tarefa da lista de tarefas
    public void removerTarefa(String descricao)
    {
        //foi criado uma lista vazia com o nome tarefas para remover
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        //foi feito um for para chegar cada tarefa do nosso tarefaList
        for (Tarefa t : tarefaList)
        {
            //se a descricao da tarefa for igual a descricao que vem por parametro ele remove a tarefa
            if (t.getDescricao().equalsIgnoreCase(descricao))
            {
                //ele vai adicionar a tarefaq que tem que ser removida no array vazio de tarefas para remover
                tarefasParaRemover.add(t);
            }
        }
        // aqui ele remove todas as tarefas que foram adicionadas no array de tarefas para remover
        tarefaList.removeAll(tarefasParaRemover);
    }
    //metodo que vai retornar o tamanho do tarefaList
    public int obterNumeroTotalDeTarefas()
    {
        return  tarefaList.size();
    }

    public void obterDescricoesTarefas()
    {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O NUMERO TOTAL DE TAREFAS NA LISTA É : " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O NUMERO TOTAL DE TAREFAS NA LISTA É : " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("O NUMERO TOTAL DE TAREFAS NA LISTA É : " + listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.obterDescricoesTarefas();
    }

}
