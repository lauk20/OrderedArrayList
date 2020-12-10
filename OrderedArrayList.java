public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
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
    T old = get(index);
    remove(index);
    add(element);

    return old;
  }
}
