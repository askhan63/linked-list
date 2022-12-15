package linkedlist;


public interface MyList<T> {
    public  abstract void add(T t);
    public  abstract void add(int index,T t);
    public  abstract boolean isEmpty();
    public  abstract int size();
    public  abstract void clear();
    public  abstract boolean contains(T t);
    public  abstract T get(int index);
    public  abstract int indexOf(T t);
    public  abstract void remove(T t);
    public  abstract T remove(int index);
}