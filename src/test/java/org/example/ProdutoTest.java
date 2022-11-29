package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    @Test
    void deveRetornarLoja() {
        Filial filial1 = new Filial("Bahamas Mix");

        Filial filial2 = new Filial("Bahamas Emporio");

        Filial loja = new Filial("Bahamas Mix");
        loja.addMercado(filial1);
        loja.addMercado(filial2);

        assertEquals("Loja: Bahamas Mix\n" + "Loja: Bahamas Emporio", loja.getMercado());

    }

}