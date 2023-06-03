import java.util.ArrayList;
import java.util.Scanner;

public class Doctor extends Karbar{

    String type_doctor;
    double hoghoogh;
    double hagh_visit;

    public Doctor() {

    }

    public Doctor(String name, String userName, String password,
                  String type_doctor, double hoghoogh, double hagh_visit) {
        super(name,userName,password);
        this.type_doctor = type_doctor;
        this.hoghoogh = hoghoogh;
        this.hagh_visit = hagh_visit;
    }
    public void setHagh_visit(double hagh_visit) {
        this.hagh_visit = hagh_visit;
    }


    public String getType_doctor() {
        return type_doctor;
    }

    public void setType_doctor(String type_doctor) {
        this.type_doctor = type_doctor;
    }

    public double getHoghoogh() {
        return hoghoogh;
    }

    public void setHoghoogh(double hoghoogh) {
        this.hoghoogh = hoghoogh;
    }

    public double getHagh_visit() {
        return hagh_visit;
    }

    public void visit_bimar(ArrayList<Eerjaat> eerjaats, Doctor doctor){

        for (Eerjaat eerjaat : eerjaats) {
            if (eerjaat.doctor == doctor && !eerjaat.is_visit) {
                eerjaat.bimar.pardakt_hagh_visit(doctor);
            }
        }

    }

    public  void mizan_daraamad(){

        System.out.println(hoghoogh);
    }

    @Override
    public void find_doctor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter username docor :");
        String name = scanner.next();

        for (Doctor d:Main.doctors) {
            if (d.getUserName().equals(name)){
                System.out.println(d.toString());
                break;
            }
        }

    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", hoghoogh=" + hoghoogh +
                '}';
    }
}

