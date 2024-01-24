package linkedList.removeDuplicates;
import linkedList.Node;

public class runnerApproach {
	public void removeDuplicates(Node curr){
		while(curr != null){
			Node runner = curr;
			while(runner.next != null){
				if(runner.next.data == curr.data){
					runner.next = runner.next.next;
				}
				else{
					runner = runner.next;
				}
			}
			curr = curr.next;
		}
	}
}
