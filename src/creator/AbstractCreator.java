package creator;

import beings.Animal;
import beings.Human;


public abstract class AbstractCreator {
	
	abstract public Animal createAnimal(String type);
	abstract public Human createHuman(String type);
	abstract public String getType();
	
}
