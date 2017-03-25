package info.classys;

import info.interfce.ILuggage;

public class Luggage implements ILuggage {

	public String Name;

	public Luggage(String name){
		Name = name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return Name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.Name = name;
	}

}
