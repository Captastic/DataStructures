package capriotti.anthony;

/**
 * Created by anthonycapriotti on 2/24/17.
 */
public class LinkedList<T> {

    Link<T> first;
    Link<T> last;
    private int size = 0;


    public LinkedList(){}


    public void addFirstLink(T t){
        Link<T> link = new Link(t);

        if (size == 0){
            first = last = link;
        } else {
            link.next = first;
            first.previous = link;
            first = link;
        }
        size++;
    }

    public void addLastEntry(Link<T> t){
        if (size == 0)
            first = last = t;
        else {
            t.previous = last;
            last.next = t;
            last = t;
        }
        size++;
    }

    public boolean add(T t){
        addLastEntry(new Link<T>(t));
        return true;
    }

    public T get(int position){
        Link<T> link;
        if (position < size/2){
            link = first;
            while (position-- > 0)
                link = link.next;
        }
        else {
            link = last;
            while (++position < size)
                link = link.previous;
        }
        return link.names;
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void clear(){
        if (size > 0)
            first = null;
            last = null;
            size = 0;
    }

    public int size(){
        return size;
    }
    
    public boolean contains(T t){
        Link<T> link = first;
        while (link != null){
            if (t.equals(link.names))
                return true;
            link = link.next;
        }
        return false;
    }

    public LinkedList<T> copy(){
        LinkedList<T> copiedList = new LinkedList<T>();
        copiedList.first = null;
        for (Link<T> link = first; link != null; link = link.next)
            copiedList.add(link.names);
        return copiedList;
    }

/*
    void remove(int index){
        Link<T> temp = first;
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        if (temp.next.next == null)
            temp.next = null;

        temp.next = temp.next.next;
            size--;
    }
*/
/*    void remove(Link<T> t){
        size--;
        if (size == 0) {
            first = last = null;

        } else if (t == first){
                first = t.next;
                t.next.previous = null;

            } else if (t == last){
                last = t.previous;
                t.previous.next = null;

            } else {
                t.next.previous = t.previous;
                t.previous.next = t.next;
            }
    }
*/





    public void sort(){}
    public void slice(){}







}





