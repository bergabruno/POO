package fiap.conta.poupacorrente;

public class Teste {

  public static void main(String[] args) {

    Conta contaPoupanca = new Conta();
    
    contaPoupanca.setAgencia(323);
    contaPoupanca.getAgencia();
    
    
    Conta conta1 = new Conta();
    conta1.depositar(1000);
    conta1.retirar(100);
    
    ContaCorrente conta2 = new ContaCorrente();
    conta2.depositar(1000);
    conta2.retirar(100);
    
    Conta conta3 = new ContaCorrente(); // ele ira usar o metodo da CC por conta do @Override
    conta3.depositar(1000);
    conta3.retirar(100);
    
    
    System.out.println("Conta 1: " + conta1.getSaldo());
    System.out.println("Conta 2: " + conta2.getSaldo());
    System.out.println("Conta 3: " + conta3.getSaldo());
    /*
    ContaCorrente cc = new ContaCorrente(); //variaveis da subclasse
    cc.setAgencia(1111);
    cc.setNumero(2222);
    cc.setTipo("PF");
    cc.setChequeEspecial(1000);
    
    Conta cc2 = new ContaCorrente (); //variaveis da superclasse e criando objetos da subclasse
    Conta cc3 = new Conta(); // objeto da propria superclasse ( o new Conta) e a criação da var da superclasse
    
    ContaCorrente subcc2 = (ContaCorrente) cc2; //dando casting na cc2, abaixando o nivel dela.
    
    if(cc3 instanceof ContaCorrente) { //verificar se é possivel, para nao dar erro de cast
      ContaCorrente subcc3 = (ContaCorrente) cc3; // como o objeto esta na super classe, não é possivel realizar o casting dela.
    }
    */
    
    
    // Conta cc = new Conta(); // variavel cc referencia ao objeto conta
    // cont da tv // TV

    // utilizamos o java Beans, encapsulando para nao conseguir alterar os atributos
    // da class diretamente
    /*
     * antes: cc.saldo = 21; 
     * cc.agencia = 246; 
     * cc.numero = 213; 
     *  metodo get e set 
     *  get = obter a info 
     *  set = alterar a info
     */
    /*
    cc.depositar(1000); // objetos, não é mais possivel fazer cc.saldo = ... igual a antes
    cc.setAgencia(321);
    cc.setNumero(321);
    
    
    cc.depositar(1000);

    System.out.println(cc.getSaldo());

    Conta poupanca = new Conta(111, 222, 1000); // atribuindo aos objetos já, em cima foi de uma a uma

    poupanca.retirar(50.0);
    System.out.println(poupanca.getSaldo());
    System.out.println(cc.getAgencia());
    System.out.println(poupanca.getNumero());
    */

  }
}
