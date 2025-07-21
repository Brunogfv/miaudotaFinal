public class Gato extends Animal {
    private String nome;
    private int idade;
    private String raca;
    private String porte;
    private String sexo;
    private String cor;
    private double peso;
    private SaudeAnimalGato saudeAnimal;
    private DescricaoGato descricaoGato;
    private TipoAnimal tipo;

    public Gato(int idAnimal, int fkUsuario, String nome, int idade, String raca, String porte, String sexo, String cor, double peso, SaudeAnimalGato saudeAnimal, DescricaoGato descricaoGato) {
        super(idAnimal, fkUsuario);
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.porte = porte;
        this.sexo = sexo;
        this.cor = cor;
        this.peso = peso;
        this.saudeAnimal = saudeAnimal;
        this.descricaoGato = descricaoGato;
    }

    public Gato(String nome, int idade, String raca, String porte, String sexo, String cor, double peso, SaudeAnimalGato saudeAnimal, DescricaoGato descricaoGato, TipoAnimal tipo) {
        super(0, 0); // Chama o construtor da superclasse Animal com valores padrão
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.porte = porte;
        this.sexo = sexo;
        this.cor = cor;
        this.peso = peso;
        this.saudeAnimal = saudeAnimal;
        this.descricaoGato = descricaoGato;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public SaudeAnimalGato getSaudeAnimal() {
        return saudeAnimal;
    }

    public void setSaudeAnimal(SaudeAnimalGato saudeAnimal) {
        this.saudeAnimal = saudeAnimal;
    }

    public DescricaoGato getDescricaoGato() {
        return descricaoGato;
    }

    public void setDescricaoGato(DescricaoGato descricaoGato) {
        this.descricaoGato = descricaoGato;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }
}