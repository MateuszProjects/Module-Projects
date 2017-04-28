package info.Trip;

import java.util.List;

import info.Car.IBus;
import info.Passenger.IPassenger;

public class Trip {

	public IBus _IBus;
	public List<IPassenger> _passangerList;

	public Trip(List<IPassenger> list, IBus iBus) {
		_IBus = iBus;
		_passangerList = list;
	}

}
