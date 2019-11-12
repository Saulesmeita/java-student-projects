package lv.javaguru.lesson7.lookuparrayservice;

public class LookupArrayServiceDemo {
    public static void main(String[] args) {

        int[] arr0 = new int[5];
        int[] arr00 = new int[0];
        int[] arr1 = LookupArrayService.createArray(9, 10);

        System.out.println();
        System.out.println("Распечатаем все три массива:");
        System.out.println();

        LookupArrayService.printArr(arr0);
        LookupArrayService.printArr(arr00);
        LookupArrayService.printArr(arr1);

        System.out.println();
        System.out.println("Поищем в третьем массиве все числа от 0 до 10:");
        System.out.println();

        for (int i = 0; i < 11; i++) {
            LookupArrayService.printIndexOf(arr1, i);
        }
        System.out.println();
        System.out.println("Ищем максимумы во всех трёх массивах:");
        System.out.println();

        LookupArrayService.printMax(arr0);
        LookupArrayService.printMax(arr00);
        LookupArrayService.printMax(arr1);

        System.out.println();
        System.out.println("Ищем минимумы во всех трёх массивах:");
        System.out.println();

        LookupArrayService.printMin(arr0);
        LookupArrayService.printMin(arr00);
        LookupArrayService.printMin(arr1);
    }
}
