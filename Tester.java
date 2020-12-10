public class Tester{
  public static void main(String[] args){
    NoNullArrayList A = new NoNullArrayList<String>();
    A.add("TEST");
    System.out.println(A);
    A.add(null);
    System.out.println(A);
  }
}
