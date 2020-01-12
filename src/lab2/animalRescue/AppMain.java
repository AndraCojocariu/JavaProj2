package lab2.animalRescue;

public class AppMain {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.name = "Rex";
        System.out.println(animal1.name);
        animal1.age = 2.5f;
        System.out.println(animal1.age);
        animal1.healthLevel = 8;
        System.out.println(animal1.healthLevel);
        animal1.hungerLevel = 5;
        System.out.println(animal1.hungerLevel);
        animal1.mood = 10;
        System.out.println(animal1.mood);
        animal1.favouriteFood = "lamb";
        System.out.println(animal1.favouriteFood);
        animal1.favouriteActivity = "sleeping";
        System.out.println(animal1.favouriteActivity);

        Animal animal2 = new Animal();
        animal2.name = "Kitty";
        System.out.println(animal2.name);
        animal2.age = 1.2f;
        System.out.println(animal2.age);
        animal2.healthLevel = 7;
        System.out.println(animal2.healthLevel);
        animal2.hungerLevel = 2;
        System.out.println(animal2.hungerLevel);
        animal2.mood = 4;
        System.out.println(animal2.mood);
        animal2.favouriteFood = "fish";
        System.out.println(animal2.favouriteFood);
        animal2.favouriteActivity = "playing";
        System.out.println(animal2.favouriteActivity);

        Rescuer firstRescuer = new Rescuer();
        firstRescuer.name = "Anna";
        firstRescuer.moneyAmount = 123.5f;
        System.out.println(firstRescuer.name);
        System.out.println(firstRescuer.moneyAmount);

        Food firstfood = new Food();
        firstfood.name = "fish";
        firstfood.price = 16.44f;
        firstfood.quantity = 20;
        firstfood.inStock = true;
        System.out.println(firstfood.name);
        System.out.println(firstfood.price);
        System.out.println(firstfood.quantity);
        System.out.println(firstfood.inStock);

        Activity firstactivity = new Activity();
        firstactivity.name = "running";
        System.out.println(firstactivity.name);

        MedicalStaff typeofstaff = new MedicalStaff();
        typeofstaff.name = "Mike";
        typeofstaff.staffType = "vet";
        System.out.println(typeofstaff.name);
        System.out.println(typeofstaff.staffType);
    }

}
