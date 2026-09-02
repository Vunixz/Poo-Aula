package Aplicativo;

public class AppBanco2 {
    static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.nome = "ninicius";
        cli.sobrenome = "Maioral";
        cli.documento = "123456789";

        Conta cc = new Conta();
        cc.numero = 23;
        cc.saldo = 200;
        cc.limite = 1000;
        cc.titular = cli;
        cc.infocc();

        //System.out.println(cli);
        //System.out.println(cli.toString());
        System.out.println(cc);
    }
}