public class Eerjaat {

    Bimar bimar;
    Doctor doctor;
    boolean is_visit;

    public Eerjaat(Bimar bimar, Doctor doctor) {
        this.bimar = bimar;
        this.doctor = doctor;
        this.is_visit=false;
    }

    public Bimar getBimar() {
        return bimar;
    }

    public void setBimar(Bimar bimar) {
        this.bimar = bimar;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Eerjaat{" +
                "bimar=" + bimar.getName() +
                ", doctor=" + doctor.getUserName() +
                '}';
    }
}
