package myCollections;

import java.util.ArrayList;

import model.Block;

@SuppressWarnings("hiding")
public class HashTable<Integer, Block> {
	private int key;
	private Block value;
	
	private ArrayList<Block> blocks;
	
	public HashTable(int key, Block value){
		this.key=key;
		this.value=value;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public Block getValue() {
		return value;
	}

	public void setValue(Block value) {
		this.value = value;
	}
	
	public boolean isEmpty() {
		return false;
	}
	
	public void insert(int k, Block v) {
		
	}
	
	public <Integer, Block> Object search(int k) {
		return null;
	}
	
	public void delete(int k) {
		
	}
}
