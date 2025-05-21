package com.example;

import java.util.ArrayList;

public class carrinho {

  private ArrayList<itens> itens;

  public carrinho() {
    itens = new ArrayList<>();

  }

  public void adicionaritens(itens itens) {
    this.itens.add(itens);
    System.out.println(itens.getNome() + " Foi adicionado ao carrinho!");
  }

  public void removerItens(int codigo) {
    for (int i = itens.size() - 1; i >= 0; i--) {
      if (itens.get(i).getCodigo() == codigo) {
        System.out.println(itens.get(i).getNome() + " Foi removido do carrinho!");
        itens.remove(i);
      }
    }
  }

  public void calcularValor() {
    double valor = 0;
    for (int i = 0; i < itens.size(); i++) {
      valor += itens.get(i).getValor();
    }
    System.out.println("Total de R$: " + valor);
  }
}