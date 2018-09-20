package MySetImplementation;

public class RunMySet {

    public static void main(String[] args) {
      MySet mySet = new MySet();

      Node node1 = new Node("string", null);
      Node genisisNode = new Node(123, node1);

      mySet.add(genisisNode);
      mySet.add(node1);
      mySet.add(node1); //to check that it can't add an existing element to the set.

      mySet.add(11);
      mySet.add(1);
      mySet.add(5);

      mySet.add(4);
      mySet.add(3);
      mySet.add(2);



      mySet.remove(node1);

      System.out.println(mySet);
    }
}
