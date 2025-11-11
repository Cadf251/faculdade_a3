package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    public Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/data_base_a3?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String password = ""; // ou sua senha do WAMP

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("✅ Conexão bem-sucedida!");
        } catch (SQLException e) {
            System.out.println("❌ Erro na conexão:");
            e.printStackTrace();
        }
    }
}
