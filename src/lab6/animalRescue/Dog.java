package lab6.animalRescue;

public class Dog extends Animal{

    private String owner;
    public String speak(){
        return "The dog barks";
    }

    public int sleepingHours(){
        return 12;
    }
    public void presentActivity(){
        System.out.println("The dog is playing fetch");
    }


    public void setOwner(String owner){
        this.owner = owner;
    }

    public String getOwner(){
        return owner;
    }
}
