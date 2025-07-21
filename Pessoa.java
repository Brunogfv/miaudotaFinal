public abstract class Pessoa {
    protected int idPessoa;
    protected int fkUsuario;
    protected boolean statusConta;

    public Pessoa (int idPessoa, int fkUsuario, boolean statusConta) {
        this.idPessoa = idPessoa;
        this.fkUsuario = fkUsuario;
        this.statusConta = statusConta;
    }

    public abstract void cadastrar();
    public abstract void atualizarInformacoes();

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public int getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(int fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
}