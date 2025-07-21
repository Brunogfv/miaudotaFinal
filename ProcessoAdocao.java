import java.util.Date;

public class ProcessoAdocao {
    private int idProcAdocao;
    private int fkUsuario;
    private int fkAnimal;
    private Animal animal;
    private Usuario usuario;
    private StatusProcesso status;
    private Date dataSolicitacao;
    private Date dataAprovacao;
    private Date dataConclusao;
    private Avaliacao avaliacao;

    public ProcessoAdocao(int idProcAdocao, int fkUsuario, int fkAnimal, Animal animal, Usuario usuario, StatusProcesso status, Date dataSolicitacao, Date dataAprovacao, Date dataConclusao, Avaliacao avaliacao) {
        this.idProcAdocao = idProcAdocao;
        this.fkUsuario = fkUsuario;
        this.fkAnimal = fkAnimal;
        this.dataSolicitacao = dataSolicitacao;
        this.dataAprovacao = dataAprovacao;
        this.dataConclusao = dataConclusao;
        this.avaliacao = avaliacao;
    }

    public ProcessoAdocao(Usuario usuario, Animal animal, Date dataSolicitacao, StatusProcesso status) {
        this.animal = animal;
        this.usuario = usuario;
        this.status = status;
        this.dataSolicitacao = dataSolicitacao;
    }

    public int getIdProcAdocao() {
        return idProcAdocao;
    }

    public void setIdProcAdocao(int idProcAdocao) {
        this.idProcAdocao = idProcAdocao;
    }

    public int getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(int fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    public int getFkAnimal() {
        return fkAnimal;
    }

    public void setFkAnimal(int fkAnimal) {
        this.fkAnimal = fkAnimal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public StatusProcesso getStatus() {
        return status;
    }

    public void setStatus(StatusProcesso status) {
        this.status = status;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public Date getDataAprovacao() {
        return dataAprovacao;
    }

    public void setDataAprovacao(Date dataAprovacao) {
        this.dataAprovacao = dataAprovacao;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }
}