public class SortedArrayImpl extends ArrayImpl {

    public SortedArrayImpl(int maxSize) {
        super(maxSize);
    }

    @Override
    public boolean add(int value) {
        if (isEmpty()) {
            return super.add(value);
        }

        if (isFull()) {
            return false;
        }

        int index = size;

        for (int i = 0; i < size; i++) {
            if (data[i] > value) {
                index = i;
                break;
            }
        }

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = value;
        size++;
        return true;
    }

    /**
     * O(logN)
     * @param value
     * @return
     */
    @Override
    protected int indexOf(int value) {
        int low = 0;
        int high = size - 1;

        int mid;

        while (low < high) {
            mid = (low + high) / 2;
            if (value == data[mid]) {
                return mid;
            }
            else {
                if (value < data[mid]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
        }

        return -1;
    }
}
