package matc89.exercicio3;

import android.support.annotation.NonNull;

import java.util.List;

public class Tarefa implements Comparable<Tarefa> {
    private String descricao;
    private Integer prioridade;

    public Tarefa(String descricao, int prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getPrioridade() {
        return prioridade;
    }

    // Método para ordenar a lista pela prioridade
    public List sortList(List tarefas, Tarefa tarefa) {


        return tarefas;
    }

    // Metódo para verificar se a descrição já existe
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Tarefa)) {
            return false;
        }
        final Tarefa other = (Tarefa) obj;
        return this.getDescricao().equals(other.getDescricao());
    }

    @Override
    public String toString() {
        return descricao + "  " + "Prioridade: " + prioridade;
    }

    @Override
    public int compareTo(Tarefa tarefa) {
        if (tarefa == null ) {
            return 0;
        }
        return prioridade.compareTo(tarefa.getPrioridade());
    }
}
