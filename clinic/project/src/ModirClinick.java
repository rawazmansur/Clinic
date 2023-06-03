import java.util.Scanner;

public class ModirClinick extends Karbar{

    double hoghogh;
    Clinick clinick;


    public ModirClinick(String name, String userName, String password,
                        double hoghogh, Clinick clinick) {
        super(name,userName,password);
        this.hoghogh = hoghogh;
        this.clinick = clinick;
    }

    public double getHoghogh() {
        return hoghogh;
    }

    public void setHoghogh(double hoghogh) {
        this.hoghogh = hoghogh;
    }

    public Clinick getClinick() {
        return clinick;
    }

    public void setClinick(Clinick clinick) {
        this.clinick = clinick;
    }

    public static void add_bakhsh(Scanner scanner){

        System.out.println("enter name bakhsh:");
        String name = scanner.next();
        System.out.println("enter type bakhsh:");
        String type = scanner.next();

        System.out.println("enter name monshi:");
        String name_m = scanner.next();
        System.out.println("enter username monshi:");
        String username_m = scanner.next();
        System.out.println("enter password monshi:");
        String password_m = scanner.next();
        System.out.println("enter password monshi:");
        double hoghoogh_m = scanner.nextDouble();

        System.out.println("enter clinik name :");
        String clinick_m = scanner.next();

        Bakhsh bakhsh = new Bakhsh(name,type,new Monshi(name_m,username_m,password_m,hoghoogh_m));

        Clinick clinick = null;
        for (Clinick c:Main.clinicks) {
            if (c.getName().equals(clinick_m)){
                clinick = c;
                break;
            }
        }
        if (clinick != null){
            Main.bakhshes.add(bakhsh);
            clinick.bakhshes.add(bakhsh);
            System.out.println("bakhsh added");
        }else {
            System.out.println("clinick not found");
        }


    }

    public static void remove_bakhsh(Scanner scanner){

        System.out.println("enter name bakhsh:");
        String name = scanner.next();

        for (int i = 0; i <Main.bakhshes.size() ; i++) {
            if (Main.bakhshes.get(i).name.equals(name)){
                Main.bakhshes.remove(i);
                break;
            }
        }

        for (Clinick c:Main.clinicks) {
            for (int i = 0; i <c.bakhshes.size() ; i++) {
                if (c.bakhshes.get(i).getName().equals(name)){
                    c.bakhshes.remove(i);
                    break;
                }
            }
        }

        System.out.println("bakhsh removed");
    }

    public static void add_doctor(Scanner scanner){

        System.out.println("enter name :");
        String name = scanner.next();
        System.out.println("enter username :");
        String username = scanner.next();
        System.out.println("enter password :");
        String password = scanner.next();
        System.out.println("enter type doctor:");
        String type_doctor = scanner.next();
        System.out.println("enter hoghoogh:");
        double hoghoogh = scanner.nextDouble();
        System.out.println("enter hagh visit:");
        double hagh_visit = scanner.nextDouble();

        System.out.println("enter name bakhsh:");
        String bakhsh_name = scanner.next();

        Bakhsh bakhsh = null;
        for (Bakhsh b:Main.bakhshes) {
            if (b.getName().equals(bakhsh_name)){
                bakhsh = b;
                break;
            }
        }

        if (bakhsh != null){

            Doctor doctor = new Doctor(name,username,password,type_doctor,hoghoogh,hagh_visit);
            bakhsh.doctors.add(doctor);
            Main.doctors.add(doctor);

            System.out.println("new doctor added");

        }else {
            System.out.println("bakhsh not found");
        }


    }

    public static void remove_doctor(Scanner scanner){

        System.out.println("enter username :");
        String username = scanner.next();
        System.out.println("enter password :");
        String password = scanner.next();

        for (int i = 0; i < Main.doctors.size() ; i++) {
            if ( Main.doctors.get(i).getUserName().equals(username) &&
                    Main.doctors.get(i).getPassword().equals(password)){
                Main.doctors.remove(i);
                break;
            }
        }


        for (Bakhsh b:Main.bakhshes) {
            for (int i = 0; i <b.doctors.size() ; i++) {
                if ( b.doctors.get(i).getUserName().equals(username) &&
                        b.doctors.get(i).getPassword().equals(password)){
                    b.doctors.remove(i);
                    break;
                }
            }
        }


        System.out.println("doctor removed");

    }

    public static void add_monshi(Scanner scanner){
        System.out.println("enter name :");
        String name = scanner.next();
        System.out.println("enter username :");
        String username = scanner.next();
        System.out.println("enter password :");
        String password = scanner.next();
        System.out.println("enter hoghoogh:");
        double hoghoogh = scanner.nextDouble();

        System.out.println("enter name bakhsh that monshi need :");
        String bakhsh_name = scanner.next();

        Bakhsh bakhsh = null;
        for (Bakhsh b:Main.bakhshes) {
            if (b.getName().equals(bakhsh_name)){
                bakhsh = b;
                break;
            }
        }

        if (bakhsh != null){

            Main.monshis.add(new Monshi(name,username,password,hoghoogh,bakhsh));
            System.out.println("new monshi added");

        }else {
            System.out.println("bakhsh not found");
        }

    }

    public static void remove_monshi(Scanner scanner){

        System.out.println("enter username :");
        String username = scanner.next();
        System.out.println("enter password :");
        String password = scanner.next();

        for (int i = 0; i < Main.monshis.size() ; i++) {
            if ( Main.monshis.get(i).getUserName().equals(username) &&
                    Main.monshis.get(i).getPassword().equals(password)){
                Main.monshis.remove(i);
                break;
            }
        }
        System.out.println("monshi removed");
    }

    public static void pardakht_hoghogh(){

        for (Doctor d:Main.doctors) {
            d.setHoghoogh(d.getHoghoogh() + d.hoghoogh);
        }

        for (Monshi d:Main.monshis) {
            d.setHoghogh(d.getHoghogh() + d.hoghogh);
        }

        System.out.println("done");
    }

    public static void didan_hoghoogh_karmandan(){
        for (Doctor d:Main.doctors) {
            System.out.println(d.toString());
        }

        for (Monshi d:Main.monshis) {
            System.out.println(d.toString());
        }
    }

    public static void didan_sabegh_erjaat_doctor(){

    }

}
