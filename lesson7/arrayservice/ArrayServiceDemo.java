package lv.javaguru.lesson7.arrayservice;

public class ArrayServiceDemo {

    public static void main(String[] args) {

        int[] arr10 = ArrayService.create(10);

        ArrayService.printArrayWithProperties(arr10);
        ArrayService.fillRandomly(arr10);
        ArrayService.printArrayWithProperties(arr10);
        ArrayService.swap(arr10);
        ArrayService.printArrayWithProperties(arr10);
        ArrayService.swapElements(arr10, 4, 8);
        ArrayService.printArray(arr10);
        ArrayService.sort(arr10);
        ArrayService.printArray(arr10);

        int[] arr20 = ArrayService.create(20);
        ArrayService.fillRandomly(arr20);
        ArrayService.printArray(arr20);
        ArrayService.bubbleSort(arr20);
        ArrayService.printArray(arr20);

        int[] arr0 = ArrayService.create(0);

        System.out.println();
        ArrayService.printArrayWithProperties(arr0);
        ArrayService.fillRandomly(arr0);
    }
}
