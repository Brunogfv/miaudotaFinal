import java.util.Date;

public class ProcessoAdocao {
    private int idProcAdocao;
    private int fkUsuario;
    private int fkAnimal;
    private Animal animal;
    private Usuario tutor;
    private Usuario adotante;
    private StatusProcesso status;
    private Date dataSolicitacao;
    private Date dataAprovacao;
    private Date dataConclusao;
    private Avaliacao avaliacao;

    public ProcessoAdocao(int idProcAdocao, int fkUsuario, int fkAnimal, Animal animal, Usuario tutor, Usuario adotante, StatusProcesso status, Date dataSolicitacao, Date dataAprovacao, Date dataConclusao, Avaliacao avaliacao) {
        this.idProcAdocao = idProcAdocao;
        this.fkUsuario = fkUsuario;
        this.fkAnimal = fkAnimal;
        this.dataSolicitacao = dataSolicitacao;
        this.dataAprovacao = dataAprovacao;
        this.dataConclusao = dataConclusao;
        this.avaliacao = avaliacao;
    }

    public ProcessoAdocao(Usuario tutor, Usuario adotante, Animal animal, Date dataSolicitacao, StatusProcesso status) {
        this.tutor = tutor;
        this.adotante = adotante;
        this.animal = animal;
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
    
    public Usuario getTutor() {
        return tutor;
    }

    public void setTutor(Usuario tutor) {
        this.tutor = tutor;
    }

    public Usuario getAdotante() {
        return adotante;
    }

    public void setAdotante(Usuario adotante) {
        this.adotante = adotante;
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

    public void exibirDetalhes() {
        System.out.println("=== Processo de Adoção ===");
        System.out.println("Tutor (que doou): " + tutor.getNome());
        System.out.println("Adotante (quem adotou): " + adotante.getNome());
        System.out.println("Animal: " + ((animal instanceof Cachorro) ? ((Cachorro) animal).getNome() : ((Gato) animal).getNome()) + " (" + ((animal instanceof Cachorro) ? ((Cachorro) animal).getTipo() : ((Gato) animal).getTipo()) + ")");
        System.out.println("Data da Solicitação: " + dataSolicitacao);
        System.out.println("Status: " + status);
    }
}