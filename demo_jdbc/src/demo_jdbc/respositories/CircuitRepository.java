package demo_jdbc.respositories;

import demo_jdbc.models.Circuit;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CircuitRepository {
	
	String jdbcUrl = "jdbc:postgresql://localhost:5432/formula1";
	String user = "postgres";
	String password = "11032003";
    
	public void nuevoCircuito(Circuit circuit) {
		// logica de ingreso a base de datos
		// insert into circuits......
	}
	
	public List<Circuit> getCircuitsByCountry(String countryParam){
		
		List<Circuit> circuits = new ArrayList<Circuit>();
		
		try {
			// Establecer la conexion
			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			
			// Crear una sentencia
			Statement statement = conn.createStatement();
			
			// Ejecutar la consulta
			String sql = "select * from circuits where country = '" + countryParam + "'";
			ResultSet rs = statement.executeQuery(sql);
			
			// Procesar los resultados
			while(rs.next()) {
				int circuit_id = rs.getInt("circuit_id");
				String circuit_ref = rs.getString("circuit_ref");
				String name = rs.getString("name");
				String location = rs.getString("location");
				String country = rs.getString("country");
				float lat = rs.getFloat("lat");
				float lng = rs.getFloat("lng");
				int alt = rs.getInt("alt");
				String url = rs.getString("url");
				
				Circuit circuit = new Circuit(circuit_id, circuit_ref, name, location, country, lat, lng, alt, url);
				circuits.add(circuit);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return circuits;
		
	}
	
	
	public List<Circuit> getCircuits(){
		
		List<Circuit> circuits = new ArrayList<Circuit>();
		
		try {
			// Establecer la conexion
			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("Se conecto a la base de datos");
			
			// Crear una sentencia
			Statement statement = conn.createStatement();
			
			// Ejecutar la consulta
			String sql = "SELECT * FROM circuits";
			ResultSet rs = statement.executeQuery(sql);
			
			// Procesar los resultados
			while(rs.next()) {
				int circuit_id = rs.getInt("circuit_id");
				String circuit_ref = rs.getString("circuit_ref");
				String name = rs.getString("name");
				String location = rs.getString("location");
				String country = rs.getString("country");
				float lat = rs.getFloat("lat");
				float lng = rs.getFloat("lng");
				int alt = rs.getInt("alt");
				String url = rs.getString("url");
				
				Circuit circuit = new Circuit(circuit_id, circuit_ref, name, location, country, lat, lng, alt, url);
				circuits.add(circuit);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return circuits;
	}

}
