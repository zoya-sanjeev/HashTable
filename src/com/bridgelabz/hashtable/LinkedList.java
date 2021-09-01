package com.bridgelabz.hashtable;


public class LinkedList<K> {
	private INode head;
	private INode tail;

	public LinkedList() {
		this.head=null;
		this.tail=null;
	}

	
	public void append(INode newNode) {
		if(this.head==null)
			this.head=newNode;
		if(this.tail==null)
			this.tail=newNode;
		else {
			this.tail.setNext(newNode);
			this.tail=newNode;
		}
			
	}


	public INode search(K key) {
		INode tempNode=this.head;
		while(tempNode!=null) {
			if(tempNode.getKey().equals(key))
				return tempNode;
			tempNode=tempNode.getNext();
		}
		return tempNode=null;	
		
	}
	
	
	public int size() {
		INode tempNode = this.head;
		int size=1;
		while(!tempNode.equals(tail)) {
			tempNode=tempNode.getNext();
			size++;
		
		}
		return size;
	}

	@Override
	public String toString() {
		return "LinkedList "+head+" ";
	}

}
