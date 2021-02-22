package fiap.conta.poupacorrente;

public class ContaCorrente extends Conta {

  private String tipo;
  private double chequeEspecial;
  
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  public double getChequeEspecial() {
    return chequeEspecial;
  }
  public void setChequeEspecial(double chequeEspecial) {
    this.chequeEspecial = chequeEspecial;
  }
  
  public double getSaldoDisponivel() {
    return super.getSaldo() + chequeEspecial; //caracteristicas da superclasse na subclasse
  }
  
  
  public void retirar (double valor) { //sobrescrita superclasse e sub classe com o mesmo nome e o mesmo param de entrada
    valor += 10;
    super.retirar(valor);
  }

}
