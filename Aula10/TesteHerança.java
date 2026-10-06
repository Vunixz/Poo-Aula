package Aula10;

public class TesteHerança{
    public static void main(String[] args) {
        System.out.println("=====criando ususario com=====");

        Usuario usuario = new Usuario(
            "U001",
            "Carlos Silva",
            "carlos.silva@email.com"
        );

        System.out.println(usuario);
        System.out.println("ID: " + usuario.getId());
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Limite de empréstimos: " + usuario.limiteEmprestimos());

        System.out.println();

        System.out.println("=====criando aluno com=====");
        Aluno aluno = new Aluno(
            "A001",
            "Maria Oliveira",
            "maria.oliveira@email.com",
            "Engenharia de Software"
        );

        System.out.println(aluno);
        System.out.println("ID: " + aluno.getId());
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Email: " + aluno.getEmail());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Limite de empréstimos: " + aluno.limiteEmprestimos());
        System.out.println();
    }
}
