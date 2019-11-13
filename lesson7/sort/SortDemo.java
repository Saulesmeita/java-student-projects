package lv.javaguru.lesson7.sort;

public class SortDemo {
    public static void main(String[] args) {

        int[] arr12 = BubbleSort.create(12);
        BubbleSort.fillRandomly(arr12);
        BubbleSort.printArray(arr12);
        BubbleSort.bubbleSort(arr12);
        BubbleSort.printArray(arr12);
    }
}
