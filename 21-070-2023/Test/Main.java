package Exam;
import java.time.LocalDate;
import java.util.ArrayList;
import com.address.Address;
public class Main {
	public static void main(String[] args) {
		ArrayList<Flight> flights = new ArrayList<Flight>();
		flights.add(new Flight("1", "HYD", "DBR", 5000, 180, 150, "15:30", "13:15", "AIR INDIA"));
		flights.add(new Flight("2", "HYD", "PUNE", 15000, 80, 50, "12:30", "18:15", "JET AIRWAYS"));
		
		ArrayList<Address> addresses = new ArrayList<Address>();
		addresses.add(new Address("SECTOR - 1", "HYD", "TS", null));
		
		ArrayList<Traveller> travellers = new ArrayList<Traveller>();
		travellers.add(new Traveller("Aman", "34634", "1",null, 0, null, null, null, null, LocalDate.now()));
		travellers.add(new Traveller("Gupta", "3246", "2",null, 0, null, null, null, null, LocalDate.now()));
		
		Airport airport = new Airport();
		
		System.out.println(airport.addFlight(new Flight("3", "HYD", "CCU", 15000, 100, 15, "15:30", "13:15", "VISTARA")));
		System.out.println(airport.addFlight(new Flight("4", "HYD", "DBR", 5000, 180, 150, "15:30", "13:15", "Indigo")));
	
		airport.searchFlightsBySourceAndDestination("HYD","DBR");
		
		airport.bookTicket("1", travellers.get(0));
		airport.bookTicket("2", travellers.get(0));
		
		
		ArrayList<Flight> searchRes = airport.searchFlightsBySourceAndDestination("HYD", "DBR");
		
		System.out.println(searchRes.size()+" flights found");
		for (int i=0;i<searchRes.size();i++) {
			System.out.println("Flight Id :- "+searchRes.get(i).getId());
			System.out.println("Flight Arival Tiem :- "+searchRes.get(i).getArrivalTime());
			System.out.println("Flight total seats :- "+searchRes.get(i).getTotalSeats());
			System.out.println("Flight remain seats :- "+searchRes.get(i).getAvailableSeats());
			System.out.println("Flight Detsianation :- "+searchRes.get(i).getDestiantion());
			
		
		
		airport.getAllFlights();
		
	}
}
}
