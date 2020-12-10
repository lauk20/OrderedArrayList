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
    B.add(1, null);
  }
}
