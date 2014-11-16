package main;

import beings.Animal;
import beings.Human;
import creator.AbstractCreator;
import creator.Creator;

public class Main {

	public static void main(String[] args) {
		
		AbstractCreator factory = Creator.create("forest");
		Animal cute = factory.createAnimal("mammal");
		cute.getAnimalInfo();
		
		
		/* nu vom putea crea un om fiindca factory este de tipul Forest
		si creeaza doar animale astfel vom face factory de tipul Maternity
		astfel omul poate fi produs */
		
		factory = null;
		factory = Creator.create("maternity");
		
		if(factory.getType().equals("Maternity"))
		{
			Human black = factory.createHuman("negroid");
			black.getHumanInfo();
		}
	}

}
