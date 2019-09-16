package myCollections;

import java.util.ArrayList;

public class HashTable<T> {
	private Key key;
	private Value value;
	
	private ArrayList<Block> blocks;
	
	public HashTable<T>(){
		
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}
	
	public boolean isEmpty() {
		return false;
	}
	
	public void insert(Key k, Value v) {
		
	}
	
	public T search(Key k) {
		
	}
	
	public void delete(Key k) {
		
	}
}
