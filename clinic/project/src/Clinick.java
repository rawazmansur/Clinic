import java.util.ArrayList;

public class Clinick {

    String name;
    ClinickType clinickType;
    ModirClinick modirClinick;
    ArrayList<Bakhsh>bakhshes = new ArrayList<>();


    public Clinick(String name, ClinickType clinickType) {
        this.name = name;
        this.clinickType = clinickType;
    }

    public Clinick(String name, ClinickType clinickType, ModirClinick modirClinick,
                   ArrayList<Bakhsh> bakhshes) {
        this.name = name;
        this.clinickType = clinickType;
        this.modirClinick = modirClinick;
        this.bakhshes = bakhshes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClinickType getClinickType() {
        return clinickType;
    }

    public void setClinickType(ClinickType clinickType) {
        this.clinickType = clinickType;
    }

    public ModirClinick getModirClinick() {
        return modirClinick;
    }

    public void setModirClinick(ModirClinick modirClinick) {
        this.modirClinick = modirClinick;
    }

    public ArrayList<Bakhsh> getBakhshes() {
        return bakhshes;
    }

    public void setBakhshes(ArrayList<Bakhsh> bakhshes) {
        this.bakhshes = bakhshes;
    }
}
