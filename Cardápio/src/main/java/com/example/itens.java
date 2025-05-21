package com.example;

public class itens {

  private int codigo;
  private String nome;
  private double valor;

  public itens(String nome, double valor, int codigo) {
    this.nome = nome;
    this.valor = valor;
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public void apresentar() {
    System.out.println("Nome do item: " + nome + ", Valor: R$ " + valor + "Codigo do item: " + codigo);
  }
}
