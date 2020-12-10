import java.util.ArrayList;

public class NoNullArrayList<T> extends ArrayList<T>{
  public NoNullArrayList(){
    super();
  }

  public NoNullArrayList(int initialCapacity){
    super(initialCapacity);
  }

  public boolean add(T t){
    if (t == null){
      throw new IllegalArgumentException("null is not a valid item to add to the list");
    }
    super.add(t);
    return true;
  }

  public void add(int index, T element){
    if (element != null){
      super.add(index, element);
    }
    else{
      throw new IllegalArgumentException("null is not a valid item to add to the list");
    }
  }


}
