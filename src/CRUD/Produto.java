//Id, código de barras (15), sku(20), nome(20), descrição(50), categoria(200), preço (double), peso (double) e fabricante (50).
package CRUD;

public class Produto {
  private int id;
  private String ucp; // código do produto universal
  private String sku; // código do produto na loja
  private String nome;
  private String descricao;
  private String categoria;
  private Double preco;
  private Double peso;
  private String fabricante;
  Processo processo = new Processo();

  public Produto (int id, String ucp, String sku, String nome, String descricao, String categoria, Double preco, Double peso, String fabricante){
    this.id = id;
    this.ucp = ucp;
    this.sku = sku;
    this.nome = nome;
    this.descricao = descricao;
    this.categoria = categoria;
    this.preco = preco;
    this.peso = peso;
    this.fabricante = fabricante;
  }
    public int getid(){
      return id;
    }
    public void setid(int id){
      this.id = id;
    }
    public String getucp(){
      return ucp;
    }
    public void setucp(String ucp){
      this.ucp = ucp;
    }
    public String getsku(){
      return sku;
    }
    public void setsku(String sku){
      this.sku = sku;
    }
    public String getnome(){
      return nome;
    }
    public void setnome(String nome){
      this.nome = nome;
    }
    public String getdescricao(){
      return descricao;
    }
    public void setdescricao(String descricao){
      this.descricao = descricao;
    }
    public String getcategoria(){
      return categoria;
    }
    public void setcategoria(String categoria){
      this.categoria = categoria;
    }
    public Double getpreco(){
      return preco;
    }
    public void setpreco(Double preco){
      this.preco = preco;
    }
    public Double getpeso(){
      return peso;
    }
    public void setpeso(Double peso){
      this.peso = peso;
    }
    public String getfabricante(){
      return fabricante;
    }
    public void setfabricante(String fabricante){
      this.fabricante = fabricante;
    }
    processo.incluirProduto(id, ucp, sku, nome, descricao, categoria, preco, peso, fabricante);
}