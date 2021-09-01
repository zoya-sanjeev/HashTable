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
	
	public void deleteNode(K key) {
		INode currentNode=this.head;
		INode previousNode=null;
		
		if(currentNode.getKey().equals(key)) {
			head=head.getNext();
			currentNode=null;
		}
		while(currentNode!=null) {
			if(currentNode.getKey().equals(key)) {
				if(currentNode.getNext()==null)
					previousNode.setNext(null);
				else 
					previousNode.setNext(currentNode.getNext());
				currentNode=null;
				break;
			}
			previousNode=currentNode;
			currentNode=currentNode.getNext();
		}
		
		
	}

	@Override
	public String toString() {
		return "LinkedList "+head+" ";
	}

}
