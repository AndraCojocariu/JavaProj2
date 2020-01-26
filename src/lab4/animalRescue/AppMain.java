package lab4.animalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.setName("Rex");
        System.out.println(rex.getName());
        rex.setHealthLevel(8);
        System.out.println(rex.getHealthLevel());

        Cat minnie = new Cat();
        minnie.setAge(2.2f);
        System.out.println(minnie.getAge());
        minnie.Activity2();


        Boy goodboy = new Boy();
        goodboy.Activity5();
        goodboy.setName("Johnny");
        System.out.println(goodboy.getName());


        DogFood foodie = new DogFood();
        foodie.setGood(true);
        foodie.setPrice(274.5f);
        System.out.println(foodie.getPrice());

        DogActivity mannie = new DogActivity();
        mannie.Activity5();
        mannie.setName("To play fetch");
        System.out.println(mannie.getName());

        Caregiver matt = new Caregiver();
        matt.setName("Matt");
        System.out.println(matt.getName());
        matt.setStaffType("caretaker");
        System.out.println(matt.getStaffType());
        matt.Activity3();


        Doctor jackie = new Doctor();
        jackie.setName("Jackie");
        System.out.println(jackie.getName());
        jackie.Activity4();

    }

}
