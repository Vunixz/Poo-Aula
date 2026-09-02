package Aplicativo;

public class Cliente {
    String nome;
    String sobrenome;
    String documento;

    void info(){
        System.out.printf("Nome: %s\n", this.nome);
        System.out.printf("Sobrenome: %s\n", this.sobrenome);
        System.out.printf("Documento: %s\n", this.documento);
    }
//sobreescrita do metodo
    public String toString(){
        return "nome " + nome + 
                " sobrenome " + sobrenome + 
                " documento " + documento;
    }
}
