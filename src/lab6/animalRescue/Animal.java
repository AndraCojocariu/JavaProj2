package lab6.animalRescue;

public abstract class Animal implements ExampleofAnInterface{
     private String breed;
     private String name;
     private int weight;
     private int age;

     public abstract String speak();
     public abstract int sleepingHours();
     public abstract void presentActivity();
     public void eats(){
         System.out.println("Eating well");
     }

     public void setBreed(String breed){
         this.breed = breed;
     }

    public String getBreed() {
        return breed;
    }

    public void setName(String name){
         this.name = name;
    }

    public String getName(){
         return name;
    }

    public void setWeight(int weight){
         this.weight = weight;
    }

    public int getWeight(){
         return weight;
    }

    public void setAge(int age){
         this.age = age;
    }

    public int getAge() {
        return age;
    }




}
