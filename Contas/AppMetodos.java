package Contas;
public class AppMetodos{

    public static void main(String[] args){
        Conta cc = new Conta(102, "Alan Turing");
        cc.saldo = 1000;
        cc.limite = 2000;
        cc.depositar(525);
        cc.exibirInformacoes();
        cc.depositar(1000);
        cc.exibirInformacoes();
        cc.saque(2700);
        cc.exibirInformacoes();
    }
}