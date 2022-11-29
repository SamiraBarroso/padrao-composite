package org.example;

public abstract class Mercado {
    private String loja;

    public Mercado(String loja) {
        this.loja = loja;
    }

    public String getLoja() {
        return loja;
    }

    public void setLoja(String loja) {
        this.loja = loja;
    }

    public abstract String getMercado();
}
