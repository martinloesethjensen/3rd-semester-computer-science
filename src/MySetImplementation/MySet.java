package MySetImplementation;
import java.util.Arrays;
import java.util.Objects;

public class MySet<T> implements MySetInterface
{
	private int initialCapacity = 5;
	private int size = 0;
	private T[] mySet = (T[]) new Object[initialCapacity];

	public MySet() {}

	public MySet(int initialCapacity) {
		this.initialCapacity = initialCapacity;
	}

	@Override
	public boolean add(Object type) {

		System.out.println(size + " " + initialCapacity);
		if(mySet.length == this.size)
		{
			mySet = Arrays.copyOf(mySet, size + 5);
		}

		for (T type_in_mySet: mySet)
		{
			if(type == type_in_mySet)
			{
				System.out.println("Element already exists.");
				return false;
			}
		}

		mySet[size] = (T) type;
		this.size++;
		return false;
	}

	@Override
	public boolean contains(Object object) {
		return false;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean remove(Object object) {
		int i = 0;
		for (T type : mySet)
		{
			if(Objects.equals(object, type)){
				while (i < this.size) {
					mySet[i] = mySet[i + 1];
					i++;
				}
				System.out.println("removed: " + type);
				size--;
				return true;
			}
			i++;
		}

		return false;
	}

	@Override
	public String toString(){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("[\n");
		for (int i = 0; i < this.size; i++)
		{
			stringBuilder.append(mySet[i]);
			if(i != this.size - 1)
			{
				stringBuilder.append(",");
			}
		}
		stringBuilder.append("\nSize: " + size);
		stringBuilder.append("\n]");
		return stringBuilder.toString();
	}
}
