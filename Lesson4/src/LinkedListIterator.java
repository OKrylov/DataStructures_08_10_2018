import java.util.Iterator;

public class LinkedListIterator implements ListIterator {

    private LinkedList list;
    private boolean firstIterate = true;

    private Link current;
    private Link previous;

    public LinkedListIterator(LinkedList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if (firstIterate) {
            firstIterate = false;
            return list.getFirstElement() != null;
        }
        else {
            return current.getNext() != null;
        }
    }

    @Override
    public Integer next() {
        if (current == null) {
            current = list.getFirstElement();
        }
        else {
            previous = current;
            current = current.getNext();
        }
        return current.getData();
    }

    @Override
    public void remove() {
        if (previous == null){
            list.setFirstElement(current.getNext());
            reset();
        } else {
            previous.setNext(current.getNext());
            if ( !hasNext() ) {
                reset();
            } else {
                current = current.getNext();
            }
        }
    }

    @Override
    public void reset() {
        firstIterate = false;
        current = list.getFirstElement();
        previous = null;
    }

    @Override
    public void insertBefore(int value) {
        Link newItem = new Link(value);
        if(previous == null) {
            newItem.setNext(list.getFirstElement());
            list.setFirstElement(newItem);
            reset();
        }
        else {
            newItem.setNext(previous.getNext());
            previous.setNext(newItem);
            current = newItem;
        }

    }

    @Override
    public void insertAfter(int value) {
        Link newItem = new Link(value);
        if (list.isEmpty()){
            list.setFirstElement(newItem);
            current = newItem;
        } else {
            newItem.setNext(current.getNext());
            current.setNext(newItem);
            next();
        }
    }

}