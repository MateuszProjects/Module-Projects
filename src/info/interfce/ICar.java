package info.interfce;

import java.util.List;

public interface ICar  {
	
	ICarTrunk getICarTrunk();
	
	String getModel();

	int CheckFuleLever();
	
	boolean PackLuggageToTheTrunk(List<ILuggage> luggageItems);

}
