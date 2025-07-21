public class HistoricoSaudeCachorro {
    private int idHistSaudeCachorro;
    private int fkSaudeCachorro;
    private String doencas;

    public HistoricoSaudeCachorro(int idHistSaudeCachorro, int fkSaudeCachorro, String doencas) {
        this.idHistSaudeCachorro = idHistSaudeCachorro;
        this.fkSaudeCachorro = fkSaudeCachorro;
        this.doencas = doencas;
    }

    public HistoricoSaudeCachorro(String doencas) {
        this.doencas = doencas;
    }

    public int getIdHistSaudeCachorro() {
        return idHistSaudeCachorro;
    }

    public void setIdHistSaudeCachorro(int idHistSaudeCachorro) {
        this.idHistSaudeCachorro = idHistSaudeCachorro;
    }

    public int getFkSaudeCachorro() {
        return fkSaudeCachorro;
    }

    public void setFkSaudeCachorro(int fkSaudeCachorro) {
        this.fkSaudeCachorro = fkSaudeCachorro;
    }

    public String getDoencas() {
        return doencas;
    }

    public void setDoencas(String doencas) {
        this.doencas = doencas;
    }
}