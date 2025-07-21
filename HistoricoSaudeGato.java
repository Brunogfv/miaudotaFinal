public class HistoricoSaudeGato {
    private int idHistSaudeGato;
    private int fkSaudeGato;
    private String doencas;

    public HistoricoSaudeGato(int idHistSaudeGato, int fkSaudeGato, String doencas) {
        this.idHistSaudeGato = idHistSaudeGato;
        this.fkSaudeGato = fkSaudeGato;
        this.doencas = doencas;
    }

    public HistoricoSaudeGato(String doencas) {
        this.doencas = doencas;
    }

    public int getIdHistSaudeGato() {
        return idHistSaudeGato;
    }

    public void setIdHistSaudeGato(int idHistSaudeGato) {
        this.idHistSaudeGato = idHistSaudeGato;
    }

    public int getFkSaudeGato() {
        return fkSaudeGato;
    }

    public void setFkSaudeGato(int fkSaudeGato) {
        this.fkSaudeGato = fkSaudeGato;
    }

    public String getDoencas() {
        return doencas;
    }

    public void setDoencas(String doencas) {
        this.doencas = doencas;
    }
}
