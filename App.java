package hello.zoo.com;
//sV 26Sep2024
//App.java
//Driver file for the zoo midterm program

public class App {
    public static void main(String[] args) {

        System.out.println("\nWelcome to my zoo program!");

        hello.zoo.com.Animal myAnimal = new hello.zoo.com.Animal();
        myAnimal.setAnimalName("My first animal");
        System.out.println("\n The name of the new animal is: " + myAnimal.getAnimalName());

        hello.zoo.com.Animal anotherAnimal = new hello.zoo.com.Animal("Zig");
        System.out.println("\nThe name of the second animal is: " + anotherAnimal.getAnimalName());

        System.out.println("\nThe number of animals is: " + hello.zoo.com.Animal.numOfAnimals);

        // Create a hyena with a name
        hello.zoo.com.Hyena aNewHyena = new hello.zoo.com.Hyena("Kamari");

        System.out.println("\nThe new hyena's name is: " + aNewHyena.getAnimalName());
        System.out.println("\nThe number of animals is: " + hello.zoo.com.Animal.numOfAnimals);



    }
}