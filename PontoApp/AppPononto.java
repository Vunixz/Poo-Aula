package PontoApp;
public class AppPononto {

    public static void main(String[] args){
        Ponto p1 = new Ponto();
        p1.x = 10;

        Ponto p2 = p1;
        p2.x = 99;
        System.out.println(p1.x);
        System.out.println(p1);
        System.out.println(p2);

    }
}
