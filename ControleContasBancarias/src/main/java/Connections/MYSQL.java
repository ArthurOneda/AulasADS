package Connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class MYSQL {
	private static final String DataBase = "jdbc:mysql://127.0.0.1/trabalho_poo";
	private static final String User = "root";
	private static final String Password = "";
	
	public static Connection Connect() {
		try {
			return DriverManager.getConnection(DataBase, User, Password);
		} catch (Exception e){
			throw new RuntimeException("Problemas ao estabelecer a conexão,\ncom a seguinte mensagem:\n" + e);
		}
	}
	public static void Disconnect(Connection connection) {
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				throw new RuntimeException("Problemas ao finalizar a conexão,\ncom a seguinte mensagem:\n" + e);
			}
		}
	}
}