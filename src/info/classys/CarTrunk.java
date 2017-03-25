package info.classys;

import info.interfce.ICarTrunk;
import info.interfce.ILuggage;

public class CarTrunk implements ICarTrunk{
	
	public int TrunkCapacity;
	
	
	private void setTrunkCapacity(int trunkCapacity) {
		TrunkCapacity = trunkCapacity;
	}

	public CarTrunk(int capacity){
		TrunkCapacity = capacity;
	}

	@Override
	public int getTrunkCapacity() {
		// TODO Auto-generated method stub
		return TrunkCapacity;
	}

	@Override
	public void PackItem(String carModel, ILuggage item) {
		// TODO Auto-generated method stub
		System.out.println(String.format("New item: {0} has been packed to {1} trunk", item.getName(), carModel));
		
	}




	


}
