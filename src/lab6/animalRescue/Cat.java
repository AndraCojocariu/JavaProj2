package lab6.animalRescue;

public class Cat extends Animal {

    private String furColor;

    public String speak() {
        return "The cat meows";
    }

    public int sleepingHours(){
        return 14;
    }

    public void presentActivity(){
        System.out.println("The cat is playing with a clew of threads");
    }
}
