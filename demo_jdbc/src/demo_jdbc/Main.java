package demo_jdbc;


import demo_jdbc.respositories.QueryRepository;
import demo_jdbc.models.Circuit;
import demo_jdbc.models.Constructors;
import demo_jdbc.models.DriverMaxPoint;
import demo_jdbc.models.Race;
import demo_jdbc.respositories.CircuitRepository;
import demo_jdbc.respositories.ConstructorRepository;
import demo_jdbc.respositories.RaceRepository; 


public class Main {

	public static void main(String[] args) {
		String tema = "CONSULTAS CIRCUITS";
		System.out.println("=".repeat(50));
		System.out.printf("%28s\n" , tema );

		System.out.println("=".repeat(50));
		
		CircuitRepository circuitRepository = new CircuitRepository();
				
		var circuits = circuitRepository.getCircuits();
		
		
		System.out.println("Total circuitos: " + circuits.size());
		
		String country = "Russia";
		
		var circuitsByCountry = circuitRepository.getCircuitsByCountry(country);
		
		System.out.println("Circuitos de " + country);
		
		for(Circuit circuit:circuitsByCountry) {
			System.out.println(circuit.getName() + "\t" + circuit.getLocation() + "\t"+ circuit.getCountry());
		}
		
//# ========================================================================================================================							
		String tema2= "CONSULTAS DE RACE";
		System.out.println("=".repeat(50));
		System.out.printf("%28s\n" , tema2);

		System.out.println("=".repeat(50));
		
		RaceRepository raceRepository = new RaceRepository();
		var races = raceRepository.getRaces();
		System.out.println(("Total de Circuitos: ") + races.size());
		int year = 2009;
		var racesByYear = raceRepository.getRacesByYear(year);
		System.out.println("Carreras del año " + year);
		for (Race race : racesByYear) {
			System.out.println(race.getName() + "'\t" + race.getRound() + "\t" + race.getDate() );
		}
		
//# ========================================================================================================================							
		String tema3= "CONSULTAS DE CONSTRUCTORS";
		System.out.println("=".repeat(50));
		System.out.printf("%28s\n" , tema3);

		System.out.println("=".repeat(50));		
		
		ConstructorRepository constructorRepository = new ConstructorRepository();
		var constructor = constructorRepository.getConstructor();
		System.out.println(("Total de Circuitos: ") + constructor.size());
		String nationality = "Italian";
		var constructorByNationality = constructorRepository.getConstructorByNationality(nationality);
		System.out.println("Contructors de " + nationality);
		for (Constructors constructors : constructorByNationality) {
			System.out.println(constructors.getName() + "\t" );
		}
//# =========================================================================================================================
		
		String tema4= "CONSULTAS DE PUNTOS ";
		System.out.println("=".repeat(50));
		System.out.printf("%28s\n" , tema4);

		System.out.println("=".repeat(50));	
		
		QueryRepository queryRepository = new QueryRepository();
		var results = queryRepository.getDriverMaxPoints();
		
		
		System.out.println("\n\n");
		for (DriverMaxPoint rs : results) {
			System.out.println(rs.getDriverName() + "\t" + rs.getPoints());
	
	}

  }
}
