package COM.FELIX;

public class Heart extends Organ{
    private int pulserate;
    private String heartCondition;

    public Heart(String name, String medicalcondition, int pulserate, String heartCondition) {
        super(name, medicalcondition);
        this.pulserate = pulserate;
        this.heartCondition = heartCondition;
    }

    @Override
    public void getdetails(String name) {
        this.getName();
        super.getdetails(getName()+"\t\tthe heart is checked  by a specialist");

    }

    public int getPulserate() {
        return pulserate;
    }

    public void setPulserate(int pulserate) {
        this.pulserate = pulserate;
    }

    public String getHeartCondition() {
        return heartCondition;
    }

    public void setHeartCondition(String heartCondition) {
        this.heartCondition = heartCondition;
    }
}
