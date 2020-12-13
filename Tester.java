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

    OrderedArrayList<Integer> E = new OrderedArrayList<Integer>();
    E.add(1);
    E.add(1);
    E.add(2);
    E.add(3);
    E.add(4);
    E.add(5);
    System.out.println(E.set(2, 6));
    System.out.println(E);
    try{
      E.add(0, null);
    }
    catch(IllegalArgumentException e){
      System.out.println("Worked");
    }

    OrderedArrayList<String> A1 = new OrderedArrayList<String>(0);
    A1.add("A");
    A1.add("C");
    A1.add("B");
    System.out.println(A1);


    OrderedArrayList<Integer> B1 = new OrderedArrayList<Integer>();
    B1.add(1);
    B1.add(5);
    B1.add(2);
    System.out.println(B1);

    OrderedArrayList<Integer> C1 = new OrderedArrayList<Integer>();
    C1.add(-1);
    C1.add(-5);
    C1.set(0, 2);
    System.out.println(C1);
  }
}
