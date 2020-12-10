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
    super.add(findIndex(t), t);
    return true;
  }
}
