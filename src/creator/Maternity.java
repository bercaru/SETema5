package creator;

import beings.Animal;
import beings.Human;
import beings.humans.Asian;
import beings.humans.Caucasian;
import beings.humans.Negroid;

public class Maternity extends AbstractCreator{

	@Override
	public Animal createAnimal(String type) {
		return null;
	}

	@Override
	public Human createHuman(String type) {
		if(type==null)
			return null;
		if(type.equals("caucasian"))
			return new Caucasian();
		if(type.equals("negroid"))
			return new Negroid();
		if(type.equals("asian"))
			return new Asian();
		return null;
	}

	@Override
	public String getType() {
		return "Maternity";
	}

}
