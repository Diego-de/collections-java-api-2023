package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefa {

    private List<Tarefa> tarefaList;

    public ListaDeTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> SaquinhoLixo = new ArrayList<>();
        for (Tarefa Lista: tarefaList) {
            if (Lista.getDescricao().equalsIgnoreCase(descricao)){
                SaquinhoLixo.add(Lista);
            }
        }
        tarefaList.removeAll(SaquinhoLixo);
    }

    public int numeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescTarefa(){
        System.out.println(tarefaList.toString());
    }


}
