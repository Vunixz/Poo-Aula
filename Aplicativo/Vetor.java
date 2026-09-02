package Aplicativo;

public class Vetor {
    void print(boolean msg, String[] Vetor){
        if (msg) {
            System.out.println("vetor");
        }
        for (int i = 0; i < Vetor.length; i++){
            System.out.println(Vetor[i]);
        }
    }

    void print(boolean msg){
        if (msg) {
            System.out.println("vetor");
        }
    }

    public static void main(String[] args){
        Vetor t = new Vetor();
        t.print(true, new String[]{"Java", "Python", "C++", "C#", "JavaScript"});
        t.print(false);
    }
}
