public abstract class Animal {
    protected int idAnimal;
    protected int fkUsuario;
    protected StatusAdocao statusAdocao;

    public Animal(int idAnimal, int fkUsuario, StatusAdocao statusAdocao) {
        this.idAnimal = idAnimal;
        this.fkUsuario = fkUsuario;
        this.statusAdocao = statusAdocao;
    }

    public abstract String getNome();

    public StatusAdocao getStatusAdocao() {
        return statusAdocao;
    }

    public void setStatusAdocao(StatusAdocao statusAdocao) {
        this.statusAdocao = statusAdocao;
    }

    public boolean isDisponivelParaAdocao() {
        return this.statusAdocao == StatusAdocao.DISPONIVEL;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(int fkUsuario) {
        this.fkUsuario = fkUsuario;
    }
}
