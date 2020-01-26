package lab4.animalRescue;

public class Animal {
    private String name;
    private float age;
    private int healthLevel;
    private int hungerLevel;
    private int mood;
    private String favouriteFood;
    private String favouriteActivity;

    public void setName(String name) {
        this.name = name; //doua variabile diferite care convietuiesc in aceeasi metoda
    }
    public String getName() {
        return name;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public float getAge() {
        return age;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public int getMood() {
        return mood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteActivity(String favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }

    public String getFavouriteActivity() {
        return favouriteActivity;
    }







}
