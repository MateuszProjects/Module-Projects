package info.Main;

import info.Car.Bus;
import info.Seats.Seats;

public class Main {

	public static void main(String[] args) {
		Seats seats = new Seats(3);
		Bus bus = new Bus("Solaris", seats);
		
		bus.IFBusPackagePassangers();
	}

}
