package COM.FELIX;

public class Skin extends Organ {
    private String state;
    private  String smoothness;

    public Skin(String name, String medicalCondition, String state, String smoothness) {
        super(name, medicalCondition);
        this.state = state;
        this.smoothness = smoothness;
    }

    @Override
    public void getdetails(String name) {
        this.getName();
        super.getdetails(getName()+"\t\tblack is the colour");

    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getSmoothness() {
        return smoothness;
    }

    public void setSmoothness(String smoothness) {
        this.smoothness = smoothness;
    }
}
