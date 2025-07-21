import java.util.Date;

public class SaudeAnimalGato {
    private int idSaudeAnimal;
    private int fkGato;
    private boolean vacinado;
    private boolean castrado;
    private Date dataCastrado;

    public SaudeAnimalGato(int idSaudeAnimal, int fkGato, boolean vacinado, boolean castrado, Date dataCastrado) {
        this.idSaudeAnimal = idSaudeAnimal;
        this.fkGato = fkGato;
        this.vacinado = vacinado;
        this.castrado = castrado;
        this.dataCastrado = dataCastrado;
    }

    public SaudeAnimalGato(boolean vacinado, boolean castrado) {
        this.vacinado = vacinado;
        this.castrado = castrado;
    }

    public int getIdSaudeAnimal() {
        return idSaudeAnimal;
    }

    public void setIdSaudeAnimal(int idSaudeAnimal) {
        this.idSaudeAnimal = idSaudeAnimal;
    }

    public int getFkGato() {
        return fkGato;
    }

    public void setFkGato(int fkGato) {
        this.fkGato = fkGato;
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