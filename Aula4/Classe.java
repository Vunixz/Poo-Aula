package Aula4;

public class Classe {
    public static int compartilhado;
    //atributos do objeto
    public int numero;
    public int numeroIncremento;

    public Classe(){
        numero = 3;
        //pega uma copia do valor de compartilhado, incrementa e atribui a numeroIncremento
        numeroIncremento = ++compartilhado;
        
    }

    public void info(){
        System.out.printf("----------------------\n");
        System.out.println("numero: " + numero);
        System.out.println("numeroIncremento: " + numeroIncremento);
        System.out.printf("----------------------\n");
    }

    public static void main(String[] args) {
        Classe obj1 = new Classe();
        Classe obj2 = new Classe();
        Classe obj3 = new Classe();
        obj1.info();
        obj2.info();
        obj3.info();
    }
}
