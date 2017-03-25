package info.main;



import java.util.ArrayList;
import java.util.List;

import info.classys.Car;
import info.classys.CarTrunk;
import info.classys.FamilyTrip;
import info.classys.Luggage;
import info.interfce.ILuggage;

public class Main {
	
	public static void main(String[] args){
	
		CarTrunk  carTrunk = new CarTrunk(14);
		Car ourFamillyCar = new Car("Honda Accord", carTrunk);
		
		Luggage momyBag = new Luggage("Huge momy bag");
		Luggage tennisRacket = new Luggage("My tennis racket");
		Luggage dadTools = new Luggage("Dad tools");
		
	
		List<ILuggage> ourLuggage = new ArrayList<ILuggage>();
		ourLuggage.add(momyBag);
		ourLuggage.add(tennisRacket);
		ourLuggage.add(dadTools);
		 
		
		FamilyTrip ourFamilyTrip = new FamilyTrip(ourFamillyCar, ourLuggage);
		ourFamilyTrip.PrepareFamilyTrip();
		
	
	}
}
