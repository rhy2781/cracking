package stacksAndQueues.java.animalShelter;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void createAnimals(String[][] pairs, List<Animal> storage){
		for(String[] pair: pairs){
			if(pair[0].equals("c")){
				storage.add(new Cat(pair[1]));
			}
			else{
				storage.add(new Dog(pair[1]));
			}
		}
	}

	public static void main(String[] args){
		AnimalQueue aq = new AnimalQueue();
		String[][] pairs = new String[][]{
				{"c","Fleas"},
				{"d", "Kaido"},
				{"c", "Bumi"},
				{"c", "Sir. Meowington"},
				{"d", "Harper"},
				{"d", "Cookie"}
		};
		List<Animal> storage = new ArrayList<>();
		createAnimals(pairs, storage);

		for(Animal a: storage){
			aq.enqueue(a);
		}

		System.out.println(aq);
		System.out.println(aq.dequeueAny());
		System.out.println();

		System.out.println(aq);
		System.out.println(aq.dequeueCats());
		System.out.println();

		System.out.println(aq);
		System.out.println(aq.dequeueDogs());
		System.out.println();

		System.out.println(aq);





	}

}
