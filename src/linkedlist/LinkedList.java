package linkedlist;

// TODO: make it implement the interface MyList
public class LinkedList<T> implements MyList<T> {
    // TODO: add attributes
    private ListNode<T> first;
    private ListNode<T> last;
    private int size;
    // TODO: add a constructor
    public LinkedList() {
        first=null;
        last=null;
        size=0;
    }


    // TODO: add getters and setters

    public void setFirst(ListNode<T> first) {
        this.first = first;
    }

    public void setLast(ListNode<T> last) {
        this.last = last;
    }

    public ListNode<T> getFirst() {
        return first;
    }

    public ListNode<T> getLast() {
        return last;
    }



    // TODO: implement interface methods



    @Override
    public void add(T t) {
        ListNode<T> x = new ListNode<>(t);
        if(this.first==null)
        {
            first=x;
            last=x;
            x.setPrevious(null);
            x.setNext(null);
           
        }
        else{
            x.setPrevious(last);
            last.setNext(x);
            setLast(x);
            last.setNext(null);
           
        }

    }

    @Override
    public void add(int index,T t) {
        if(index < 0 || index > size())
            throw new IndexOutOfBoundsException("List index is out of bound");
        else if(index==0){
            ListNode<T> x = new ListNode<>(t);
            
         
            first.setPrevious(x);
           x.setNext(first);
            first=x;
           
            
        }
        else if(index==size()){
            add(t);
        }
        else
        {
            ListNode<T> x = new ListNode<>(t);
            int i=0;
            ListNode<T> temp=first;

            while (i < index -1) {
                temp=temp.getNext();
                i++;
            }
            ListNode<T> temp2=temp.getNext();
            temp.setNext(x);
            x.setPrevious(temp);
            x.setNext(temp2);
            temp2.setPrevious(x);


        }


    }

    @Override
    public String toString() {
        if(isEmpty())
            return "[]";
        else{
            String str= "[";
            ListNode<T> temp=first;
            while (temp.getNext()!=null) {
                str+=temp.getValue()+",";
                temp=temp.getNext();
            }
            str+=temp.getValue()+"";

            return str + ']';
        }
    }

    @Override
    public boolean isEmpty() {
        return (first==null && last==null);
    }

    @Override
    public int size() {
        ListNode<T> z = first;
        if(first==null)
            return 0;
      size=1;
        while(z.getNext()!=null)
            {
              
                size++;
                z=z.getNext();
            }
        
        return size;
    }

    @Override
    public void clear() {
        if(!isEmpty()){

            while(first.getNext()!=last)
            {
                first.setPrevious(null);
                first=first.getNext();
            }
            first=null;
            last=null;
            size=0;
        }
    }

    @Override
    public boolean contains(T t){
        if(!isEmpty()){
            ListNode<T> x = first;
            int i=0;
            while(i<size){
                if(x.getValue().equals(t)){
                    return true;
                }
                x=x.getNext();
                i++;
            }
            return false;
        }
        return false;

    }

    @Override
    public T get(int index) {
        if(!isEmpty()){
            if(index==0){
                return first.getValue();
            }
            else if(index<0 || index>size()){
                throw new IndexOutOfBoundsException("List index is out of bound");

            }
            else
            {
                int i=0;
                ListNode<T> temp=first;

                while (i < index ) {
                    temp=temp.getNext();
                    i++;
                }
                return temp.getValue();
            }
        }
        return null;
    }

    @Override
    public int indexOf(T t) {
        if(!isEmpty()){
            ListNode<T> x = first;
            int i=0;
            while(i<size()){
                if(x.getValue().equals(t)){
                    return i;
                }
                x=x.getNext();
                i++;
            }
            return -1;
        }
        else
            return -1;
    }

    @Override
    public void remove(T t) {
        if(!isEmpty()){
            ListNode<T> x = first;
            int i = indexOf(t);
            int j=0;
            if(i==-1)
                return;
            if(i==0){
                first=first.getNext();
                first.setPrevious(null);
            }
            else if(i==size()-1){
                ListNode<T> be=last.getPrevious();
                be.setNext(null);
                last.setPrevious(null);
                last=be;
            }
            else{
                while(j<i){
                    x=x.getNext();
                    j++;
                }
                ListNode<T> be=x.getPrevious();
                ListNode<T> af=x.getNext();
                be.setNext(af);
                af.setPrevious(be);
               
                return;
            }
          

        }
    }

    @Override
    public T remove(int index) {
        if(index<0 || index > size()-1)
            throw new IndexOutOfBoundsException("List index is out of bound");

        if(index==0){
            ListNode<T> be=first;
            first=first.getNext();
            first.setPrevious(last);
            
            return be.getValue();
        }
        else if(index==size()-1){
            ListNode<T> be=last.getPrevious();
            be.setNext(null);
            last=be;
          
            return be.getValue();

        }
        else{
            int i=0;
            ListNode<T> x = first;
            while(i<index){
                x=x.getNext();
                i++;
            }
            ListNode<T> be=x.getPrevious();
            ListNode<T> af=x.getNext();
            be.setNext(af);
            af.setPrevious(be);
           
            x.setNext(null);
            x.setPrevious(null);
            return x.getValue();
        }

    }
}