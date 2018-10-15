public interface Queue {

    void insert(int value);//Add right
    int remove();//Remove left

    boolean isEmpty();
    boolean isFull();

    int getSize();

    void display();
}
