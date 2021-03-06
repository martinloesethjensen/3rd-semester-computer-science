package MySetImplementation;

public class Node<T>
{
	private T data;
	private Node next;

	public Node(T data, Node next)
	{
		this.data = data;
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node{" +
			"data=" + data +
			", next=" + next +
			'}';
	}
}
