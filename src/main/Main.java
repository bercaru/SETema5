package main;

import beings.Animal;
import beings.Human;
import creator.AbstractCreator;
import creator.Creator;

public class Main {

	public static void main(String[] args) {
		
		/* am creat o fabrica folosind metoda statica din clasa Creator "create" */
		AbstractCreator factory = Creator.create("forest");
		/* fabrica noastra e de tipul Forest astfel vom crea un animal */
		Animal cute = factory.createAnimal("mammal");
		/*apelamo metoda specifica clasei Animal*/
		cute.getAnimalInfo();
		
		
		/* nu vom putea crea un om fiindca factory este de tipul Forest
		si creeaza doar animale*/
		
		/* astfel vom face factory de tipul Maternity
		astfel obiectul de tip Human poate fi produs */
		
		factory = null;
		factory = Creator.create("maternity");
		
		if(factory.getType().equals("Maternity"))
		{
			Human black = factory.createHuman("negroid");
			black.getHumanInfo();
		}
	}

}
