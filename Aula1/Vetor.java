package Aula1;

public class Vetor {
    void print(boolean msg, String[] Vetor){
        if (msg) {
            System.out.println("vetor");
        }
        for (String Vetor1 : Vetor) {
            System.out.println(Vetor1);
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
