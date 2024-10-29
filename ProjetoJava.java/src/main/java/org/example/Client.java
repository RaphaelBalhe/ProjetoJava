package org.example;

import java.util.Date;
import java.util.List;

public class Client {

    private int id_client;
    private String name_client;
    private Document document;
    private Endereco endereco;
    private Contact contact;
    private String email_client;
    private Date data_cad_cliet;
    private int status_cad;

    public Client(int id_client, String name_client, Document document, Endereco endereco, Contact contact, String email_client, Date data_cad_cliet, int status_cad) {
        this.id_client = id_client;
        this.name_client = name_client;
        this.document = document;
        this.endereco = endereco;
        this.contact = contact;
        this.email_client = email_client;
        this.data_cad_cliet = data_cad_cliet;
        this.status_cad = status_cad;
    }

    public int getId_client() {
        return id_client;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public String getName_client() {
        return name_client;
    }

    public void setName_client(String name_client) {
        this.name_client = name_client;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getEmail_client() {
        return email_client;
    }

    public void setEmail_client(String email_client) {
        this.email_client = email_client;
    }

    public Date getData_cad_cliet() {
        return data_cad_cliet;
    }

    public void setData_cad_cliet(Date data_cad_cliet) {
        this.data_cad_cliet = data_cad_cliet;
    }

    public int getStatus_cad() {
        return status_cad;
    }

    public void setStatus_cad(int status_cad) {
        this.status_cad = status_cad;
    }

    public void efetuar_pedido(List<ItemPedido> itens, String checkpagamento){
        double valorTotal = 0;
        for (ItemPedido pedido : itens){
            valorTotal+= itens.getFirst().getTotal();
        }

        Pagamento pagamento = efetuar_pagamento(valorTotal,checkpagamento);

        Pedido pedido = new Pedido(1, this, itens, new Date(), valorTotal, pagamento);

        System.out.println("Pedido efetuado com sucesso para o cliente: " + name_client );
        System.out.println("Valor total do pedido: R$" + valorTotal);
        System.out.println("Itens no pedido:");
        for (ItemPedido item : itens) {
            System.out.println("- " + item.getNomeProduto() + " x " + item.getQuantidade() + " = R$" + item.getTotal());
        }
    }

    private Pagamento efetuar_pagamento(double valorTotal, String checkpagamento){
        Pagamento pagamento = new Pagamento(checkpagamento, valorTotal, "PAGO");
        System.out.println("Pagamento processado com sucesso. Tipo: " + checkpagamento + ", Valor: R$" + valorTotal);
        return pagamento;
    }

    public void cadastra_client(Client client){

        if (client.getEmail_client() == null || client.getEmail_client().isEmpty()) {

            System.out.println("Cliente cadastrado com sucesso: " + client.getName_client());
        }
        else {
            System.out.println("Erro: Cliete ja registrado.");
        }

    }

    public void rem_cliet(Client client){
        if (client.getName_client() != null){
            System.out.println("");
        }
    }

    public void registerCliet(Client client){
        if (client.name_client != null){
            System.out.println("Cliente Registrado com sucesso!");
        }else {
            System.out.println("Erro: Não foi possivel registrar um novo client");
        }
    }
    public void exibirClient(Client client){
        if (client.name_client != null){
            System.out.println("Nome do Cliente: " + name_client);
            System.out.println("CPF: " + document.getNumero());
            System.out.println("Contato " + contact.getDdd_cel() + contact.getTel_cel());
            System.out.println("Endereço: " + endereco.getRua() + " Bairro:" + endereco.getBairro() + " Cidade:" + endereco.getCidade() + " CEP:" + endereco.getCep());
            if (status_cad == 1){
                System.out.println("Status: Cliente ativo");
            }else {
                System.out.println("Status: Client desativado");
            }
        }
    }

}

