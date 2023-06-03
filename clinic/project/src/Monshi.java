import java.util.ArrayList;
import java.util.Scanner;

public class Monshi extends Karbar{

    Bakhsh bakhsh;
    double hoghogh;
    ArrayList<Eerjaat> eejaatArrayList = new ArrayList<>();

    public Monshi() {
    }

    public Monshi(String name, String userName, String password, double hoghogh) {
        super(name,userName,password);
        this.hoghogh = hoghogh;
    }

    public Monshi(String name, String userName, String password, double hoghogh,Bakhsh bakhsh) {
        super(name,userName,password);
        this.hoghogh = hoghogh;
        this.bakhsh=bakhsh;
    }

    public Monshi(String name, String userName, String password,
                  Bakhsh bakhsh, double hoghogh, ArrayList<Eerjaat> eejaatArrayList) {
        super(name,userName,password);
        this.bakhsh = bakhsh;
        this.hoghogh = hoghogh;
        this.eejaatArrayList = eejaatArrayList;
    }

    public Bakhsh getBakhsh() {
        return bakhsh;
    }

    public void setBakhsh(Bakhsh bakhsh) {
        this.bakhsh = bakhsh;
    }

    public double getHoghogh() {
        return hoghogh;
    }

    public void setHoghogh(double hoghogh) {
        this.hoghogh = hoghogh;
    }

    public ArrayList<Eerjaat> getEejaatArrayList() {
        return eejaatArrayList;
    }

    public void setEejaatArrayList(ArrayList<Eerjaat> eejaatArrayList) {
        this.eejaatArrayList = eejaatArrayList;
    }

    public static void get_nobat_for_bimar(Scanner scanner){

        System.out.println("enter name bakhsh : ");
        String bakhsh1 = scanner.next();

        Bakhsh bakhsh = null;
        for (Bakhsh b:Main.bakhshes) {
            if (b.getName().equals(bakhsh1)){
                bakhsh = b;
            }
        }

        if (bakhsh != null){

            System.out.println("enter username bimar");
            String username_bimar = scanner.next();

            Bimar bimar = null;
            for (Bimar b:Main.bimars) {
                if (b.getUserName().equals(username_bimar)){
                    bimar = b;
                    break;
                }
            }

            if (bimar != null){

                System.out.println("enter takhasos doctor");
                String type_doctor = scanner.next();

                Doctor doctor = choose_doctor(type_doctor);

                if (doctor != null){

                    Eerjaat eerjaat = new Eerjaat(bimar,doctor);
                    Main.eerjaats.add(eerjaat);
                    bakhsh.getMonshi().eejaatArrayList.add(eerjaat);
                    System.out.println("get nobat added successfully");

                }else {
                    System.out.println("docotr not found");
                }


            }else {
                System.out.println("bimar not found");
            }



        }else {
            System.out.println("bakhsh not found");
        }

    }

    public static Doctor choose_doctor(String type_doctor){

        for (Doctor d:Main.doctors) {
            if (d.getType_doctor().equals(type_doctor)){
                return d;
            }
        }

        return null;
    }

    @Override
    public void find_monshi() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter name monshi :");
        String name = scanner.next();

        for (Monshi d:Main.monshis) {
            if (d.getUserName().equals(name)){
                System.out.println(d.toString());
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Monshi{" +
                "name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", hoghogh=" + hoghogh +
                '}';
    }
}
