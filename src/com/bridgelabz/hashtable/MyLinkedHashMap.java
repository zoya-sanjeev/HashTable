package com.bridgelabz.hashtable;

import java.util.ArrayList;

public class MyLinkedHashMap<K,V> {
	private final int numBuckets;
	ArrayList<LinkedList<K>> myBuckeyArray;
	public MyLinkedHashMap(){
		this.numBuckets=10;
		this.myBuckeyArray=new ArrayList<>(numBuckets);
		
		for(int i=0;i<numBuckets;i++)
			this.myBuckeyArray.add(null);
	}
	
	private int getBucketIndex(K key) {
		int hashCode=Math.abs(key.hashCode());
		int index=hashCode% numBuckets;
		System.out.println("Key: "+key+" hashcode: "+hashCode+" index: "+index);
		return index;
	}
	
	public V get(K key) {
		int index=this.getBucketIndex(key);
		LinkedList<K> myLinkedList=this.myBuckeyArray.get(index);
		if(myLinkedList==null)
			return null;
		MyMapNode<K,V> myMapNode=(MyMapNode<K,V>) myLinkedList.search(key);
		return (myMapNode==null)?null:myMapNode.getValue();
	}

	public void add(K key, V value) {
		int index=this.getBucketIndex(key);
		LinkedList<K> myLinkedList=this.myBuckeyArray.get(index);
		if(myLinkedList==null) {
			myLinkedList=new LinkedList<>();
			this.myBuckeyArray.set(index, myLinkedList);
		}
		MyMapNode<K,V> myMapNode=(MyMapNode<K,V>)myLinkedList.search(key);
		if(myMapNode==null) {
			myMapNode=new MyMapNode<K, V>(key, value);
			myLinkedList.append(myMapNode);
		}else {
			myMapNode.setValue(value);
		}
	}
}
