package list.OperacoesBasicas.Exercicio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    List<Item> listItem;
    public CarrinhoDeCompra() {
        this.listItem = new ArrayList<>();
    }

    public void adicionarItens(String nome, double preco, int quantidade){
        Item itens = new Item(nome, preco, quantidade);
        listItem.add(itens);
    }

    public void removeItemByName(String nome){
        List<Item> saquinhoLixo = new ArrayList<>();
        for (Item itens: listItem) {
            if (itens.getNome().equalsIgnoreCase(nome)){
                saquinhoLixo.add(itens);
            }
        }
        listItem.removeAll(saquinhoLixo);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        double calculoValorItem;
        Item item = new Item();

        calculoValorItem = (item.getPreco() * item.getQuantidade());
        valorTotal += calculoValorItem;

        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(listItem.toString());
    }


    public static void main(String[] args) {
        CarrinhoDeCompra carrinhoDeCompras = new CarrinhoDeCompra();
        carrinhoDeCompras.adicionarItens("Lápis", 2.0, 3);
        carrinhoDeCompras.adicionarItens("Lápis", 2.0, 3);
        carrinhoDeCompras.adicionarItens("Caderno", 35.0, 1);
        carrinhoDeCompras.adicionarItens("Borracha", 2.0, 2);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removeItemByName("Lápis");
        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}
