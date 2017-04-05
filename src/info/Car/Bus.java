package info.Car;


import info.Seats.ISeats;

public class Bus implements IBus {

	public String Name;
	public ISeats Seats;
	
	@Override
	public ISeats getISeats() {
		// TODO Auto-generated method stub
		return Seats;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Name;
	}
	
	public Bus(String name, ISeats seats){
		Name = name;
		Seats = seats;
	}

	@Override
	public boolean IFBusPackagePassangers() {
		boolean variable = true;
		
		System.out.println(Name);
		System.out.println(Seats.getSeats());
		
		return variable;
	}

	
}
