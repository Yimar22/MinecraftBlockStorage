package myCollections;

public class Stack {
	
	private Object[] elements;
	private int top;
	private int amount = 0;
	
	public Stack() {
		top=-1;
	}
	
	public Object pop() {
		Object aux;
		
		if(empty())
		return null;
		
		aux=elements[top];
		return aux;
	}
	
	
	public int size() {
		return top+1;
	}
	
	public boolean empty() {
		
		return top<0;
	}
	
	public void push(Object toPush) {
		if(size()<amount) {
			elements[++top] = toPush;
		}

	}


	public int peek() {
		return top;
	}

	
	
}
