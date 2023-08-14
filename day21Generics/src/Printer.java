public class Printer<T> {
    public void printArray(T[] intArray) {
        for (int index = 0; index < intArray.length; index++) {
            System.out.println(intArray[index]);
        }
    }
}
