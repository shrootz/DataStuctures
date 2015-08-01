package DataStructures;

public class Node<T>
{
	private T data;
	private Node<T> next;
	private Node<T> previous;

	public Node(T data)
	{
		this.data = data;
		next = null;
		previous = null;
	}
	
	public void setNext(Node<T> next)
	{
		this.next = next;
	}
	
	public void setPrevios(Node<T> prev)
	{
		this.previous = prev;
	}
	public T getData()
	{
		return data;
	}
	
	public Node<T> getNext()
	{
		return next;
	}
	
	public Node<T> getPrev()
	{
		return previous;
	}
}
