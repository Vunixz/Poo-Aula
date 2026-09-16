package Aula5;

public class Exemplar {
    private final String codigo;
    private final String titulo;
    private StatusExemplar status;

    public Exemplar(String codigo, String titulo) {
        if (codigo == null || codigo.isEmpty()) {
            throw new IllegalArgumentException("O código não pode ser nulo ou vazio.");
        }
        if (titulo == null || titulo.isEmpty()) {
            throw new IllegalArgumentException("O título não pode ser nulo ou vazio.");
        }

        this.codigo = codigo;
        this.titulo = titulo;
        this.status = StatusExemplar.DISPONIVEL; // Inicializa o status como DISPONIVEL
    }
    
    //Para gerar getters automaticamente clique com o botão direito em uma linha de código vazia > source action > generate getters
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public StatusExemplar getStatus() {
        return status;
    }

    public boolean isDisponivel(){
        return status == StatusExemplar.DISPONIVEL;
    }

    public void emprestar(){
        if (status == StatusExemplar.EMPRESTADO){
            throw new IllegalStateException("Exemplar já emprestado");
        }

        if (status == StatusExemplar.BLOQUEADO){
            throw new IllegalStateException("Exemplar Bloqueado");
        }

        status = StatusExemplar.EMPRESTADO;
    }

    public void devolver(){
        if (status == StatusExemplar.DISPONIVEL){
            throw new IllegalStateException("Exemplar já devolvido");
        }

        status = StatusExemplar.DISPONIVEL;
    }

    public void bloquear() {
        if (status == StatusExemplar.EMPRESTADO){
            throw new IllegalStateException("Não bloqueie exemplar emprestado");
        }
        
        status = StatusExemplar.BLOQUEADO;
    }

    public void desloqueado() {
        if (status != StatusExemplar.BLOQUEADO){
            throw new IllegalStateException("O exemplar já está desbloqueado");
        }

        status = StatusExemplar.DISPONIVEL;
    }

}
