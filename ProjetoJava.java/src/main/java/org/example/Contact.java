package org.example;

public class Contact {
    private int ddd_res;
    private String tel_res;
    private int ddd_com;
    private String tel_com;
    private int ddd_cel;
    private String tel_cel;


    public String getTel_cel() {
        return tel_cel;
    }

    public void setTel_cel(String tel_cel) {
        this.tel_cel = tel_cel;
    }

    public int getDdd_cel() {
        return ddd_cel;
    }

    public void setDdd_cel(int ddd_cel) {
        this.ddd_cel = ddd_cel;
    }

    public String getTel_com() {
        return tel_com;
    }

    public void setTel_com(String tel_com) {
        this.tel_com = tel_com;
    }

    public int getDdd_com() {
        return ddd_com;
    }

    public void setDdd_com(int ddd_com) {
        this.ddd_com = ddd_com;
    }

    public String getTel_res() {
        return tel_res;
    }

    public void setTel_res(String tel_res) {
        this.tel_res = tel_res;
    }

    public int getDdd_res() {
        return ddd_res;
    }

    public void setDdd_res(int ddd_res) {
        this.ddd_res = ddd_res;
    }

    public Contact(int ddd_res, String tel_res, int ddd_com, String tel_com, int ddd_cel, String tel_cel) {
        this.ddd_res = ddd_res;
        this.tel_res = tel_res;
        this.ddd_com = ddd_com;
        this.tel_com = tel_com;
        this.ddd_cel = ddd_cel;
        this.tel_cel = tel_cel;
    }
}
