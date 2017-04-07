package info.Passenger;

public class Passenger implements IPassenger {

	public String Name;
	public String Surname;

	public Passenger(String name) {
		Name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Name;
	}

	@Override
	public String getSurname() {
		// TODO Auto-generated method stub
		return Surname;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.Name = name;
	}

	@Override
	public void setSurname(String surname) {
		// TODO Auto-generated method stub
		this.Surname = surname;
	}

}
