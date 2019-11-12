####Описание:
Разработать программу, которая работает в соответствии с требованиями ниже.

####Функциональные требования:
Разработать сервисный класс ArrayService, который не имеет состояния и реализует следующие функциональные методы:

**int[] create(int size)** - метод должен вернуть пустой массив размера size;
**void fillRandomly(int[] array)** - метод должен заполнить переданных массив array случайными числами в диапазоне от 0 до 100 включительно;
**void printArray(int[] array)** - метод должен распечатать переданный массив array в консоль (логику необходимо реализовать самостоятельно, не используя класс Arrays);
**int sum(int[] array)** - метод должен вернуть сумму всех элементов массива;
**double avg(int[] array)** - метод должен рассчитать среднее арифметическое всех элементов массива (в случае, если массив пустой, вернуть 0);

####Возможная реализация класса:
public class ArrayService {
  
  public int[] create(int size) {
    // TODOS
  }
  
  public void fillRandomly(int[] array) {
    // TODO  
  }
  
  public void printArray(int[] array) {
    // TODO
  }
  
  public int sum(int[] array) {
    // TODO 
  }
  
  public double avg(int[] array) {
    // TODO
  }
  
}

####Нефункциональные требования:
Продемонстрировать работу всех методов с учетом логический требований.

####Опционально:
Написать тестовые сценарии для класса ArrayService в классе ArrayServiceTest. Все тестовые сценарии должны отрабатывать без ошибок.

####Результат:
Загрузить файлы ArrayService.java, ArrayServiceDemo.java и ArrayServiceTest.java в одном архиве (*.zip, *.rar)

##Level 2: Sort, Swap
####Описание:
Разработать программу, которая работает в соответствии с требованиями ниже.

####Функциональные требования:
Доработать сервисный класс ArrayService, который реализует два дополнительных метода:

**void sort(int[] array)** - метод должен отсортированный переданный массив в возрастающем порядке;
**void swap(int[] array)** - метод должен переставить все элементы массива в обратном порядке без использования дополнительного массива;
Нефункциональные требования:
Продемонстрировать работу всех методов с учетом логический требований.

####Опционально:
Написать тестовые сценарии для класса ArrayService в классе ArrayServiceTest. Все тестовые сценарии должны отрабатывать без ошибок.

####Результат:
Загрузить файлы ArrayService.java, ArrayServiceDemo.java и ArrayServiceTest.java в одном архиве (*.zip, *.rar)

####Пример:
int[] a1 = {4, 7, 2, 3, 8, 9, 5, 1, 6}
int[] a2 = {1, 3, 8, 5, 4, 7, 9, 6, 2}
​
System.out.println(Arrays.toString(a1)); //[4, 7, 2, 3, 8, 9, 5, 1, 6]
System.out.println(Arrays.toString(a2)); //[1, 3, 8, 5, 4, 7, 9, 6, 2]
​
ArrayService svc = new ArrayService();
svc.sort(a1);
svc.swap(a2);
​
System.out.println(Arrays.toString(a1)); //[1, 2, 3, 4, 5, 6, 7, 8, 9]
System.out.println(Arrays.toString(a2)); //[2, 6, 9, 7, 4, 5, 8, 3, 1]