package topic.enumTest;

public class EnumTest {

    public static void main(String[] args) {
        Season season =Season.SPRING;
        System.out.println(season.name());
        System.out.println(season.ordinal());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());


        Animal animal = Animal.CAT;
        System.out.println(animal);
        switchAnimal(animal);

        switchSeason(season);
    }

    private static void switchSeason(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("It`s cloudy");
                break;
            case WINTER:
                System.out.println("It`s freezing");
                break;
            case SUMMER:
                System.out.println("It`s warm");
                break;
            case AUTUMN:
                System.out.println("It's chilly ");
                break;
            default:
                System.out.println("Wrong season");
        }
    }

    private static void switchAnimal(Animal animal) {
        switch (animal) {
            case CAT:
                System.out.println("It`s a cat");
                break;
            case DOG:
                System.out.println("It`s a dog");
                break;
            case FROG:
                System.out.println("It`s a frog");
                break;
            default:
                System.out.println("Wrong animal");
        }
    }
}
