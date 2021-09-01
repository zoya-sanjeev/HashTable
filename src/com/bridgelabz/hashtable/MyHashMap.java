package com.bridgelabz.hashtable;

public class MyHashMap<K,V> {
	LinkedList<K> linkedlist;
	
	MyHashMap(){
		this.linkedlist=new LinkedList<>();
	}
	
	public V get(K key) {
		MyMapNode<K, V> myMapNode=(MyMapNode<K,V>) this.linkedlist.search(key);
		return (myMapNode==null)?null:myMapNode.getValue();
	}

	public void add(K key, V value) {
		MyMapNode<K, V> myMapNode=(MyMapNode) this.linkedlist.search(key);
		if(myMapNode==null) {
			myMapNode=new MyMapNode<>(key, value);
			this.linkedlist.append(myMapNode);
		}
		else {
			myMapNode.setValue(value);
		}
		
	}
	@Override
	public String toString() {
		return "MyHashMapNodes{"+linkedlist+"}";
	}
}
