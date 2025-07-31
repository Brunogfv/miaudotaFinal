import java.util.Date;

public class Usuario extends Pessoa {
    private int idUsuario;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private Endereco endereco;
    private Date dataCadastro;
    private TipoUsuario tipoUsuario;

    public Usuario(int idUsuario, String nome, String cpf, String email, String telefone, Endereco endereco, Date dataCadastro, int idPessoa, int fkUsuario, boolean statusConta) {
        super(idPessoa, fkUsuario, statusConta); // Chama o construtor da superclasse Pessoa    
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
    }

    public Usuario(String nome, String cpf, Endereco endereco, Date dataCadastro, TipoUsuario tipoUsuario) {
        super(0, 0, true); // Chama o construtor da superclasse Pessoa com valores padrão
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.dataCadastro = dataCadastro;
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public void cadastrar() {
        if (nome == null || nome.isEmpty()) {
            System.out.println("ERRO: O nome do usuário não pode ser vazio.");
            return;
        }

        if (cpf == null || cpf.isEmpty()) {
            System.out.println("ERRO: O CPF do usuário não pode ser vazio.");
            return;
        }

        System.out.println("Cadastrando usuário no sistema...  ");
        System.out.println("ID: " + idUsuario);
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("Data de Cadastro: " + dataCadastro);
        System.out.println("Status da Conta: " + (isStatusConta() ? "Ativa" : "Inativa"));
        System.out.println("Usuário cadastrado com sucesso!");
    }

    @Override
    public void atualizarInformacoes() {
        if (nome == null || nome.isEmpty()) {
            System.out.println("ERRO: O nome do usuário não pode ser vazio.");
            return;
        }

        System.out.println("Atualizando informações do usuário...");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("Status da Conta: " + (isStatusConta() ? "Ativa" : "Inativa"));
        System.out.println("Informações atualizadas com sucesso!");
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public String toString() {
        return "Nome = " + nome + ", CPF = " + cpf + ", Email = " + email + ", Telefone = " + telefone + ", Endereço = " + endereco + ", Data de Cadastro = " + dataCadastro;
    }
}