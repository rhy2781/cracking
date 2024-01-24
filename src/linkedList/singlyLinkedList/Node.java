package linkedList.singlyLinkedList;

public class Node {
	public Node next = null;
	public int data;
	public Node(int data){
		this.data = data;
	}

	@Override
	public String toString(){
		Node curr = this;
		StringBuilder s = new StringBuilder();
		while(curr != null){
			s.append(curr.data);
			s.append(" -> ");
			curr = curr.next;
		}
		return s.toString();
	}
}