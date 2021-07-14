package COM.FELIX;

public class Legs extends  Organ{
    private boolean footDesease;
    private String legchacked;

    public Legs(String name, String medicalcondition, boolean footDesease, String legchacked) {
        super(name, medicalcondition);
        this.footDesease = footDesease;
        this.legchacked = legchacked;
    }

    @Override
    public void getdetails(String name) {
        super.getdetails(getName()+"\t\t size relate to shoe siz");

    }

    public boolean isFootDesease() {
        return footDesease;
    }

    public void setFootDesease(boolean footDesease) {
        this.footDesease = footDesease;
    }

    public String getLegchacked() {
        return legchacked;
    }

    public void setLegchacked(String legchacked) {
        this.legchacked = legchacked;
    }
}
