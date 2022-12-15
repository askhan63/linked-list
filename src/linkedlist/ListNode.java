package linkedlist;


public class ListNode<T> {
    private T value;
    private   ListNode<T> next;
    private   ListNode<T> previous;
    public ListNode(){
        value=null;
        next=null;
        previous=null;
    }
    public ListNode(T value){
        this.value=value;
        next=null;
        previous=null;
    }
    public ListNode(T value,ListNode<T> next,ListNode<T> previous){
        this.value=value;
        this.next=next;
        this.previous=previous;

    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public void setPrevious(ListNode<T> previous) {
        this.previous = previous;
    }




    public T getValue() {
        return value;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public ListNode<T> getPrevious() {
        return previous;
    }
}