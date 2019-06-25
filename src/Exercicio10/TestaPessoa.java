
package Exercicio10;

public class TestaPessoa {
    public static void main(String[] args) {
        try {
        Pessoa p = new Pessoa("Paulo", -2);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    }
    
}   

