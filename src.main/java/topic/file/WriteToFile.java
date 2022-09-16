package topic.file;

import java.io.*;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        //writeTest();
        //objectWriter();

        Person[] people = {new Person(1, "Nikita"),
                new Person(2, "Kirill"),
                new Person(3, "Maxim")};
        //arrayWriter(people);
        arrayWholeWriter(people);
    }

    private static void arrayWholeWriter(Person[] people) {
        try (FileOutputStream fos = new FileOutputStream("people.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(people);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void arrayWriter(Object[] array) {
        try (FileOutputStream fos = new FileOutputStream("people.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeInt(array.length);

            for (Object object : array) {
                oos.writeObject(object);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void objectWriter() {
        try (FileOutputStream fos = new FileOutputStream("people.bin");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            Person person1 = new Person(1, "Kolya");
            Person person2 = new Person(9, "Masha");

            oos.writeObject(person1);
            oos.writeObject(person2);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void writeTest() throws FileNotFoundException {
        File file = new File("test");
        PrintWriter printWriter = new PrintWriter(file);

        printWriter.println("Test row 1");
        printWriter.println("Test row 2");

        printWriter.close();
    }
}
