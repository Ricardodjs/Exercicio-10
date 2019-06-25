
package Exercicio10;


public class Pessoa {
private String nome;
private int idade;

public Pessoa(String nome, int idade) throws IdadeInvalidaException{
    this.setIdade(idade);
    this.setNome(nome);
}
public String getNome(){
   return this.nome;
}
public void setNome(String nome){
    this.nome = nome;
}
public int getidade(){
    return this.idade;
}
public void setIdade(int idade) throws IdadeInvalidaException{
    if(idade<0){
        throw new IdadeInvalidaException("Não pode ser inferior a 0");
    }
    this.idade = idade;
}
}
