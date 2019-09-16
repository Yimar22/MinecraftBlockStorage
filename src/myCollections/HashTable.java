package myCollections;

import model.Block;

public class HashTable {
	
	public static final int INVENTORY_SIZE = 27;
	private Block[] blocks;
	
	public HashTable(){
		blocks = new Block[INVENTORY_SIZE];
		
	}

	
	public boolean isEmpty() {
		return false;
	}
	
	public boolean add(Block b) {
		boolean could = true;
		int counter = 1;
		int pos = hash(b.getId());
		if(blocks[pos] == null) {
			blocks[pos] = b;	
		}
		else if(getCubesLength(pos) < 64) {
			boolean added = false;
			Block actual = 	blocks[pos]; 
			while(!added && counter < 64) {
				if(actual.getNext() == null) {
					actual.setNext(b);
					added = true;
				} else {
					actual = actual.getNext();
				}
			}
			if(added == false) {
				could = false;
			}
		}else {
			could = false;
		}
		return could;
	}
	
	public int getCubesLength(int x) {
		int amount = 0;
		Block current = blocks[x];
		while( current != null) {
			amount++;
			current = current.getNext();
		}
		return amount;
	}

	
	public void delete(int k) {
		
	}
	
	public int hash(String key) {
		String[] parts = key.split("k");
		return Integer.parseInt(parts[1]);
	}
}
