package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefa {
    private Set<Tarefa> tarefaSet;

    public ListaTarefa() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao)
    {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao)
    {
        Tarefa descricaoParaRemover = null;
        if (!tarefaSet.isEmpty())
        {
            for (Tarefa tarefa: tarefaSet)
            {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                    descricaoParaRemover = tarefa;
                    break;
                }
            }
        }
        tarefaSet.remove(descricaoParaRemover);
    }

    public void exibirTarefas()
    {
        System.out.println(tarefaSet);
    }

    public int contarTarefas()
    {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas()
    {
       Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if(!tarefaSet.isEmpty())
        {
            for(Tarefa tarefa : tarefaSet)
            {
                if(tarefa.isConcluida())
                {
                    tarefasConcluidas.add(tarefa);
                }
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes()
    {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!tarefaSet.isEmpty())
        {
            for(Tarefa tarefa : tarefaSet)
            {
                if(!tarefa.isConcluida())
                {
                    tarefasPendentes.add(tarefa);
                }
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao)
    {
        if(!tarefaSet.isEmpty())
        {
            for (Tarefa tarefa : tarefaSet)
            {
                if(tarefa.getDescricao().equalsIgnoreCase(descricao))
                {
                    tarefa.setConcluido(true);
                }
            }
        }
    }
    public void marcarTarefaPendente(String descricao)
    {
        if(!tarefaSet.isEmpty())
        {
            for (Tarefa tarefa : tarefaSet)
            {
                if(tarefa.getDescricao().equalsIgnoreCase(descricao))
                {
                    tarefa.setConcluido(false);
                }
            }
        }
    }

    public void limparListaTarefas()
    {
        Set<Tarefa> tarefasRemover = new HashSet<>(tarefaSet);
        tarefaSet.removeAll(tarefasRemover);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefa listaTarefas = new ListaTarefa();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }

}
