public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int initialCapacity){
    super(initialCapacity);
  }

  private int findIndex(T element){
    int index = 0;

    for(int i = 0; i < size(); i++){
      if (element.compareTo(get(i)) >= 0){
        index = i + 1;
      }
    }
    return index;
  }

  public boolean add(T t){
    if (t == null){
      throw new IllegalArgumentException("null is not a valid item to add to the list");
    }
    super.add(findIndex(t), t);
    return true;
  }

  public void add(int index, T element){
    add(element);
  }

  public T set(int index, T element){
    if (element == null){
      throw new IllegalArgumentException("null is not a valid item to add to the list");
    }
    T old = remove(index);
    add(index, element);

    return old;
  }
}
