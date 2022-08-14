package file;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ReadFromFile {
    private static final String SEPARATOR = File.separator;
    private static File FILE;

    public static void main(String[] args) throws FileNotFoundException {
//        readAllFileScanner();
//        readNumbers();
//        readObject();
//        readArray();
        Person[] people = (Person[]) readWholeArray();
        System.out.println(Arrays.toString(people));
    }

    private static Object[] readWholeArray() {
        try (FileInputStream fis = new FileInputStream("people.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

        return (Object[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readArray() {
        try (FileInputStream fis = new FileInputStream("people.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            int size = ois.readInt();

            Person[] array = new Person[size];
            for (int i = 0; i < size; i++) {
                array[i] = (Person) ois.readObject();
            }

            System.out.println(Arrays.toString(array));
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readObject() {
        try (FileInputStream fis = new FileInputStream("people.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();

            System.out.println(person1);
            System.out.println(person2);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readNumbers() throws FileNotFoundException {
        FILE = new File("test2");

        Scanner scanner = new Scanner(FILE);
        String line = scanner.nextLine();
        String[] numbersStr = line.split(" ");
        int[] numbers = new int[numbersStr.length];

        System.out.println(Arrays.toString(numbersStr));
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }

        System.out.println(Arrays.toString(numbers));

        scanner.close();
    }

    private static void readAllFileScanner() throws FileNotFoundException {
        String fileName = "C:" + SEPARATOR + "Users" + SEPARATOR + "User" + SEPARATOR + "Downloads" + SEPARATOR + "readMe.txt";

        FILE = new File(fileName);

        Scanner scanner = new Scanner(FILE);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            System.out.println(input);
        }

        scanner.close();
    }
}
