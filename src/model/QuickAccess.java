package model;

import myCollections.Stack;

public class QuickAccess {
	
	private Stack[] stackOfBlocks;
	private int[] length;
			
	public QuickAccess() {
		stackOfBlocks = new Stack[32];
		length = new int[32];
		
		for(int i = 0; i < stackOfBlocks.length; i++) {
			stackOfBlocks[i] = new Stack();
		}
	}
	
	public void add(Block B) {
		
	}
}
