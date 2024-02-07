package stacksAndQueues.java.animalShelter;

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

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

		out.println(aq);
		out.println(aq.dequeueAny());
		out.println();

		out.println(aq);
		out.println(aq.dequeueCats());
		out.println();

		out.println(aq);
		out.println(aq.dequeueDogs());
		out.println();

		out.println(aq);
	}
}
