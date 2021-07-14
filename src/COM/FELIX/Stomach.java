package COM.FELIX;

public class Stomach extends Organ{
    private String condition;

    public Stomach(String name, String medicalCondition, String condition) {
        super(name, medicalCondition);
        this.condition = condition;
    }
    public  void isfull(){
        System.out.println("the stomach was well fed before the visit");
    }

    @Override
    public void getdetails(String name) {
        super.getdetails(this.getName()+"\t\tcondition checked visit the reffered by the doctor");

    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
