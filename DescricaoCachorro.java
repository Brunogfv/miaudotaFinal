import java.util.Date;

public class DescricaoCachorro {
    private int idDescCachorro;
    private int fkCachorro;
    private String descCachorro;
    private Date dataCadastro;
    private HistoricoSaudeCachorro historicoSaudeCachorro;

    public DescricaoCachorro(int idDescCachorro, int fkCachorro, String descCachorro, Date dataCadastro, HistoricoSaudeCachorro historicoSaudeCachorro) {
        this.idDescCachorro = idDescCachorro;
        this.fkCachorro = fkCachorro;
        this.descCachorro = descCachorro;
        this.dataCadastro = dataCadastro;
        this.historicoSaudeCachorro = historicoSaudeCachorro;
    }

    public DescricaoCachorro(String descCachorro, HistoricoSaudeCachorro historicoSaudeCachorro)  {
        this.descCachorro = descCachorro;
        this.historicoSaudeCachorro = historicoSaudeCachorro;
    }

    public int getIdDescCachorro() {
        return idDescCachorro;
    }

    public void setIdDescCachorro(int idDescCachorro) {
        this.idDescCachorro = idDescCachorro;
    }

    public int getFkCachorro() {
        return fkCachorro;
    }

    public void setFkCachorro(int fkCachorro) {
        this.fkCachorro = fkCachorro;
    }

    public String getDescCachorro() {
        return descCachorro;
    }

    public void setDescCachorro(String descCachorro) {
        this.descCachorro = descCachorro;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public HistoricoSaudeCachorro getHistoricoSaudeCachorro() {
        return historicoSaudeCachorro;
    }

    public void setHistoricoSaudeCachorro(HistoricoSaudeCachorro historicoSaudeCachorro) {
        this.historicoSaudeCachorro = historicoSaudeCachorro;
    }
}