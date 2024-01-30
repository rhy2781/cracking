package stacksAndQueues.java.StackOfPlates;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class setOfStacks {
	private List<fixedSizeStack> stacks;
	private int sizeOfStack;

	public setOfStacks(int sizeOfStack){
		this.stacks = new ArrayList<>();
		this.sizeOfStack = sizeOfStack;
	}

	public fixedSizeStack getLastStack(){
		if(stacks.size() == 0) return null;
		return stacks.get(stacks.size() - 1);
	}

	public void push(int value){
		fixedSizeStack f = getLastStack();
		if(f == null || f.isFull()){
			stacks.add(new fixedSizeStack(this.sizeOfStack));
			fixedSizeStack temp = getLastStack();
			temp.push(value);
		}
		else{
			f.push(value);
		}
	}

	public Integer pop(){
		fixedSizeStack f = getLastStack();
		while(f == null || f.isEmpty()){
			this.stacks.remove(f);
			f = getLastStack();
		}
		return f.pop();
	}

	@Override
	public String toString(){
		StringBuilder s = new StringBuilder();
		for(fixedSizeStack f: this.stacks){
			s.append(f.toString());
			s.append("\n");
		}
		return s.toString();
	}
}
