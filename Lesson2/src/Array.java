public interface Array {

    boolean add(int value);

    boolean remove(int value);
    boolean removeByIndex(int index);

    void display();

    int get(int index);

    boolean find(int value);

    boolean isEmpty();

    int getSize();
}
