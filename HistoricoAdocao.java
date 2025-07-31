import java.util.ArrayList;
import java.util.List;

public class HistoricoAdocao {
    private List<ProcessoAdocao> processosConcluidos;

    public HistoricoAdocao() {
        this.processosConcluidos = new ArrayList<>();
    }

    public void adicionar(ProcessoAdocao processo) {
        if(processo.getStatus() == StatusProcesso.CONCLUIDO) {
            processosConcluidos.add(processo);
            System.out.println("Adoção registrada no histórico com sucesso!");
        }else {
            System.out.println("Somente processos concluídos podem ser adicionados ao histórico.");
        }
    }

    public void listarHistorico() {
        if(processosConcluidos.isEmpty()) {
            System.out.println("Nenhum processo de adoção foi concluído ainda.");
            return;
        }

        System.out.println("\n===== HISTORICO DE ADOÇÕES =====");
        for (int i = 0; i < processosConcluidos.size(); i++) {
            ProcessoAdocao p = processosConcluidos.get(i);
            String nomeAnimal = "Desconhecido";

            if (p.getAnimal() instanceof Cachorro c) {
                nomeAnimal = c.getNome();
            } else if (p.getAnimal() instanceof Gato g) {
                nomeAnimal = g.getNome();
            }

            System.out.printf("%d. %s adotou %s de %s em %s\n",
                    i + 1,
                    p.getAdotante().getNome(),
                    nomeAnimal,
                    p.getTutor().getNome(),
                    p.getDataSolicitacao());
        }
    }

    public List<ProcessoAdocao> getProcessosConcluidos() {
        return processosConcluidos;
    }
    
}