package fiap.conta.poupacorrente;

import java.io.Serializable;

public class Pessoa implements Serializable {
 
  /**
   * 
   */
  private static final long serialVersionUID = 1L; // adicionei auto
  
  private String nome;
  //metodo get e set
  //get = obter a info
  //set = alterar a info
  
  public String getNome() {
    return nome;
  }
  
  public void setNome (String nome) {
    this.nome = nome;
  }
  
}
