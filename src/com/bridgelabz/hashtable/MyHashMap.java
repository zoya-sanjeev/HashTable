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

}
