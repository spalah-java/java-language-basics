package ua.spalah.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcMain {

    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver");
        String url = "jdbc:h2:tcp://localhost/~/java17/db/pets/db";
        Connection connection = DriverManager.getConnection(url, "sa", "");

        update(connection);
        select(connection);
        selectPrepared(connection, "Labr");
        selectPrepared(connection, "Labr' union select * from logins where '' = '");
        updatePrepared(connection, "login from java", "pass from java");
        getId(connection);

        Dog dog = findDogById(connection, 3);
        System.out.println(dog);

    }

    private static Dog findDogById(Connection connection, long idToFind) throws SQLException{
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM dogs WHERE id = ?");
        preparedStatement.setLong(1, idToFind);

        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            long id = resultSet.getInt("id");
            String nick = resultSet.getString("nick");
            String breed = resultSet.getString("breed");
            Gender gender = Gender.valueOf(resultSet.getString("gender"));
            double weight = resultSet.getDouble("weight");

            return new Dog(id, nick, breed, gender, weight);
        } else {
            return null;
        }
    }

    private static void update(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        String updateString = "UPDATE PUBLIC.dogs SET weight = weight - 5 WHERE GENDER = 'MALE'";

        int i = statement.executeUpdate(updateString);
        System.out.println("Rows updated " + i);
    }

    private static void select(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT nick AS name, gender, id FROM dogs WHERE breed <> 'Labr' ORDER BY id");


        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String nick = resultSet.getString("nick");
            System.out.println("Dog with id " + id + " and nick: " + nick);

//            if (id == 0 && resultSet.wasNull()) {
//                throw new IllegalStateException("ID cannot be null");
//            }
        }
    }

    private static void selectPrepared(Connection connection, String breedToFind) throws SQLException {
//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("SELECT nick, breed FROM dogs WHERE breed = '" + breedToFind + "'");

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT nick, breed FROM dogs WHERE breed = ?");
        preparedStatement.setString(1, breedToFind);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String nick = resultSet.getString(1);
            String breed = resultSet.getString(2);
            System.out.println("Dog with nick " + nick + " and breed: " + breed);
        }
    }

    private static void updatePrepared(Connection connection, String login, String pass) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("insert into public.logins (login, PASSWORD ) VALUES (?, ?)");
        preparedStatement.setString(1, login);
        preparedStatement.setString(2, pass);

        int i = preparedStatement.executeUpdate();
    }

    private static void getId(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate("INSERT INTO PUBLIC.DOGS (NICK, BREED, GENDER, WEIGHT) VALUES ('dog from java', 'Corgi', 'FEMALE', 700.23)");

        System.out.println("Rows affected " + i);
        ResultSet keys = statement.getGeneratedKeys();
        while (keys.next()) {
            System.out.println("id = " + keys.getLong(1));
        }

    }
}
