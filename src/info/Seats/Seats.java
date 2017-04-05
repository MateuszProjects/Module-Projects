package info.Seats;

public class Seats implements ISeats {

	public int Seats;

	@Override
	public int getSeats() {
		// TODO Auto-generated method stub
		return Seats;
	}
	
	/*
	private void setSeats(int seats){
		Seats = seats;
	}
	*/
	public Seats(int iseats){
		Seats = iseats;
		
	}

	
	
	
	
}
