package model;

public class Produto {
    private String categoria;
    private String nome;
    private int quantidade;

    public Produto () {
    }

    public Produto(String categoria, String nome, int quantidade) {
        this.categoria = categoria;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    // Categoria
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    // Nome
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    // Quantidade
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
     public String toString () {
        return  "\nCategoria: " + categoria +" Nome: " + nome + " Quantidade: " + quantidade;
    }
}
















    // @Override
    // public String toString () {
    //     StringBuilder stringBuilder = new StringBuilder();
    //     stringBuilder.append("\nCategoria: " + categoria);
    //     stringBuilder.append("\nNome: " + nome);
    //     stringBuilder.append("\nQuantidade: " + quantidade);
    //     return stringBuilder.toString();
    //     //  TODO quantidade e horario... nesta página ou em
    // }


