package lab3.animalRescue;

public class AppMain {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.setName("Rex");
        System.out.println(animal1.getName());
        animal1.setAge(2.5f);
        System.out.println(animal1.getAge());
        animal1.setHealthLevel(8);
        System.out.println(animal1.getHealthLevel());
        animal1.setHungerLevel(5);
        System.out.println(animal1.getHungerLevel());
        animal1.setMood(10);
        System.out.println(animal1.getMood());
        animal1.setFavouriteFood("lamb");
        System.out.println(animal1.getFavouriteFood());
        animal1.setFavouriteActivity("sleeping");
        System.out.println(animal1.getFavouriteActivity());

        Animal animal2 = new Animal();
        animal2.setName("Kitty");
        System.out.println(animal2.getName());
        animal2.setAge(1.2f);
        System.out.println(animal2.getAge());
        animal2.setHealthLevel(7);
        System.out.println(animal2.getHealthLevel());
        animal2.setHungerLevel(2);
        System.out.println(animal2.getHungerLevel());
        animal2.setMood(4);
        System.out.println(animal2.getMood());
        animal2.setFavouriteFood("fish");
        System.out.println(animal2.getFavouriteFood());
        animal2.setFavouriteActivity("playing");
        System.out.println(animal2.getFavouriteActivity());

        Rescuer firstRescuer = new Rescuer();
        firstRescuer.setName("Anna");
        firstRescuer.setMoneyAmount(123.5f);
        System.out.println(firstRescuer.getName());
        System.out.println(firstRescuer.getMoneyAmount());

        Food firstfood = new Food();
        firstfood.setName("fish");
        firstfood.setPrice(16.44f);
        firstfood.setQuantity(20);
        firstfood.setInStock(true);
        System.out.println(firstfood.getName());
        System.out.println(firstfood.getPrice());
        System.out.println(firstfood.getQuantity());
        System.out.println(firstfood.getInStock());

        Activity firstactivity = new Activity();
        firstactivity.setName("running");
        System.out.println(firstactivity.getName());

        MedicalStaff typeofstaff = new MedicalStaff();
        typeofstaff.setName("Mike");
        typeofstaff.setStaffType("vet");
        System.out.println(typeofstaff.getName());
        System.out.println(typeofstaff.getStaffType());
    }

}
