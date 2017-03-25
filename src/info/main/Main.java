package info.main;



import java.util.ArrayList;
import java.util.List;

import info.class_.Car;
import info.class_.CarTrunk;
import info.class_.FamilyTrip;
import info.class_.Luggage;
import info.interfce.ILuggage;

public class Main {
	
	public static void main(String[] args){
	
		CarTrunk  carTrunk = new CarTrunk(1);
		Car ourFamillyCar = new Car("Honda Accord", carTrunk);
		
		Luggage momyBag = new Luggage("Huge momy bag");
		Luggage tennisRacket = new Luggage("My tennis racket");
		Luggage dadTools = new Luggage("Dad tools");
	//	Luggage sonBag = new Luggage("Son  bag");
	
		List<ILuggage> ourLuggage = new ArrayList<ILuggage>();
		ourLuggage.add(momyBag);
		ourLuggage.add(tennisRacket);
		ourLuggage.add(dadTools);
		 
		
		FamilyTrip ourFamilyTrip = new FamilyTrip(ourFamillyCar, ourLuggage);
		ourFamilyTrip.PrepareFamilyTrip();
		
	
	}
}
