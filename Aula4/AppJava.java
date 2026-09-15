package Aula4;
import Aula4.Modelos.Conta3;
//import java.util.*; evitar fazer isso nop java.util pois acaba importando classes que não são necessárias, o que pode gerar confusão. Por exemplo, se você importar java.util.* e java.sql.* e as duas tiverem uma classe chamada Date, o compilador não saberá qual usar. Por isso é melhor importar apenas as classes que você vai usar.
public class AppJava {
    public static void main(String[] args) {
        Conta3 cc1 = new Conta3(1000, 200);
        Conta3 cc2 = new Conta3(6700, 500);
        Conta3 cc3 = new Conta3(6967, 1000);
        System.out.println(cc1);
        System.out.println(cc2);
        System.out.println(cc3);

        System.out.printf("Total de contas:\n");
        System.out.println(Conta3.getTotalContas());
    }
}
