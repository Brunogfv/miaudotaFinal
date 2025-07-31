public class Cachorro extends Animal implements Adotavel {
    private String nome;
    private int idade;
    private String raca;
    private String porte;
    private String sexo;
    private String cor;
    private double peso;
    private SaudeAnimalCachorro saudeAnimal;
    private DescricaoCachorro descricaoCachorro;
    private TipoAnimal tipo;

    public Cachorro(String nome, int idade, String raca, String porte, String sexo, String cor, double peso, SaudeAnimalCachorro saudeAnimal, DescricaoCachorro descricaoCachorro, TipoAnimal tipo, StatusAdocao statusAdocao) {
        super(0, 0, statusAdocao); 
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.porte = porte;
        this.sexo = sexo;
        this.cor = cor;
        this.peso = peso;
        this.saudeAnimal = saudeAnimal;
        this.descricaoCachorro = descricaoCachorro;
        this.tipo = tipo;
        this.statusAdocao = statusAdocao;
    }

    @Override
    public String getDescricao() {
        return this.getDescricaoCachorro().getDescCachorro();
    }

    @Override
    public boolean isDisponivelParaAdocao() {
        return this.getStatusAdocao() == StatusAdocao.DISPONIVEL;
    }
    @Override
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

    public SaudeAnimalCachorro getSaudeAnimal() {
        return saudeAnimal;
    }

    public void setSaudeAnimal(SaudeAnimalCachorro saudeAnimal) {
        this.saudeAnimal = saudeAnimal;
    }

    public DescricaoCachorro getDescricaoCachorro() {
        return descricaoCachorro;
    }

    public void setDescricaoCachorro(DescricaoCachorro descricaoCachorro) {
        this.descricaoCachorro = descricaoCachorro;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public StatusAdocao getStatusAdocao() {
        return statusAdocao;
    }

    public void setStatusAdocao(StatusAdocao statusAdocao) {
        this.statusAdocao = statusAdocao;
    }
}