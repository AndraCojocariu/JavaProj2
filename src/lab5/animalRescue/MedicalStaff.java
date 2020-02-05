package lab5.animalRescue;

public class MedicalStaff {
    private String name;
    private String staffType;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setStaffType(String staffType) {
        this.staffType = staffType;
    }

    public String getStaffType() {
        return staffType;
    }

    public void staffActivity (){
        System.out.println("Is prescribing a treatment for the animal's disease");
    }


}
