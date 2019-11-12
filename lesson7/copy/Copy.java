package lv.javaguru.lesson7.copy;

public class Copy {

    public int[] copyInRange(int[] in, int leftBound, int rightBound) {
        int length = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= leftBound && in[i] <= rightBound) {
                length++;
            }
        }
        int[] selected = new int[length];
        for (int i = 0, j = 0; i < in.length; i++) {
            if (in[i] >= leftBound && in[i] <= rightBound) {
                selected[j] = in[i];
                j++;
            }
        }
        return selected;
    }
}
