package builder;

import model.Filial;
import model.Matriz;
import model.Pedido;
import model.Produto;

public class ConstrutorDePedido {
    // Obj a ser construido
    private Pedido pedido;

    // Instancia o obj Pedido() ainda vazio.
    public ConstrutorDePedido () {
        this.pedido = new Pedido();
    }

    public ConstrutorDePedido setNumeroPedido (String numero) {
        this.pedido.setNumeroPedido(numero); 
        return this;
    }

    public ConstrutorDePedido setMatriz(String matriz) {
        this.pedido.setMatriz (new Matriz(matriz));
        return this;
    }
    
    public ConstrutorDePedido setFilial(String filial) {
        this.pedido.setFilial (new Filial(filial));
        return this;
    }

    public ConstrutorDePedido setProduto (String categoria, String nome, int quantidade) {
        this.pedido.addProduto(new Produto(categoria, nome, quantidade));
        return this;
    }

    public Pedido builder() {
        return pedido;
    }
}
