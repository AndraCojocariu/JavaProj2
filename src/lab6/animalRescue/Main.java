package lab6.animalRescue;

public class Main {

    public static void main(String[] args) {
        Dog bruno = new Dog();
        System.out.println(bruno.speak());
        bruno.presentActivity();
        System.out.println(bruno.sleepingHours());
        bruno.setName("Bruno");
        System.out.println(bruno.getName());

        Cat meow = new Cat();
        System.out.println(meow.speak());
        meow.presentActivity();
        System.out.println(meow.sleepingHours());
        meow.setAge(3);
        System.out.println(meow.getAge());


        }



}
