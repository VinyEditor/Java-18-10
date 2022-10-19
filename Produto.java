package Ex58;

public class Produto {

    private int id;
    private String nome;
    private Double preco;
    private Double quantidade;
    private Categoria categoria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    Produto() {

    }

    Produto(int id, String nome, Double preco, Double quantidade, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
    }

    public void atualizarPreco(Double novoPreco) {
        this.preco = novoPreco;
    }

    public String exibirProduto() {
        return ("ID: " + this.id + " - Nome: " + this.nome + " - Preço: " + this.preco + " - Quantidade: " + this.quantidade + " - Categoria: " + this.categoria.getNome());
    }
    
}
