package com.bridgelabz.hashtable;

public class MyMapNode<K,V> implements INode<K> {
	
	K key;
	V value;
	MyMapNode next;
	@Override
	public K getKey() {
		
		return key;
	}
	@Override
	public void setKey(K key) {
		this.key=key;
		
	}
	@Override
	public INode<K> getNext() {
		return next;
	}
	@Override
	public void setNext(INode<K> next) {
		this.next=(MyMapNode<K,V>) next;
		
	}
	
	public V getValue() {
		return this.value;
	}
	
	public void setValue(V value) {
		this.value=value;
	}
	
	@Override
	public String toString() {
		StringBuilder myMapNodeString =new StringBuilder();
		myMapNodeString.append("MyMapNode{"+"K=").append(key).append(" V=").append(value+"}");
		if(next!=null)
			myMapNodeString.append("->").append(next);
		return myMapNodeString.toString();
	}

}
