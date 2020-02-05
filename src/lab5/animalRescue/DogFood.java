package lab5.animalRescue;

public class DogFood extends Food {
    private boolean isGood;

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }
    public void foodMethod(){
        System.out.println("The food for dogs is in the car");
    }
}
