package Aula1;

public class Cliente {
    String nome;
    String sobrenome;
    String documento;

//sobreescrita do metodo
    @Override
    public String toString(){
        return "nome " + nome + 
                " sobrenome " + sobrenome + 
                " documento " + documento;
    }
}
