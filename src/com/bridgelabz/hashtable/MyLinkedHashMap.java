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
}
