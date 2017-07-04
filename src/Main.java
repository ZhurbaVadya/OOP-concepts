public class Main{

    public static void main(String[] args) {

        Cat cat = new Cat("Masha", "male", 12, "None");
        System.out.println("Cat added:");
        System.out.println("name:" + cat.getName());
        System.out.println("species:" + cat.getSpecies());
        System.out.println("is Female:" + cat.isFemale());
        System.out.println("Cat says:");
        cat.sound();
        System.out.println("Feed the cat with fish:");
        cat.feed("fish");

    }
}