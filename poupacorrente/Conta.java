package fiap.conta.poupacorrente;

import java.io.Serializable;

public class Conta implements Serializable{

  //gerando os atributos para os objetos
  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private int agencia;
  private int numero;
  private double saldo;
  
  //construindo os objetos
  
  public Conta () {
    
  }
  
  public Conta (int agencia, int numero, double saldo) {
    this.agencia = agencia; // agencia do parametro será referenciada ao objeto da classe conta (agencia)
    this.numero = numero;
    this.saldo = saldo;
  }

  //bot. direito > source > generate constructor or alt + shift + s
  
  
  public void depositar (double valor) {
    this.saldo += valor;
    //saldo = saldo + valor; 
  }
  
  public int getAgencia() {
    return agencia;
  }

  public void setAgencia(int agencia) {
    this.agencia = agencia;
  } // setar o numero da agencia

 
  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void retirar (double valor) {
    this.saldo -= valor;
  }
  
  public double getSaldo() {
    return this.saldo; // this.saldo o saldo dessa classe
  }
}
