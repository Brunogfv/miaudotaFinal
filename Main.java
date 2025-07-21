import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Usuario> tutores = new ArrayList<>();
    static List<Animal> animaisDisponiveis = new ArrayList<>();
    static List<ProcessoAdocao> processos = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1 -> cadastrarTutor();
                case 2 -> cadastrarAnimal();
                case 3 -> listarAnimais();
                case 4 -> iniciarAdocao();
                case 5 -> finalizarAdocao();
                case 0 -> System.out.println("Saindo do sistema...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);               
    }

    static void exibirMenu() {
        System.out.println("\n===== MIAUDOTA - SISTEMA DE ADOÇÃO =====");
        System.out.println("1. Cadastrar Tutor");
        System.out.println("2. Cadastrar Animal");
        System.out.println("3. Listar Animais Disponíveis");
        System.out.println("4. Iniciar Processo de Adoção");
        System.out.println("5. Finalizar Processo de Adoção");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    static void cadastrarTutor() {
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
        Usuario tutor = new Usuario(nome, cpf, endereco, new Date());
        tutores.add(tutor);

        System.out.println("Tutor cadastrado com sucesso!");
    }

    static void cadastrarAnimal() {
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

        System.out.println("Vacinado: ");
        boolean vacinado = sc.nextBoolean();

        System.out.println("Castrado: ");
        boolean castrado = sc.nextBoolean();

        System.out.println("Descrição: ");
        String descricao = sc.nextLine();

        System.out.println("Doenças: ");
        String doencas = sc.nextLine();

        
        Animal animal;
        if (tipo == 1) {            
            SaudeAnimalCachorro saudeAnimalcachorro = new SaudeAnimalCachorro(vacinado, castrado);
            HistoricoSaudeCachorro histCachorro = new HistoricoSaudeCachorro(doencas);
            DescricaoCachorro descCachorro = new DescricaoCachorro(descricao, histCachorro);
            animal = new Cachorro(nome, idade, raca, porte, sexo, cor, peso, saudeAnimalcachorro, descCachorro, TipoAnimal.CACHORRO);
        } else {
            SaudeAnimalGato saudeAnimalGato = new SaudeAnimalGato(vacinado, castrado);            
            HistoricoSaudeGato histGato = new HistoricoSaudeGato(doencas);
            DescricaoGato descGato = new DescricaoGato(descricao, histGato);
            animal = new Gato(nome, idade, raca, porte, sexo, cor, peso, saudeAnimalGato, descGato, TipoAnimal.GATO);
        }

        animaisDisponiveis.add(animal);
        System.out.println("Animal cadastrado com sucesso!");
    }

    static void listarAnimais() {
        if (animaisDisponiveis.isEmpty()) {
            System.out.println("Nenhum animal disponível para adoção.");
            return;
        }

        System.out.println("=== ANIMAIS DISPONÍVEIS ===");
        for (int i = 0; i < animaisDisponiveis.size(); i++) {
            Animal a = animaisDisponiveis.get(i);
            System.out.printf("%d. %s (%s)\n", i + 1, a.getNome(), a.getTipo());
        }
    }

    static void iniciarAdocao() {
        if (tutores.isEmpty() || animaisDisponiveis.isEmpty()) {
            System.out.println("Cadastre ao menos um tutor e um animal antes de iniciar a adoção.");
            return;
        }

        listarAnimais();
        System.out.print("Escolha o número do animal: ");
        int indexAnimal = Integer.parseInt(sc.nextLine()) - 1;

        System.out.println("=== TUTORES ===");
        for (int i = 0; i < tutores.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, tutores.get(i).getNome());
        }

        System.out.print("Escolha o número do tutor: ");
        int indexTutor = Integer.parseInt(sc.nextLine()) - 1;

        Animal animal = animaisDisponiveis.get(indexAnimal);
        Usuario tutor = tutores.get(indexTutor);

        ProcessoAdocao processo = new ProcessoAdocao(tutor, animal, new Date(), "Em andamento");
        processos.add(processo);
        animaisDisponiveis.remove(indexAnimal);

        System.out.println("Processo de adoção iniciado com sucesso!");
    }

    static void finalizarAdocao() {
        if (processos.isEmpty()) {
            System.out.println("Nenhum processo de adoção em andamento.");
            return;
        }

        System.out.println("=== PROCESSOS DE ADOÇÃO ===");
        for (int i = 0; i < processos.size(); i++) {
            ProcessoAdocao p = processos.get(i);
            System.out.printf("%d. %s adotando %s\n", i + 1, p.getTutor().getNome(), p.getAnimal().getNome());
        }

        System.out.print("Escolha o número do processo para finalizar: ");
        int index = Integer.parseInt(sc.nextLine()) - 1;

        processos.get(index).setStatus("Finalizado");
        System.out.println("Processo finalizado com sucesso!");
    }
}
