package org.example;

import java.util.Date;
import java.util.List;

public class Pedido {
    private int idPedido;
    private Client client;
    private List<ItemPedido> itens;
    private Date dataPedido;
    private double valorTotal;
    private Pagamento pagamento; // Novo atributo

    public Pedido(int idPedido, Client client, List<ItemPedido> itens, Date dataPedido, double valorTotal, Pagamento pagamento) {
        this.idPedido = idPedido;
        this.client = client;
        this.itens = itens;
        this.dataPedido = dataPedido;
        this.valorTotal = valorTotal;
        this.pagamento = pagamento; // Atribuir pagamento
    }

    // Getters e Setters
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}
