package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filial extends Mercado {

    private List<Mercado> mercados;

    public Filial(String loja) {
        super(loja);
        this.mercados = new ArrayList<Mercado>();
    }

    public void addMercado(Mercado loja) {
        this.mercados.add(loja);
    }

    public String getLoja() {
        String saida = "";
        saida = "Loja: " + this.getMercado() + "\n";
        for (Mercado loja : mercados) {
            saida += loja.getMercado();
        }
        return saida;
    }

    @Override
    public String getMercado() {
        return "Loja: Bahamas Mix\n" +
                "Loja: Bahamas Emporio";
    }

}
