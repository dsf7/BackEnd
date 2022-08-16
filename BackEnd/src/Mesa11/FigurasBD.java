package Mesa11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FigurasBD {

        public static void main(String[] args) throws Exception{
            Class.forName("org.h2.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:h2:~/figuras", "sa", "");
            Statement statement = connection.createStatement();

            String sqlCreateTable = "DROP TABLE IF EXISTS Figuras; CREATE TABLE Figuras(Id INT PRIMARY KEY, Tipo VARCHAR(100), Cor VARCHAR(100))";
            statement.execute(sqlCreateTable);

            String sqlInsert1 = "INSERT INTO Figuras(Id, Tipo, Cor) VALUES(1, 'Círculo', 'Verde')";
            String sqlInsert2 = "INSERT INTO Figuras(Id, Tipo, Cor) VALUES(2, 'Quadrado', 'Verde')";
            String sqlInsert3 = "INSERT INTO Figuras(Id, Tipo, Cor) VALUES(3, 'Quadrado', 'Vermelho')";
            String sqlInsert4 = "INSERT INTO Figuras(Id, Tipo, Cor) VALUES(4, 'Círculo', 'Vermelho')";
            String sqlInsert5 = "INSERT INTO Figuras(Id, Tipo, Cor) VALUES(5, 'Quadrado', 'Azul')";
            String sqlInsert6 = "INSERT INTO Figuras(Id, Tipo, Cor) VALUES(6, 'Triângulo', 'Azul')";
            String sqlInsert7 = "INSERT INTO Figuras(Id, Tipo, Cor) VALUES(7, 'Triângulo', 'Vermelho')";
            String sqlInsert8 = "INSERT INTO Figuras(Id, Tipo, Cor) VALUES(8, 'Círculo', 'Azul')";
            String sqlInsert9 = "INSERT INTO Figuras(Id, Tipo, Cor) VALUES(9, 'Círculo', 'Vermelho')";
            String sqlInsert10 = "INSERT INTO Figuras(Id, Tipo, Cor) VALUES(10, 'Triângulo', 'Verde')";

            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            statement.execute(sqlInsert4);
            statement.execute(sqlInsert5);
            statement.execute(sqlInsert6);
            statement.execute(sqlInsert7);
            statement.execute(sqlInsert8);
            statement.execute(sqlInsert9);
            statement.execute(sqlInsert10);

            String sqlRead = "SELECT * FROM Figuras WHERE Cor = 'Vermelho' AND Tipo = 'Círculo';";
            ResultSet resultSet = statement.executeQuery(sqlRead);

            System.out.println("Busca de Círculos Vermelho:");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3) + "\n");
            }

            String sqlRead2 = "SELECT * FROM Figuras WHERE Cor = 'Vermelho';";
            ResultSet resultSet2 = statement.executeQuery(sqlRead2);

            System.out.println("Busca de Formas na cor Vermelha:");
            while (resultSet2.next()) {
                System.out.println(resultSet2.getInt(1) + " - " + resultSet2.getString(2) + " - " + resultSet2.getString(3) + "\n");
            }
        }
    }

