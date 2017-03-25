package info.class_;

import java.util.List;

import info.interfce.ICar;
import info.interfce.ILuggage;

public class FamilyTrip {

	private ICar _familyCar;
	private List<ILuggage> _familyLuggage;

	public FamilyTrip(ICar familyCar, List<ILuggage> familyLuggage) {
		_familyCar = familyCar;
		_familyLuggage = familyLuggage;
	}

	public boolean PrepareFamilyTrip() {
		System.out.println("Family is Packing the car!");
		boolean packingIsSuccess = false;

		try {
			packingIsSuccess = _familyCar.PackLuggageToTheTrunk(_familyLuggage);
		} catch (Exception ex) {
			System.out.println("There is a problem with packing" + ex.getMessage());
		}
		if (!packingIsSuccess) {
			System.out.println("Too much luggage!");
			return false;
		}

		System.out.println("Dad is checking how much fuel we have!");
		 int carFuelLevel = _familyCar.CheckFuleLever();
	
	
		if (carFuelLevel < 50) {
			System.out.println("Dad needs to tank our family car!");
			return false;
		}

		System.out.println("Yay! We are ready to go!");
		return true;
	}

}
