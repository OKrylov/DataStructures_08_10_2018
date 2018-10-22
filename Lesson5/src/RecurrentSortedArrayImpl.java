public class RecurrentSortedArrayImpl extends SortedArrayImpl {

    public RecurrentSortedArrayImpl(int maxSize) {
        super(maxSize);
    }

    @Override
    protected int indexOf(int value) {
        return super.indexOf(value);
    }

    private int indexOf(int value, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        if (data[mid] == value) {
            return mid;
        }

        if (value < data[mid]) {
            return indexOf(value, low, mid - 1);
        }
        else {
           return indexOf(value, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        Array array = new RecurrentSortedArrayImpl(5);
        array.display();
        System.out.println(array.add(3));
        System.out.println(array.add(2));
        System.out.println(array.add(4));
        array.display();
        System.out.println(array.add(5));
        System.out.println(array.add(1));
        System.out.println(array.add(6));

        array.display();



        System.out.println("Find 3: " + array.find(3));
        System.out.println("Find 81: " + array.find(81));
    }


}
