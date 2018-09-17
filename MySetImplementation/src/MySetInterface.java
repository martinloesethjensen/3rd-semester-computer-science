public interface MySetInterface<T>
{
	/**
	 * Adds the specified element to this set if it is not already present
	 * @param type T
	 * @return boolean
	 */
	boolean add(T type);

	/**
	 * Returns true if this set contains the specified element.
	 * @param object Object
	 * @return boolean
	 */
	boolean contains(Object object);

	/**
	 * Returns true if this set contains no elements.
	 * @return boolean
	 */
	boolean isEmpty();

	/**
	 * Returns the number of elements in this set
	 * @return int
	 */
	int size();

	/**
	 * Removes the specified element from this set if it is present
	 * @param object Object
	 * @return boolean
	 */
	boolean remove(Object object);

	String toString();
}
