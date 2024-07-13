package demo_jdbc.respositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import demo_jdbc.models.Constructors;
import demo_jdbc.models.Race;

public class ConstructorRepository {


	String jdbcUrl = "jdbc:postgresql://localhost:5432/formula1";
	String user = "postgres";
	String password = "11032003";

	public List<Constructors> getConstructorByNationality(String nationalityParam){
		
		List<Constructors> constructorslist = new ArrayList<Constructors>();
		
		try {
			// Establecer la conexion
			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			
			// Crear una sentencia
			Statement statement = conn.createStatement();
			
			// Ejecutar la consulta
			String sql = "select * from constructors where nationality = '" + nationalityParam + "'";
			ResultSet rs = statement.executeQuery(sql);
			
			// Procesar los resultados
			while(rs.next()) {
				int constructor_Id = rs.getInt("constructor_Id");
				String constructor_Ref = rs.getString("constructor_Ref");
				String name = rs.getString("name");
				String nationality = rs.getString("nationality");
				String url = rs.getString("url");

				
				Constructors constructors = new Constructors(constructor_Id, constructor_Ref, name, nationality, url);
				constructorslist.add(constructors);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return constructorslist;
		
	}    
	
	
	public List<Constructors> getConstructor(){
		
		List<Constructors> constructor = new ArrayList<Constructors>();
		
		try {
			// Establecer la conexion
			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("Se conecto a la base de datos");
			
			// Crear una sentencia
			Statement statement = conn.createStatement();
			
			// Ejecutar la consulta
			String sql = "SELECT * FROM constructors";
			ResultSet rs = statement.executeQuery(sql);
			
			// Procesar los resultados
			while(rs.next()) {
				int constructor_Id = rs.getInt("constructor_Id");
				String constructor_Ref = rs.getString("constructor_Ref");
				String name = rs.getString("name");
				String nationality = rs.getString("nationality");
				String url = rs.getString("url");

				
				Constructors constructors = new Constructors(constructor_Id, constructor_Ref, name, nationality, url);
				constructor.add(constructors);
			}
			
		}catch(Exception ex) { 
			ex.printStackTrace();
		}
		
		return constructor;
	}	
	
}
