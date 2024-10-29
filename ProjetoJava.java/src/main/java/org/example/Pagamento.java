package org.example;

import java.util.Date;

public class Pagamento {

    private String num_card;
    private  String name_card;
    private String cpf_card;
    private int cod_seg_card;
    private Date venc_card;

    public Pagamento(String num_card, String name_card, String cpf_card, int cod_seg_card, Date venc_card) {
        this.num_card = num_card;
        this.name_card = name_card;
        this.cpf_card = cpf_card;
        this.cod_seg_card = cod_seg_card;
        this.venc_card = venc_card;
    }

    public Pagamento(String checkpagamento, double valorTotal, String pago) {
    }

    public String getNum_card() {
        return num_card;
    }

    public void setNum_card(String num_card) {
        this.num_card = num_card;
    }

    public String getName_card() {
        return name_card;
    }

    public void setName_card(String name_card) {
        this.name_card = name_card;
    }

    public String getCpf_card() {
        return cpf_card;
    }

    public void setCpf_card(String cpf_card) {
        this.cpf_card = cpf_card;
    }

    public int getCod_seg_card() {
        return cod_seg_card;
    }

    public void setCod_seg_card(int cod_seg_card) {
        this.cod_seg_card = cod_seg_card;
    }

    public Date getVenc_card() {
        return venc_card;
    }

    public void setVenc_card(Date venc_card) {
        this.venc_card = venc_card;
    }
}
