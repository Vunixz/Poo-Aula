package Aula10;

public class Aluno extends Usuario {
    private String curso;

    public Aluno(String id, String nome, String email, String curso) {
        super(id, nome, email);
        if (curso == null || curso.isEmpty()) {
            throw new IllegalArgumentException("Curso não pode ser nulo ou vazio.");
        }
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public int limiteEmprestimos() {
        return 4; // Limite de empréstimos para alunos
    }

    @Override
    public String toString() {
        return "Aluno [id=" + getId() + ", nome=" + getNome() + ", email=" + getEmail() + ", curso=" + curso + "]";
    }
}