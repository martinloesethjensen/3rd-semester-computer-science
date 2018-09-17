public class MyArrayList<T> implements MyList<T> {
	private int initialCapacity = 5;
	private int size = 0;
	private T[] data = (T[]) new Object[initialCapacity];

	public MyArrayList() {
	}

	public MyArrayList(int initialCapacity) {
		this.initialCapacity = initialCapacity;
	}

	@Override
	public void add(T element) {
		if (this.size == data.length) {
			T[] temp = data;
			data = (T[]) new Object[this.size + 5]; //Arrays.copyOf(temp, size + 5);

			for (int i = 0; i < this.size; i++) {
				data[i] = temp[i];
			}
		}

		data[this.size] = element;
		this.size++;

		System.out.println("added: " + element);
	}

	@Override
	public T get(int index) {
		if (index > this.size - 1 || index < 0) {
			throw new IndexOutOfBoundsException("" + index);
		}

		return data[index];
	}

	@Override
	public void remove(int index) {

		if (index > this.size) {
			int difference = index - this.size;
			System.out.println("Index is to big with " + difference + " to many.");
			size++;

		} else {

			System.out.print("Removed: " + data[index] + "\n");

			for (int i = index; i < this.size; i++) {
				data[i] = data[i + 1];
			}
			size--;
			data[size] = null;
		}
	}

	@Override
	public int size() {
		if (this.data.length == 0) {
			return -1;
		}

		return this.size;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("[");
		for (int i = 0; i < this.size; i++) {
			stringBuilder.append(data[i]);
			if (i != this.size - 1) {
				stringBuilder.append(",");
			}
		}
		stringBuilder.append("]");
		return stringBuilder.toString();
	}
}
