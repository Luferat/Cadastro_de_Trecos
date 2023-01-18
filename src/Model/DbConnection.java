package Model;

import Control.PopUps;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbConnection {

    // Atributo objeto de conexão
    private Connection conn = null;

    // String de conexão com o banco de dados SQLite
    //                                    tipo   caminho    database
    //                                     ↓      ↓          ↓ 
    private final String SQLITEURL = "jdbc:sqlite:src/resources/trecos.db";

    // String de conexão com o banco de dados MySQL
    //                                   tipo    servidor  porta database   usuário       senha
    //                                    ↓       ↓         ↓     ↓           ↓             ↓ 
    private final String MYSQLURL = "jdbc:mysql://localhost:3306/trecos?user=root&password=";

    // String de conexão com o banco de dados PostGreeSQL
    //                                      tipo         servidor  porta database   usuário      senha
    //                                       ↓            ↓         ↓     ↓           ↓             ↓       
    private final String POSTGREEURL = "jdbc:postgresql://localhost:5432/trecos?user=root&password=root";

    // Método de conexão com o banco de dados
    public Connection dbConnect() {

        try {
            // Inicia a conexão usando a URL
            conn = DriverManager.getConnection(SQLITEURL);
        } catch (SQLException error) {
            PopUps.showError(error);
        }

        // Retorna a conexão estabelecida
        return conn;
    }

    // Método que encerra todos os recursos abertos
    public void dbClose(Connection conn, PreparedStatement pstm, ResultSet res) {

        if (res != null) try {
            res.close();
        } catch (SQLException ignore) {
        }

        if (pstm != null) try {
            pstm.close();
        } catch (SQLException ignore) {
        }

        if (conn != null) try {
            conn.close();
        } catch (SQLException ignore) {
        }
    }

    public void dbClose(ResultSet res) {

        if (res != null) try {
            res.close();
        } catch (SQLException ignore) {
        }
    }

    // Isso é só um teste que serve de modelo para nosso CRUD
    public static void main(String[] args) {

        try {

            // Cria objeto de conexão
            DbConnection dbConnection = new DbConnection();

            // Faz conexão
            Connection testConn = dbConnection.dbConnect();

            // SQL de teste
            String sql = "SELECT * FROM trecos";

            // Envia comandos SQL para preparação
            PreparedStatement pstm = testConn.prepareStatement(sql);

            // Executa query no banco de dados
            ResultSet res = pstm.executeQuery();

            // Exibir os dados
            while (res.next()) {
                System.out.println("ID: " + res.getInt("t_id"));
                System.out.println("  Data: " + res.getString("t_date"));
                System.out.println("  Nome: " + res.getString("t_name"));
                System.out.println("  Status: " + res.getString("t_status"));
                System.out.println("--------------------");
            }

            // Encerra todos os recursos
            dbConnection.dbClose(testConn, pstm, res);

        } catch (SQLException error) {
            // Exibe mensagem de erro
            PopUps.showError(error);
        }

    }
}
