public interface MyList<T>
{
	/**
	 * Adds element to the list.
	 * @param element type
	 */
	void add(T element);

	/**
	 * Method to get the type from the index of the list.
	 * @param index int
	 * @return type
	 */
	T get(int index);

	/**
	 * Remove element from list.
	 * @param index int
	 */
	void remove(int index);

	/**
	 * Return the size of the list
	 * @return int
	 */
	int size();

	/**
	 * Returns string
	 * @return String
	 */
	String toString();
}
