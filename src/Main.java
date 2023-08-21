import list.OperacoesBasicas.ListaDeTarefa;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ListaDeTarefa lista = new ListaDeTarefa();


        System.out.println("--------------------------------------------------------------");
        System.out.println("");

        lista.adicionarTarefa("seila1");
        lista.adicionarTarefa("seila2");
        System.out.println("Quantidade de tarefas adicionadas: " + lista.numeroTotalTarefas());
        lista.obterDescTarefa();

        System.out.println("");

        lista.removerTarefa("seila1");
        System.out.println("Quantidade de tarefas adicionadas: " + lista.numeroTotalTarefas());
        lista.obterDescTarefa();

    }
}