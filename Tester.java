public class Tester{
  public static void main(String[] args){
    NoNullArrayList<String> A = new NoNullArrayList<String>();
    A.add("TEST");
    System.out.println(A);
    try{
      A.add(null);
      System.out.println(A);
    }
    catch(IllegalArgumentException e){
      System.out.println("Worked");
    }

    NoNullArrayList<String> B = new NoNullArrayList<String>();
    B.add("1");
    B.add("3");
    B.add(1, "2");
    System.out.println(B);
    try{
      B.add(1, null);
    }
    catch(IllegalArgumentException e){
      System.out.println("Worked");
    }

    OrderedArrayList<Integer> C = new OrderedArrayList<Integer>();
    C.add(3);
    C.add(1);
    C.add(2);
    C.add(10);
    System.out.println(C);
    try{
      C.add(1, null);
    }
    catch(IllegalArgumentException e){
      System.out.println("Worked");
    }

    OrderedArrayList<Integer> D = new OrderedArrayList<Integer>();
    D.add(1);
    D.add(2);
    D.add(3);
    D.add(1,5);
    D.add(0,6);
    System.out.println(D);
    try{
      D.add(1, null);
    }
    catch(IllegalArgumentException e){
      System.out.println("Worked");
    }

  }
}
