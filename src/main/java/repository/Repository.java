package repository;

import java.sql.*;

public abstract class Repository {
    private String JdbURL= "jdbc:mysql://localhost:3306/relationship";
    private String username="root";
    private String password="root";
    private Connection connection=null;
    protected Statement statement=null;

    public  Repository(){
        try{
            connection = DriverManager.getConnection(JdbURL,username,password);
            statement=connection.createStatement();
        } catch (SQLException e) {
            System.out.println("eroare conectare baza de date");
        }
    }

    public  void executeStatement(String execute){
        try{
            statement.execute(execute);

        }catch (SQLException exec){
            System.out.println("Nu am reusit"+execute);
        }
    }
}



