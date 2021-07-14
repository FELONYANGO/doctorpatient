package COM.FELIX;

public class Organ {
    private  String name;
    private  String medicalCondition;

    public  Organ(String name,String medicalcondition){
        this.medicalCondition=medicalcondition;
        this.name=name;


    }
    public void getdetails(String name){
        this.name=name;
        System.out.println(this.getName()+"\t\tis approved by our doctors");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalcondition) {
        this.medicalCondition = medicalcondition;
    }
}
