import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }

  public boolean add(T t){
    if (t != null){
      super.add(t);
      return true;
    }
    else{
      throw new IllegalArgumentException("null is not a valid item to add to the list");
    }
  }
}
