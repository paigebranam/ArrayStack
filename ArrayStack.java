import java.lang.reflect.Array;

public class ArrayStack {
    private int[] array;
    private int count;

    public ArrayStack() {
        array = new int[4];
        count = 0;
    }

    // Queue = add method. (Add to back of the line)
    public void push(int value) {
        if (count == array.length) {
            expandArray();
        }

        array[count] = value;
        count++;
    }

    private void expandArray() {
        int[] mainArray = new int[count * 2];
        for (int i = 0; i < count; i++) {
            mainArray[i] = array[i];
        }
        array = mainArray;
    }

    // Dequeue = remove method. (remove from the front of the line)

    public int pop() {
        checkEmpty();
        // variable to store int at front of array
        int popNum = array[count];
        count--;

        return popNum;

    }

    // peek
    public int peek() {
        checkEmpty();

        return array[count];
    }

    private void checkEmpty() {
        if (count == 0) {
            throw new IllegalStateException();
        }
    }

}
