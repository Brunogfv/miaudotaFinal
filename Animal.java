public abstract class Animal {
    protected int idAnimal;
    protected int fkUsuario;

    public Animal(int idAnimal, int fkUsuario) {
        this.idAnimal = idAnimal;
        this.fkUsuario = fkUsuario;
    }

    public abstract String getNome();

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(int fkUsuario) {
        this.fkUsuario = fkUsuario;
    }
}
