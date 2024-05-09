//incluir, buscar, alterar e excluir produtos

package CRUD;
import java.util.ArrayList;
import java.util.scanner;

public class Processo{
  public ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
  public Scanner sc = new Scanner(System.in);
  
  public void incluirProduto(int id, String ucp, String sku, String nome, String descricao, String categoria, Double preco, Double peso, String fabricante){
    Produto produto = new Produto(id, ucp, sku, nome, descricao, categoria, preco, peso, fabricante);
    listaProdutos.add(produto);
  }
  public void buscarProduto(int id){
    for(Produto produto : listaProdutos){
      if(produto.getid() == id){
        System.out.println("Nome: " + produto.getnome() + "\n");
        System.out.println("ID: " + produto.getid() + "\n");
        System.out.println("SKU: " + produto.getsku() + "\n");
        System.out.println("Descrição: " + produto.getdescricao() + "\n");
        System.out.println("Preço: " + produto.getpreco() + "\n");
        System.out.println("Peso: " + produto.getpeso() + "\n");
      }else{
        System.out.println("Produto não encontrado.\n");
      }
    }
  }
  public void alterarProduto(int id){
    for(Produto produto : listaProdutos){
      if(produto.getid() == id){
        System.out.println("Insira o novo nome do produto:\n");
        produto.setnome(sc.next());
        System.out.println("Insira a nova descrição do produto:\n");
        produto.setdescricao(sc.next());
        System.out.println("Insira o novo preço do produto:\n");
        produto.setpreco(sc.next());
        System.out.println("Insira o novo peso do produto:\n");
        produto.setpeso(sc.next());
        System.out.println("Insira o novo fabricante do produto:\n");
        produto.setfabricante(sc.next());
      }
    }
  }
  
}
