package Aula4.Modelos;

public class Conta3 {
    //atrbuto da classe
    private static int totalContas; //por ter static este é um atributo da classe, ou seja, é compartilhado entre todos os objetos da classe Conta3
    public static final String AGENCIA = "254-6"; // caixa alta, por convenção, e "final" é dado para constantes, ou seja, valores que não podem ser alterados.
    private int numero; //por não ter static este é um atributo do objeto, ou seja, cada objeto da classe Conta3 terá seu próprio número
    private double saldo;
    private double limite;

    //contrutor
    public Conta3 (double saldo, double limite){
        this.numero = totalContas;
        totalContas++;
        this.saldo = saldo;
        this.limite = limite;
        //AGENCIA = "652-8"; não funciona pois é uma constante, ou seja, não pode ser alterada.
    }


    //Para fazer isso vá em: botão direito em uma linha de código vazia > source action > generate toString() > selecionar todos os atributos > ok
    @Override
    public String toString() {
        return "Conta3 [numero=" + numero + ", saldo=" + saldo + ", limite=" + limite + "]";
    }

    public static int getTotalContas(){
        return totalContas;
    }
}
