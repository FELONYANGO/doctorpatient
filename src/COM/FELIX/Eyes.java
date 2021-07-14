package COM.FELIX;

public class Eyes extends Organ{
    private String  doctchecked;
    private String colour;

    public Eyes(String name, String medicalcondition, String doctchecked, String colour) {
        super(name, medicalcondition);
        this.doctchecked = doctchecked;
        this.colour = colour;
    }

    @Override
    public void getdetails(String name) {
        super.getdetails(getName()+"\t\tOur optometrist is the best,eye well checked");
    }

    public String getDoctchecked() {
        return doctchecked;
    }

    public void setDoctchecked(String doctchecked) {
        this.doctchecked = doctchecked;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
