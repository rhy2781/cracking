package stacksAndQueues.java.animalShelter;

import java.util.LinkedList;
import java.util.Queue;

public class AnimalQueue {
	private Queue<Dog> dogs;
	private Queue<Cat> cats;
	private int order;

	public AnimalQueue(){
		this.dogs = new LinkedList<>();
		this.cats = new LinkedList<>();
		this.order = 0;
	}

	public void enqueue(Animal a){
		this.order ++;
		if(a instanceof Dog){
			a.setOrder(this.order);
			dogs.add((Dog) a);
		}
		else{
			a.setOrder(this.order);
			cats.add((Cat) a);
		}
	}
	public Cat dequeueCats(){
		return this.cats.poll();
	}

	public Dog dequeueDogs(){
		return this.dogs.poll();
	}

	public Animal dequeueAny(){
		if(this.dogs.size() == 0){
			return dequeueCats();
		}
		else if(this.cats.size() == 0){
			return dequeueDogs();
		}

		Cat c = this.cats.peek();
		Dog d = this.dogs.peek();
		if(d.isOlderThan(c)){
			return dequeueDogs();
		}
		return dequeueCats();
	}

	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append("Dogs - ");
		s.append(dogs);
		s.append("\n");
		s.append("Cats - ");
		s.append(cats);
		return s.toString();
	}
}
