import java.util.ArrayList;

public class Bakhsh {

    String name;
    String type;
    ArrayList<Doctor>doctors = new ArrayList<>();
    ArrayList<Bimar>bimars = new ArrayList<>();
    Monshi monshi;

    public Bakhsh(String name, String type, Monshi monshi) {
        this.name = name;
        this.type = type;
        this.monshi = monshi;
    }

    public Bakhsh(String name, String type, ArrayList<Doctor> doctors,
                  ArrayList<Bimar> bimars, Monshi monshi) {
        this.name = name;
        this.type = type;
        this.doctors = doctors;
        this.bimars = bimars;
        this.monshi = monshi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }

    public ArrayList<Bimar> getBimars() {
        return bimars;
    }

    public void setBimars(ArrayList<Bimar> bimars) {
        this.bimars = bimars;
    }

    public Monshi getMonshi() {
        return monshi;
    }

    public void setMonshi(Monshi monshi) {
        this.monshi = monshi;
    }
}
