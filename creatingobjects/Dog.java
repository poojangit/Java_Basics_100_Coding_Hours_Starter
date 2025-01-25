package creatingobjects;

public class Dog {
    public static void main(String[] args) {
        // Dog pets = new Dog();
        // System.out.println(pets);
        
        Dog[] pets;
        pets = new Dog[7];
        System.out.println(pets);
        pets[0] = new Dog();
        pets[1] = new Dog();
        System.out.println("Hello");
        System.out.println("pet 0 : " +pets[0]);
        System.out.println("pet 1 : " +pets[1]);
        // System.out.println(pets[2]);
        pets[3] = pets[1];
        System.out.println("pet 3 : " +pets[3]);
    }
}
