package Aplicativo;

public class AppBanco {
    public static void main(String[] args){
        Cliente cli = new Cliente();
        cli.nome = "John";
        cli.sobrenome = "Doe";
        cli.documento = "123";

        Conta cc = new Conta();
        cc.numero = 23;
        cc.saldo = 200;
        cc.limite = 1000;
        cc.titular = cli;
        cc.infocc();

        Cliente outro = new Cliente();
        outro.nome = "Algum";
        outro.sobrenome = "Sousa";
        outro.documento = "456";

        Conta outraCC = new Conta();
        outraCC.numero = 67;
        outraCC.saldo = 500;
        outraCC.limite = 2000;
        outraCC.titular = outro;
        outraCC.infocc();
    }
}