import java.util.Date;

public class Avaliacao {
    private int idPosAvaliacao;
    private int fkProcesso;
    private String statusPet;
    private String comentario;
    private Date dataAvaliacao;

    public Avaliacao(int idPosAvaliacao, int fkProcesso, String statusPet, String comentario, Date dataAvaliacao) {
        this.idPosAvaliacao = idPosAvaliacao;
        this.fkProcesso = fkProcesso;
        this.statusPet = statusPet;
        this.comentario = comentario;
        this.dataAvaliacao = dataAvaliacao;
    }

    public int getIdPosAvaliacao() {
        return idPosAvaliacao;
    }

    public void setIdPosAvaliacao(int idPosAvaliacao) {
        this.idPosAvaliacao = idPosAvaliacao;
    }

    public int getFkProcesso() {
        return fkProcesso;
    }

    public void setFkProcesso(int fkProcesso) {
        this.fkProcesso = fkProcesso;
    }

    public String getStatusPet() {
        return statusPet;
    }

    public void setStatusPet(String statusPet) {
        this.statusPet = statusPet;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(Date dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }
}