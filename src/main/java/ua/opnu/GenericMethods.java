package ua.opnu;
import java.util.Arrays;
import java.util.function.Predicate;
public class GenericMethods {
    @SuppressWarnings("unchecked")
    public static <T> T[] filter(T[] input, Predicate<T> predicate) {
        T[] result = (T[]) new Object[input.length];
        int counter = 0;
        for (T element : input) {
            if (predicate.test(element)) {
                result[counter] = element;
                counter++;
            }
        }
        return (T[]) Arrays.copyOfRange(result, 0, counter);
    }
    public static <T extends Comparable<T>, V extends T>
    boolean contains(T[] array, V element) {
        for (T value : array) {
            if (value.compareTo(element) == 0) {
                return true;
            }
        }
        return false;
    }
}