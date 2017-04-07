package info.Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import info.Car.Bus;
import info.Passenger.IPassenger;
import info.Passenger.Passenger;
import info.Seats.Seats;

public class Main {

	public static void main(String[] args) {
		Seats seats = new Seats(3);
		Bus bus = new Bus("Solaris", seats);
		
		
		Passenger passengerJan = new Passenger("Jan");
		Passenger passengerTomasz = new Passenger("Tomasz");
		Passenger passengerAdam = new Passenger("Adam");
		
		List<IPassenger> list = new ArrayList<IPassenger>();
		list.add(passengerJan);
		list.add(passengerTomasz);
		list.add(passengerAdam);
		
		
		
		
		bus.IFBusPackagePassangers();
	}

}
