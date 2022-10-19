package Ex58;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        int opcao;
        int id;
        Produto prod;
        int indexProduto;
        int id_produto;
        
        do {
            System.out.printf("===> Sistema de Cadastro de Produtos <===\n\n");
            System.out.printf("Escolha uma opção:\n");
            System.out.printf("1 - Incluir \n" +
                              "2 - Atualizar \n" +
                              "3 - Excluir \n" +
                              "4 - Exibir \n" +
                              "5 - Sair\n\n");

            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();

            if (opcao == 1) {
                Produto produto = new Produto();

                if(listaProdutos.size() > 0) {
                    id_produto = listaProdutos.get(listaProdutos.size()-1).getId() + 1;
                }
                else {
                    id_produto = 1;
                }
                produto.setId(id_produto);

                System.out.print("Digite o nome do produto: ");
                produto.setNome(ler.next());

                System.out.print("Digite o preço do produto: ");
                produto.setPreco(ler.nextDouble());

                System.out.print("Digite a quantidade do produto: ");
                produto.setQuantidade(ler.nextInt());

                System.out.print("Digite a categoria do produto: ");
                produto.setCategoria(ler.next());

                listaProdutos.add(produto);
            }
            else if (opcao == 2) {
                System.out.print("Digite o ID do produto que deseja atualizar: ");
                id = ler.nextInt();

                indexProduto = listaProdutos.indexOf(new Produto(id));

                if (indexProduto >= 0) {
                    prod = listaProdutos.get(indexProduto);

                    System.out.print("Digite o nome do produto: ");
                    prod.setNome(ler.next());

                    System.out.print("Digite o preço do produto: ");
                    prod.setPreco(ler.nextDouble());

                    System.out.print("Digite a quantidade do produto: ");
                    prod.setQuantidade(ler.nextInt());

                    System.out.print("Digite a categoria do produto: ");
                    prod.setCategoria(ler.next());

                    listaProdutos.set(indexProduto, prod);
                }
                else {
                    System.out.println("Produto não encontrado!");
                }
            }
            else if (opcao == 3) {
                System.out.print("Digite o ID do produto que deseja excluir: ");
                id = ler.nextInt();

                indexProduto = listaProdutos.indexOf(new Produto(id));

                if (indexProduto >= 0) {
                    listaProdutos.remove(indexProduto);
                }
                else {
                    System.out.println("Produto não encontrado!");
                }  
        }

    }

}