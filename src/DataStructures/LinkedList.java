package DataStructures;

public class LinkedList<T> {
	
	Node<T> head;
	Node<T> tail;
	int size;
	
	public LinkedList()
	{
		size = 0;
	}
	
	public void add(T data)
	{
		Node<T> n = new Node<T>(data);
		if(size == 0)
		{
			head = n;
			tail = head;
			size++;
			return;
		}
		tail.setNext(n);
		n.setPrevios(tail);
		tail = n;
		size++;
	}
	
	public void add(T data, int loc)
	{
		Node<T> n = new Node<T>(data);
		Node<T> next = get(loc);
		Node<T> previous = next.getPrev();
		n.setNext(next);
		n.setPrevios(previous);
		next.setPrevios(n);
		previous.setNext(n);
		size++;
	}
	
	public void printAll()
	{
		Node<T> n = head;
		for(int j = 0; j < size; j++)
		{
			System.out.print(n.getData() + " ");
			n = n.getNext();
		}
		System.out.print("\n");
	}
	
	public void removeLast()
	{
		tail = tail.getPrev();
		tail.setNext(null);
		size--;
	}
	
	private Node<T> get(int loc)
	{
		//loc = loc-1;
		if(loc>size)
		{
			return null;
		}
		Node<T> n = head;
		int j;
		for(j = 0; j < loc; j++)
		{
			n = n.getNext();
		}
		return n;
	}
	
	public T getData(int loc)
	{
		if(loc>size)
		{
			return null;
		}
		Node<T> n = head;
		int j;
		for(j = 0; j < loc; j++)
		{
			n = n.getNext();
		}
		return n.getData();
	}
	
	public boolean remove(int loc)
	{
		if(loc>=size)
		{
			return false;
		}
		else if(loc-1 == size) { removeLast(); return true;}
		else if(loc == 0) { removeFirst(); return true;}
		Node<T> n = get(loc);
		
		Node<T> prev = n.getPrev();
		Node<T> next = n.getNext();
		prev.setNext(next);
		next.setPrevios(prev);
		
		size --;
		return true;
	}
	
	public void removeFirst()
	{
		head = head.getNext();
		head.setPrevios(null);
		size--;
	}
	
	public int size()
	{
		return size;
	}
}
