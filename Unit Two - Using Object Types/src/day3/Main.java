package day3;

public class Main {
    public static void main(String[] args){
        Dog myDog = new Dog("Rocky","Labrador",5);
        myDog.bark(3);

        Owner owner1 = new Owner("Emily", myDog);
        owner1.walkDog(20);
        owner1.feedDog("Chicken");
        owner1.printDogAge();

        Dog secondDog = new Dog("Luna","Poodle",7);
        secondDog.bark(3);

        Owner owner2 = new Owner("David", secondDog);
        owner2.feedDog("Beef");
        owner2.printDogAge();

        myDog.sleep(6);
        secondDog.sleep(7);
    }
}