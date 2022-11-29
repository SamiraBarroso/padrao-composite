package org.example;

public class Produto {

    private Mercado loja;

    public void setLoja(Mercado loja) {
        this.loja = loja;
    }

    public String getLoja() {
        if (this.loja == null) {
            throw new NullPointerException("Loja Inexistente");
        }
        return this.loja.getMercado();
    }
}
