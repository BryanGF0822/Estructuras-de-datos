package model;

public class LinkedList<T extends Comparable<T>> implements ISimply<T> {

	private Node<T> first;
	private int nNodes;

	public LinkedList(Node<T> first, int nNodes) {
		this.first = first;
		this.nNodes = nNodes;
	}
	
	public boolean isEmpty() {
	    if (first == null)
	      return true;
	    else
	      return false;
	  }
	
	public int size(){
        return nNodes;
    }

	public void insertFirst(T n) {
		Node<T> newNode = new Node<T>(n);
		newNode.next = first;
		first = newNode;
		nNodes++;
	}

	public void insertLast(T n) {
		Node<T> newNode = new Node<T>(n);
		nNodes++;
		Node<T> aux = first;
		if (aux == null) {
			first = newNode;
		} else {
			while (aux.next != null) {
				aux = aux.next;
			}
			aux.next = newNode;
		}
	}
	
	public void insertInSortedList(T n) {
		Node<T> newNode = new Node<T>(n);

		if(first == null) {
			first = newNode;
			nNodes++;
		}else {

		Node<T> current = first;
		Node<T> temp = null;

		while ((current != null) && (current.compareTo(newNode)<0)) {
			temp = current;
			current = current.next;
		}

		newNode.next = current;
		temp.next = newNode;
		nNodes++;
		}
	}
	
	public boolean find(T n) {
		if(first == null) {
			return false;
		}

		Node<T> current = first;
		while(current != null) {
			if(current.data == n) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public boolean deleteNode(T n) {
		Node<T> aux = first, ant = null;
		boolean res =false;
		while (aux != null && !aux.data.equals(n)) {
			ant = aux;
			aux = aux.next;
		}
		if (aux != null) {
			res = true;
			this.nNodes--;
			if (ant == null) {
				first = aux.next;
			}
		}
		
		return res;
		
	}

	@Override
	public String toString() {
		String list = "";
		for (Node<T> aux = first; aux != null; aux = aux.next) {
			list +=aux.data.toString() + "\n";
		}
		return list;
	}

	
}
