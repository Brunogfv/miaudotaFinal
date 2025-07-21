import java.util.Date;

public class DescricaoGato {
    private int idDescGato;
    private int fkGato;
    private int idade;
    private String descGato;
    private Date dataCadastro;
    private HistoricoSaudeGato historicoSaudeGato;

    public DescricaoGato(int idDescGato, int fkGato, int idade, String descGato, Date dataCadastro, HistoricoSaudeGato historicoSaudeGato) {
        this.idDescGato = idDescGato;
        this.fkGato = fkGato;
        this.idade = idade;
        this.descGato = descGato;
        this.dataCadastro = dataCadastro;
        this.historicoSaudeGato = historicoSaudeGato;
    }

    public DescricaoGato(String descGato, HistoricoSaudeGato historicoSaudeGato)  {
        this.descGato = descGato;
        this.historicoSaudeGato = historicoSaudeGato;
    }


    public int getIdDescGato() {
        return idDescGato;
    }

    public void setIdDescGato(int idDescGato) {
        this.idDescGato = idDescGato;
    }

    public int getFkGato() {
        return fkGato;
    }

    public void setFkGato(int fkGato) {
        this.fkGato = fkGato;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDescGato() {
        return descGato;
    }

    public void setDescGato(String descGato) {
        this.descGato = descGato;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public HistoricoSaudeGato getHistoricoSaudeGato() {
        return historicoSaudeGato;
    }

    public void setHistoricoSaudeGato(HistoricoSaudeGato historicoSaudeGato) {
        this.historicoSaudeGato = historicoSaudeGato;
    }
}