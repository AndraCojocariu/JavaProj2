package lab5.animalRescue;

public class AppMain {
    public static void main(String[] args) {
        Dog rex = new Dog();

        //override check
        rex.activity1();
        //
        rex.setName("Rex");
        System.out.println(rex.getName());
        rex.setHealthLevel(8);
        System.out.println(rex.getHealthLevel());

        Cat minnie = new Cat();
        minnie.setAge(2.2f);
        System.out.println(minnie.getAge());
        minnie.Activity2();

        //override check
        Cat monnie = new Cat();
        monnie.activity1();
        //


        Boy goodboy = new Boy();

        //override check
        goodboy.somethingSpecific();
        //

        goodboy.Activity5();
        goodboy.setName("Johnny");
        System.out.println(goodboy.getName());


        DogFood foodie = new DogFood();

        //override check
        foodie.foodMethod();
        //
        foodie.setGood(true);
        foodie.setPrice(274.5f);
        System.out.println(foodie.getPrice());

        DogActivity mannie = new DogActivity();

        //override check
        mannie.yetAnotherActivity();
        //
        mannie.Activity5();
        mannie.setName("To play fetch");
        System.out.println(mannie.getName());

        Caregiver matt = new Caregiver();

        //override check
        matt.staffActivity();
        //
        matt.setName("Matt");
        System.out.println(matt.getName());
        matt.setStaffType("caretaker");
        System.out.println(matt.getStaffType());
        matt.Activity3();


        Doctor jackie = new Doctor();
        //override check
        jackie.staffActivity();
        //

        jackie.setName("Jackie");
        System.out.println(jackie.getName());
        jackie.Activity4();

    }

}
