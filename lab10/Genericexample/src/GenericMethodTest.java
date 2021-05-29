public class GenericMethodTest {
    public <T> void printArray(T[] inputArray){
        for (T element : inputArray) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args){
        Integer[] intArray = {1,2,3,4,5,6,7,8};
        Double[] doubleArray = {1.1,1.2,1.3,1.4,1.5};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        GenericMethodTest gTest = new GenericMethodTest();
        gTest.printArray(intArray);
        System.out.println();
        gTest.printArray(doubleArray);
        System.out.println();
        gTest.printArray(charArray);
    }
}
