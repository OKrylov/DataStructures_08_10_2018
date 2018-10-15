public class PriorityQueue implements Queue {

    private int[] data;
    private int size;

    public PriorityQueue(int maxSize) {
        this.data = new int[maxSize];
        this.size = 0;
    }

    public int remove() {
        return data[--size];
    }

    public int peek() {
        return data[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void display() {
        //TODO: implement me
    }

    public void insert(int value) {
        int index = 0;
        if (isEmpty()) {
            data[size++] = value;
        }
        else {
            for (index = size - 1; index >= 0; index--) {
                if (value > data[index]) {
                    data[index + 1] = data[index];
                }
                else {
                    break;
                }
            }
            data[index + 1] = value;
            size++;
        }
    }
}
