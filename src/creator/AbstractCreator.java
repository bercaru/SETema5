/* abstract creator este clasa mea abstracta de tip AbstractFactory
 * din aceasta clasa se or deriva 2 clase Forest si Maternity
 */

package creator;

import beings.Animal;
import beings.Human;


public abstract class AbstractCreator {
	
	abstract public Animal createAnimal(String type);
	abstract public Human createHuman(String type);
	abstract public String getType();
	
}
