package stacksAndQueues.java.animalShelter;

abstract class Animal {
	private int order;
	protected String name;
	public Animal(String n){
		this.name = n;
	}
	public void setOrder(int order){
		this.order = order;
	}
	public int getOrder(){
		return this.order;
	}
	public boolean isOlderThan(Animal a){
		return this.order < a.getOrder();
	}

	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		s.append("[Name: ");
		s.append(this.name);
		s.append(" - Order: ");
		s.append(this.order);
		s.append("]");
		return s.toString();
	}
}
