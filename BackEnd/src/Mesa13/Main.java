package Mesa13;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Main {

    private static final String sqlCreate = "DROP TABLE IF EXISTS Dentista; CREATE TABLE Dentista" +
            "(id INT PRIMARY KEY, nome VARCHAR(100) NOT NULL, sobrenome VARCHAR(100) NOT NULL, matricula VARCHAR(50));";
    private static final String sqlInsert = "INSERT INTO Dentista(id, nome, sobrenome, matricula) " +
            "VALUES (?, ?, ?, ?);";

    private static final String sqlUpdate = "UPDATE Dentista SET matricula = ? WHERE id = ?;";

    public static void main(String[] args) throws Exception {

        Dentista dentista = new Dentista(1, "Daniel", "Fontoura", "1234567");

        Connection connection = null;

        try {
            connection = ConnectionDentista.getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreate);

            PreparedStatement preparedStatementInsert = connection.prepareStatement(sqlInsert);

            preparedStatementInsert.setInt(1, dentista.getId());
            preparedStatementInsert.setString(2, dentista.getNome());
            preparedStatementInsert.setString(3, dentista.getSobrenome());
            preparedStatementInsert.setString(4, dentista.getMatricula());
            preparedStatementInsert.execute();

            connection.setAutoCommit(false);

            PreparedStatement preparedStatementUpdate = connection.prepareStatement(sqlUpdate);
            preparedStatementUpdate.setString(1, dentista.setMatricula("7654321"));
            preparedStatementUpdate.setInt(2, dentista.getId());
            preparedStatementUpdate.execute();

            connection.commit();
            connection.setAutoCommit(true);

        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
        } finally {
            connection.close();
        }
    }
}
