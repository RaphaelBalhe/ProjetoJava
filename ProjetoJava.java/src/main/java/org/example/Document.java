package org.example;

public class Document {

    private String numero;
    private String tipo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Document(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }
}
