package model;

public class  Node<T extends Comparable<T>> implements Comparable<Node<T>>  {
	T data;
	Node<T> next;
	
	public Node(T n) {
		this(n, null);
	}
	
	public Node(T data, Node<T> next) {
		super();
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public int compareTo(Node<T> o) {
		// TODO Auto-generated method stub
		return data.compareTo(o.data);
	}	
	
}
