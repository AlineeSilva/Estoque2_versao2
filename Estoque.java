package negocio;


import java.util.ArrayList;
import java.util.Scanner;


public class Estoque {
    private ArrayList<Produto> lista;
    Scanner ler = new Scanner(System.in);

    public Estoque() {
        lista = new ArrayList<Produto>();
        lista1();


    }

    private void lista1() {

    }

    public ArrayList<Produto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Produto> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Lista Do Estoque = " + lista;
    }

    public void adicionarProduto(Produto p1) {
        this.lista.add(p1);
    }

    public void apagarTudo() {
        this.lista.clear();
    }


    public void criarProduto() {

        Produto p1 = new Produto();
        System.out.println("Digite o nome do produto:");
        p1.setNome(ler.nextLine());

        System.out.println("Digite o codigo do produto:");
        p1.setCodigo(ler.nextInt());
        do {
            System.out.println("Digite a quantidade:");
            p1.setQuantidade(ler.nextInt());
            if (p1.getQuantidade() <= 0) {
                System.out.println("Erro! Quantidade inválida.");
            }
        } while (p1.getQuantidade() <= 0);
        this.lista.add(p1);
        System.out.println("Cadastrado com sucesso!");


    }


    public void listarProdutos() {
        if (lista.isEmpty()) {
            System.out.println("Não Existe Produtos na lista.");
        } else {
            System.out.println(lista);
        }


    }

    public void listarQuantidadeDeProdutosCadastrados(){
        System.out.println("Total de itens cadastrados: "
                +lista.size());
    }

    public void excluirTodosOsItensDoEstoque(){
        if(lista.isEmpty()){
            System.out.println("Não há produtos para excluir.");
        }else{
            int confirma;
            System.out.println("Tem certeza que deseja EXCLUIR TUDO?\n1-SIM\n2-Não");
            confirma = ler.nextInt();
            if(confirma==1){
                lista.clear();
                System.out.println("Produtos excluidos com sucesso!");
            }else{
                System.out.println("Opção cancelada!!");
            }
        }

    }
}