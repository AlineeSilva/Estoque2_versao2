package main;
import negocio.*;


import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);

        Estoque lista1 = new Estoque();
        int op;

        do{
            System.out.println("--DIGITE--");
            System.out.println("1- Cadastrar Produto");
            System.out.println("2- Visualizar Produtos");
            System.out.println("3- Ver quantidade de produtos");
            System.out.println("4- Apagar todos os produtos");
            System.out.println("0- Sair");
            op = ler.nextInt();
            switch(op){
                case 1:
                    lista1.criarProduto();
                    break;

                case 2:
                    lista1.listarProdutos();
                    break;

                case 3:
                    lista1.listarQuantidadeDeProdutosCadastrados();
                    break;

                case 4:
                    lista1.excluirTodosOsItensDoEstoque();
                    break;

                case 0:
                    System.out.println("Sistema encerrado.");
                    break;

                default:
                    System.out.println("Opção invalida!");
            }
        }while(op!=0);
    }

}
