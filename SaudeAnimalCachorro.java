import java.util.Date;

public class SaudeAnimalCachorro {
    private int idSaudeAnimal;
    private int fkCachorro;
    private boolean vacinado;
    private boolean castrado;
    private Date dataCastrado;

    public SaudeAnimalCachorro(int idSaudeAnimal, int fkCachorro, boolean vacinado, boolean castrado, Date dataCastrado) {
        this.idSaudeAnimal = idSaudeAnimal;
        this.fkCachorro = fkCachorro;
        this.vacinado = vacinado;
        this.castrado = castrado;
        this.dataCastrado = dataCastrado;
    }

    public SaudeAnimalCachorro(boolean vacinado, boolean castrado) {
        this.vacinado = vacinado;
        this.castrado = castrado;
    }

    public int getIdSaudeAnimal() {
        return idSaudeAnimal;
    }

    public void setIdSaudeAnimal(int idSaudeAnimal) {
        this.idSaudeAnimal = idSaudeAnimal;
    }

    public int getFkCachorro() {
        return fkCachorro;
    }

    public void setFkCachorro(int fkCachorro) {
        this.fkCachorro = fkCachorro;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    public Date getDataCastrado() {
        return dataCastrado;
    }

    public void setDataCastrado(Date dataCastrado) {
        this.dataCastrado = dataCastrado;
    }
}