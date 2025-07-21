import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    private static final String URL = "jdbc:mysql://localhost:3306/miaudotaDB";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public static Connection conectar() throws Exception {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            throw e;
        }
    }
}