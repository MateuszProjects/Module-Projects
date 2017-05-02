package info.class_;

import java.util.List;

import info.interfce.ICar;
import info.interfce.ICarTrunk;
import info.interfce.ILuggage;

public class Car implements ICar {

	public String Model;
	public ICarTrunk Trunk;

	@Override
	public ICarTrunk getICarTrunk() {
		// TODO Auto-generated method stub
		return Trunk;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return Model;
	}

	public Car(String model, ICarTrunk trunk) {
		Model = model;
		Trunk = trunk;

	}
	


	@Override
	public int CheckFuleLever() {
		// TODO Auto-generated method stub
		System.out.println("Fuel level checking...");
		return FuelChecker.ReturnFulLevel();
	}

	@Override
	public boolean PackLuggageToTheTrunk(List<ILuggage> luggageItems) {
		// TODO Auto-generated method stub
		if (luggageItems == null) {
			
			try {
				throw new Exception("Luggage does not exist!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
			if (luggageItems.size() > Trunk.getTrunkCapacity()) 
			{
				System.out.println("Car trunk is not big enough for such a luggage!");
				return false;
			}
			
			  for(ILuggage object : luggageItems){
				  Trunk.PackItem(Model, object);
			  }
			 
			 
		return true;
	}
}
