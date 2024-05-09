/*
Desenvolver uma aplicação com as seguintes funcionalidades:
1- Incluir produto
2- Alterar produto
3- Excluir produto
4- Listar todos produtos
5- Listar um produto
*/
package CRUD;
import java.util.Scanner;
import java.util.Arraylist;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Produto produto = new Produto();
    Processo processo = new Processo();
    int opcao;
    do{
      System.out.println("1- Incluir produto");
      System.out.println("2- Alterar produto");
      System.out.println("3- Excluir produto");
      System.out.println("4- Listar todos produtos");
      System.out.println("5- Listar um produto");

      opcao = sc.nextInt();
      switch(opcao){
        case 1:
          System.out.println("Insira o ID: \n");
          produto.setid(sc.nextInt());
          System.out.println("Insira o código de barras:\n");
          produto.setucp(sc.next());
          System.out.println("Insira o SKU:\n");
          produto.setsku(sc.next());
          System.out.println("Insira o nome do produto:\n");
          produto.setnome(sc.next());
          System.out.println("Insira a descricao do produto:\n");
          produto.setdescricao(sc.next());
          System.out.println("Insira a categoria do produto:\n");
          produto.setcategoria(sc.next());
          System.out.println("Insira o preço do produto:\n");
          produto.setpreco(sc.next());
          System.out.println("Insira o peso do produto:");
          produto.setpeso(sc.next());
          System.out.println("Insira o fabricante do produto:\n");
          produto.setfabricante(sc.next());
          System.out.println("Produto incluído com sucesso!\n");
        case 2:
          System.out.println("Insira o ID do produto que deseja alterar:\n");
          int id = sc.nextInt();
          processo.alterarProduto(id);
          System.out.println("Produto alterado com sucesso!\n");
        case 3:
          id = sc.nextInt();
          System.out.println("Insira o ID do produto que deseja excluir:\n");
      }
    }while((opcao > 0) && (opcao < 6));
  }
}
//Id, código de barras, sku, nome, descrição, categoria, preço, peso e fabricante.