
/* clasa care va crea obiecte de tip Animal implementeaza meode
 * din clasa AbstractCreator
 */


package creator;

import beings.Animal;
import beings.Human;
import beings.animals.*;

public class Forest extends AbstractCreator {

	@Override
	public Animal createAnimal(String type) {
		if(type==null)
			return null;
		
		if(type.equals("mammal"))
			return new Mammal();
		if(type.equals("insect"))
			return new Insect();
		if(type.equals("bird"))
			return new Bird();
		
		return null;
	}

	@Override
	public Human createHuman(String type) {
		return null;
	}

	@Override
	public String getType() {
		return "Forest";
	}

}
