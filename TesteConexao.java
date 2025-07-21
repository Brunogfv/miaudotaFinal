public class TesteConexao {
    public static void main(String[] args) {
        try {
            ConexaoDB.conectar();
            System.out.println("Conexão com banco realizada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}