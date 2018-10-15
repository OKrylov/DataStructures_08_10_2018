import java.util.Arrays;

public class ArrayImpl implements Array {

    protected int[] data;
    protected int size;

    public ArrayImpl(int maxSize) {
        this.data = new int[maxSize];
        this.size = 0;
    }

    protected ArrayImpl(int[] data, int size) {
        this.data = data;
        this.size = size;
    }

    @Override
    public boolean add(int value) {
        if (isFull())
            return false;

        data[size++] = value;
        return true;
    }

    protected boolean isFull() {
        return data.length == size;
    }


    @Override
    public boolean remove(int value) {
        int index = indexOf(value);
        return removeByIndex(index);
    }

    @Override
    public boolean removeByIndex(int index) {
        if (index < 0 || index >= size)
            return false;

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        size--;
        return true;
    }

    @Override
    public void display() {
        System.out.println(this);
//        System.out.println(toString());
    }

    @Override
    public int get(int index) {
        return data[index];
    }

    @Override
    public boolean find(int value) {
        return indexOf(value) != -1;
//        return indexOf(value) != -1 ? true : false;

//        int result = indexOf(value);
//        if (result != -1) {
//            return true;
//        } else {
//            return false;
//        }
    }

    /**
     * O(n)
     *
     * @param value
     * @return
     */
    protected int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return i;
            }
        }

        return -1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Array copy() {
        return new ArrayImpl(Arrays.copyOf(data, data.length), size);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int[] getData() {
        return data;
    }
}
