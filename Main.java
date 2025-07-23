import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Usuario> usuarios = new ArrayList<>();
    static List<Animal> animaisDisponiveis = new ArrayList<>();
    static List<ProcessoAdocao> processos = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1 -> cadastrarUsuario();
                case 2 -> cadastrarAnimal();
                case 3 -> listarAnimais();
                case 4 -> iniciarAdocao();
                case 5 -> finalizarAdocao();
                case 6 -> listarProcessos();
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);               
    }

    private static void exibirMenu() {
        System.out.println("\n===== MIAUDOTA - SISTEMA DE ADOÇÃO =====");
        System.out.println("1. Cadastrar Tutor");
        System.out.println("2. Cadastrar Animal");
        System.out.println("3. Listar Animais Disponíveis");
        System.out.println("4. Iniciar Processo de Adoção");
        System.out.println("5. Finalizar Processo de Adoção");
        System.out.println("6. Listar Processos de Adoção");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarUsuario() {
        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("CPF: ");
        String cpf = sc.nextLine();

        System.out.println("ENDEREÇO:");
        System.out.print("Rua: ");
        String rua = sc.nextLine();

        System.out.print("Número: ");
        String numero = sc.nextLine();

        System.out.print("Bairro: ");
        String bairro = sc.nextLine();

        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        System.out.print("CEP: ");
        String cep = sc.nextLine();

        System.out.print("Estado: ");
        String estado = sc.nextLine();

        Endereco endereco = new Endereco(rua, numero, bairro, cidade, cep, estado);
        Usuario usuario = new Usuario(nome, cpf, endereco, new Date());
        usuarios.add(usuario);

        System.out.println("Tutor cadastrado com sucesso!");
    }

    private static void cadastrarAnimal() {
        System.out.println("1. Cachorro");
        System.out.println("2. Gato");
        System.out.print("Escolha o tipo: ");
        int tipo = Integer.parseInt(sc.nextLine());

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = Integer.parseInt(sc.nextLine());

        System.out.println("Raça: ");
        String raca = sc.nextLine();

        System.out.print("Porte: ");
        String porte = sc.nextLine();

        System.out.print("Sexo: ");
        String sexo = sc.nextLine();
        
        System.out.print("Cor: ");
        String cor = sc.nextLine();
        
        System.out.print("Peso: ");
        double peso = Double.parseDouble(sc.nextLine());

        System.out.println("Vacinado (true / false): ");
        boolean vacinado = sc.nextBoolean();

        System.out.println("Castrado (true / false): ");
        boolean castrado = sc.nextBoolean();

        System.out.println("Descrição: ");
        String descricao = sc.nextLine();

        System.out.println("Doenças: ");
        String doencas = sc.nextLine();

        
        Animal animal;
        if (tipo == 1) {            
            SaudeAnimalCachorro saude = new SaudeAnimalCachorro(vacinado, castrado);
            HistoricoSaudeCachorro hist = new HistoricoSaudeCachorro(doencas);
            DescricaoCachorro desc = new DescricaoCachorro(descricao, hist);
            animal = new Cachorro(nome, idade, raca, porte, sexo, cor, peso, saude, desc, TipoAnimal.CACHORRO);
        } else {
            SaudeAnimalGato saude = new SaudeAnimalGato(vacinado, castrado);            
            HistoricoSaudeGato hist = new HistoricoSaudeGato(doencas);
            DescricaoGato desc = new DescricaoGato(descricao, hist);
            animal = new Gato(nome, idade, raca, porte, sexo, cor, peso, saude, desc, TipoAnimal.GATO);
        }

        animaisDisponiveis.add(animal);
        System.out.println("Animal cadastrado com sucesso!");
    }

    private static void listarAnimais() {
        if (animaisDisponiveis.isEmpty()) {
            System.out.println("Nenhum animal disponível para adoção.");
            return;
        }

        System.out.println("=== ANIMAIS DISPONÍVEIS ===");

        for (int i = 0; i < animaisDisponiveis.size(); i++) {
            Animal animal = animaisDisponiveis.get(i);
            System.out.printf("%d. %s (%s)\n", i + 1, (animal instanceof Cachorro cachorro ? cachorro.getNome() : ((Gato ) animal).getNome()), animal instanceof Cachorro ? "Cachorro" : "Gato");
        }

        
    }

    private static void iniciarAdocao() {
        if (usuarios.size() < 2 || animaisDisponiveis.isEmpty() ) {
            System.out.println("É necessário pelo menos 2 usuários e um animal para iniciar a adoção.");
            return;
        }

        System.out.println("Selecione o Tutor (quem doa)");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, usuarios.get(i).getNome());
        }
        int indexTutor = Integer.parseInt(sc.nextLine()) - 1;

        System.out.println("Selecione o Adotante (quem adota)");
        for (int i = 0; i < usuarios.size(); i++) {
            if (i != indexTutor) {
                System.out.printf("%d. %s\n", i + 1, usuarios.get(i).getNome());
            }
        }
        int indexAdotante = Integer.parseInt(sc.nextLine()) - 1;

        listarAnimais();
        System.out.print("Escolha o número do animal: ");
        int indexAnimal = Integer.parseInt(sc.nextLine()) - 1;


        
        Animal animal = animaisDisponiveis.get(indexAnimal);
        Usuario tutor = usuarios.get(indexTutor);
        Usuario adotante = usuarios.get(indexAdotante);

        ProcessoAdocao processo = new ProcessoAdocao(tutor, adotante, animal, new Date(), StatusProcesso.PENDENTE);
        processos.add(processo);
        animaisDisponiveis.remove(indexAnimal);

        System.out.println("Processo de adoção iniciado com sucesso!");
    }

    private static void finalizarAdocao() {
        if (processos.isEmpty()) {
            System.out.println("Nenhum processo de adoção em andamento.");
            return;
        }

        for (int i = 0; i < processos.size(); i++) {
            System.out.printf("%d. %s adotando %s de %s\n", i + 1, processos.get(i).getAdotante().getNome(), processos.get(i).getAnimal().getNome(), processos.get(i).getTutor().getNome());
        }

        // System.out.println("=== PROCESSOS DE ADOÇÃO ===");
        // for (int i = 0; i < processos.size(); i++) {
        //     Animal animal = processos.get(i).getAnimal();
        //     String nomeAnimal = animal instanceof Cachorro cachorro ? cachorro.getNome() : ((Gato) animal).getNome();
        //     System.out.printf("%d. %s adotando %s\n", i + 1, processos.get(i).getUsuario().getNome(), nomeAnimal);            
        // }

        
        System.out.print("Escolha o número do processo para finalizar: ");
        int index = Integer.parseInt(sc.nextLine()) - 1;
        processos.get(index).setStatus(StatusProcesso.CONCLUIDO);
        processos.get(index).setDataConclusao(new Date());

        System.out.println("Processo finalizado com sucesso!");
    }

    private static void listarProcessos() {
        if (processos.isEmpty()) {
            System.out.println("Nenhum processo registrado.");
            return;
        }

        for (ProcessoAdocao p : processos) {
            p.exibirDetalhes();
            System.out.println("------------------------");
        }
    }

}
