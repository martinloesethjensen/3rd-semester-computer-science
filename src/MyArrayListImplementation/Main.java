package MyArrayListImplementation;

public class Main
{
	public static void main(String[] args)
	{
		MyArrayList<Integer> myArrayList = new MyArrayList<>();
		myArrayList.add(1);
		myArrayList.add(2);
		myArrayList.add(3);
		myArrayList.add(4);
		myArrayList.add(9);
		myArrayList.add(8);
		myArrayList.add(7);
		myArrayList.add(6);

		System.out.println(myArrayList.get(3));

		myArrayList.remove(0);
		System.out.println(myArrayList);
	}
}
