package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private String numeroPedido;
    private Matriz matriz;
    private Filial filial;
    private List<Produto> produtos;

    Date dataHoraAtual = new Date();
    String data = new SimpleDateFormat("dd/MM/yyyy").format(dataHoraAtual);
    String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
        
    // Instancia produtos
    public Pedido() {
        produtos = new ArrayList<Produto>();
    }

    public void addProduto (Produto produto) {
        produtos.add(produto);
    }

    // Numero Pedido
    public String getNumeroPedido() {
        return numeroPedido;
    }
    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    // matriz
    public Matriz getMatriz() {
        return matriz;
    }
    public void setMatriz(Matriz matriz) {
        this.matriz = matriz;
    }
    // filial
    public Filial getFilial() {
        return filial;
    }
    public void setFilial(Filial filial) {
        this.filial = filial;
    }
    // Produtos
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    
    @Override
    public String toString () {     
        return "\n\n****************************************************************\n" +
            "--- PEDIDO REALIZADO COM SUCESSO ---\n" +
            "\nNúmero do pedido: " + numeroPedido +
            "\nRealizado o pedido em: " + data + " às " + hora + "h" +
            "\nMatriz: " + matriz +
            "\nFilial: " + filial +
            "\n   - Produto(s) -" + produtos + 
            "\n****************************************************************\n";   
    }
}


















    // @Override
    // public String toString () {
    //     StringBuffer stringBuffer = new StringBuffer();
    //     stringBuffer.append("\n\n****************************************************************\n");
    //     stringBuffer.append("\nNúmero do pedido: " + numeroPedido);
    //     stringBuffer.append("\nMatriz: " + matriz);
    //     stringBuffer.append("\nFilial: " + filial);
    //     stringBuffer.append("\nProduto: " + produtos);
    //     return stringBuffer.toString();
    //     //  TODO quantidade e horario... nessa páginag ou em
    // }
