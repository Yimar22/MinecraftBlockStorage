package model;

import myCollections.HashTable;

public class Inventory {

	private int amount;
	private String block;
	private HashTable hashTable;

	public Inventory() {
		hashTable = new HashTable();
	}

	public void generateRandomBlock() {
		amount = (int)(Math.random()*64)+1;
		block = "block"+((int)(Math.random()*27));
	}

	public boolean add(Block block) {
		return hashTable.add(block);

	}

	public HashTable getHashTable() {
		return hashTable;
	}


}
