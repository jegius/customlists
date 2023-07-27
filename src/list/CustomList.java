package list;

public interface CustomList<T> extends Iterable <T>{
    public CustomList<T> add(T element);

    public CustomList<T> add(T element, int index);
    public T get(Integer index);
    public CustomList<T> remove(Integer index);

    public CustomList<T> removeAll();
    public CustomList<T> addAll(CustomList<T> newCustomList);

    public int size();
}
