public class Anagramm {

    public static void main(String[] args) {
        String word = "year";
        Anagramm anagramm = new Anagramm(word);
        anagramm.getAnagramm();
    }

    private char[] text;
    private final int count;
    private final int size;

    public Anagramm(String text) {
        this.text = text.toCharArray();
        size = text.length();
        count = 0;
    }

    public void getAnagramm() {
        getAnagramm(size);
    }

    private void getAnagramm(int newSize) {
        if (newSize == 1) {
            return;
        }

        for (int i = 0; i < newSize; i++) {
            getAnagramm(newSize - 1);

            if (newSize == 2) {
                display();
            }

            rotate(newSize);
        }
    }

    private void rotate(int newSize) {
        int pos = size - newSize;
        char temp = text[pos];
        for (int i = pos + 1; i < size; i++) {
            text[i - 1] = text[i];
        }

        text[size - 1] = temp;
    }

    private void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(text[i]);
        }
        System.out.println("");
    }
}
