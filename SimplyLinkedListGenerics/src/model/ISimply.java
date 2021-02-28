package model;

public interface ISimply<T> {
	
	public boolean isEmpty();
	
	public int size();
	
	public void insertInSortedList(T n);
	
	public boolean find(T n);
	
	public boolean deleteNode(T n);
}
