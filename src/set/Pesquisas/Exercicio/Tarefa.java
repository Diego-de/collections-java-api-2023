package set.Pesquisas.Exercicio;

public class Tarefa {
    private String descrição;
    private boolean exist;

    public Tarefa(String descrição) {
        this.descrição = descrição;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public boolean isExist() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descrição='" + descrição + '\'' +
                ", exist=" + exist +
                '}';
    }
}
