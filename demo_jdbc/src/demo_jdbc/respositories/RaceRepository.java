package demo_jdbc.respositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import demo_jdbc.models.Circuit;
import demo_jdbc.models.Race;

public class RaceRepository {
	String jdbcUrl = "jdbc:postgresql://localhost:5432/formula1";
	String user = "postgres";
	String password = "11032003";
	
	public List<Race> getRacesByYear(int yearParam){
		
		List<Race> races = new ArrayList<Race>();
		
		try {
			// Establecer la conexion
			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			
			// Crear una sentencia
			Statement statement = conn.createStatement();
			
			// Ejecutar la consulta
			String sql = "select * from races where year = '" + yearParam + "'";
			ResultSet rs = statement.executeQuery(sql);
			
			// Procesar los resultados
			while(rs.next()) {
				int race_Id = rs.getInt("race_Id");
				int year = rs.getInt("year");
				int round = rs.getInt("round");
				int circuit_Id = rs.getInt("circuit_Id");
				String name = rs.getString("name");
				String date = rs.getString("date");
				String time = rs.getString("time");
				String url = rs.getString("url");

				
				Race race = new Race(race_Id, year, round, circuit_Id, name, date, time, url);
				races.add(race);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return races;
		
	}    
	
	
	
	public List<Race> getRaces(){
		
		List<Race> races = new ArrayList<Race>();
		
		try {
			// Establecer la conexion
			Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("Se conecto a la base de datos");
			
			// Crear una sentencia
			Statement statement = conn.createStatement();
			
			// Ejecutar la consulta
			String sql = "SELECT * FROM races";
			ResultSet rs = statement.executeQuery(sql);
			
			// Procesar los resultados
			while(rs.next()) {
				int race_Id = rs.getInt("race_Id");
				int year = rs.getInt("year");
				int round = rs.getInt("round");
				int circuit_Id = rs.getInt("circuit_Id");
				String name = rs.getString("name");
				String date = rs.getString("date");
				String time = rs.getString("time");
				String url = rs.getString("url");
				
				Race race = new Race(race_Id, year, round, circuit_Id, name, date, time, url);
				races.add(race);
			}
			
		}catch(Exception ex) { 
			ex.printStackTrace();
		}
		
		return races;
	}
	
}
