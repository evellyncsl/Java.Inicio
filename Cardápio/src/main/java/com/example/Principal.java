package com.example;

public class Principal {
    public static void main(String[] args) {

        itens itens1 = new itens("Cachorro quente de Frango", 9.99, 1);
        itens itens2 = new itens("Cachorro quente de Carne", 11.99, 2);
        itens itens3 = new itens("Pastel de Calabresa", 10.00, 3);
        itens itens4 = new itens("X-tudo", 15.99, 4);

        carrinho c = new carrinho();

        c.adicionaritens(itens1);
        c.adicionaritens(itens2);
        c.adicionaritens(itens3);
        c.adicionaritens(itens4);

        c.calcularValor();
    }
}
