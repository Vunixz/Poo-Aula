package Aula10;

public class Usuario {
    private String id;
    private String nome;
    private String email;
    
    public Usuario(String id, String nome, String email) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID não pode ser nulo ou vazio.");
        }
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email não pode ser nulo ou vazio.");
        }
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public String getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }

    public int limiteEmprestimos() {
        return 3; // Limite padrão de empréstimos
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + "]";
    }
}
