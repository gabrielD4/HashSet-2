import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        int numberToCheck = 9;
        HashSet<Integer> myOddNumbers = getIntegerHashSet(10);
        checkNumberInList(myOddNumbers, numberToCheck);
    }

    public static HashSet<Integer> getIntegerHashSet(int maxSize) {
        HashSet<Integer> oddNumbers = new HashSet<>();
        for (int i = 0; i < maxSize; i++) {
            int j = i + 2;
            oddNumbers.add(i + j);
        }
        return oddNumbers;
    }

    public static void checkNumberInList(HashSet<Integer> listOfNumbers, int number) {
        Iterator<Integer> iterator = listOfNumbers.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element == number) {
                System.out.println("Inside list: " + listOfNumbers + "\nthere is the number: " + number);
            }
        }
        System.out.println("Inside list: " + listOfNumbers + "\nthere is no number: " + number);
    }
}