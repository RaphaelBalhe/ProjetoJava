package org.example;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // Criar cliente
        Document doc = new Document("503.804.468-98", "CPF");
        Endereco endereco = new Endereco("Rua Domingos de abreu, 235", "Bairro: Jardim Vila Galvão", "Cidade: Guarulhos", "Estado: São Paulo", "12345-678");
        Contact contato = new Contact(11, "1234-5678", 11, "8765-4321", 11, "99999-8333");
        Client cliente = new Client(1, "Giovane Santos", doc, endereco, contato, "giovanesilvadossantos8@gmail.com", new Date(), 1);

        // Exibir Cliente
        cliente.exibirClient(cliente);

        // Criar itens do pedido
        ItemPedido item1 = new ItemPedido("Pizza de Calabresa", 2, 50.0);
        ItemPedido item2 = new ItemPedido("Pizza de Frango", 1, 100.0);

        // Efetuar pedido
        cliente.efetuar_pedido(Arrays.asList(item1, item2), "Cartão de crédito");

        //
        cliente.rem_cliet(cliente);



    }
}