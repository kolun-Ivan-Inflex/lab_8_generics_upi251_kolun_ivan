package ua.opnu;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        MyOptional<String> middleName = new MyOptional<>();
        System.out.println("1: " + middleName);
        System.out.println("isPresent: " + middleName.isPresent());
        System.out.println("orElse: " + middleName.orElse("немає"));
        MyOptional<String> username = new MyOptional<>("admin");
        System.out.println(username);
        System.out.println("get: " + username.get());
        System.out.println("orElse: " + username.orElse("guest"));
        try {
            middleName.get();
        } catch (IllegalStateException ex) {
            System.out.println("Expected exception: " + ex.getMessage());
        }
        try {
            new MyOptional<String>(null);
        } catch (IllegalArgumentException ex) {
            System.out.println("Null exception: " + ex.getMessage());
        }
        BookData book1 = new BookData("Java", "Author 1", 10, 45);
        BookData book2 = new BookData("Python", "Author 2", 10, 40);
        BookData book3 = new BookData("C++", "Author 3", 10, 50);
        List<BookData> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Collections.sort(books);

        System.out.println("2: " + books);

        Printer printer = new Printer();

        Integer[] numbers = {1, 2, 3};
        String[] words = {"Hello", "World"};

        System.out.println("3: ");
        printer.printArray(numbers);
        printer.printArray(words);

        Integer[] values = {1, 2, 3, 4, 5, 6};

        Object[] filtered = GenericMethods.<Integer>filter(
                values, n -> n % 2 == 0
        );

        System.out.println("4: " + Arrays.toString(filtered));

        String[] fruits = {"apple", "banana", "orange"};

        System.out.println("5: " +
                GenericMethods.contains(fruits, "banana"));

        System.out.println("5: " +
                GenericMethods.contains(fruits, "grape"));

        GenericTwoTuple<String, Integer> tuple =
                new GenericTwoTuple<>("Ivan", 95);

        System.out.println("6: " + tuple);

        GenericThreeTuple<String, Integer, String> threeTuple =
                new GenericThreeTuple<>("Ivan", 95, "Java");

        System.out.println("6: " + threeTuple);
    }
}
