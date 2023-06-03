import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

   static ArrayList<Bimar>bimars = new ArrayList<>();
   static ArrayList<Bakhsh>bakhshes = new ArrayList<>();
   static ArrayList<Clinick>clinicks = new ArrayList<>();
   static ArrayList<Doctor>doctors = new ArrayList<>();
   static ArrayList<Eerjaat>eerjaats = new ArrayList<>();
   static ArrayList<Monshi>monshis = new ArrayList<>();
   static ArrayList<ModirClinick>modirClinicks = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("   wellcome");
            System.out.println("1 - sign up");
            System.out.println("2 - sign in");

            int n = scanner.nextInt();

            if (n == 1){

                System.out.println("enter " +
                        "1 for bimar ," +
                        "2 for modir clinick ");

                int type = scanner.nextInt();

                if (type == 1){
                    add_bimmar(scanner);
                }else if (type == 2){
                    add_modir_clinick(scanner);
                }


            }else if (n == 2){

                System.out.println("enter username :");
                String username = scanner.next();
                System.out.println("enter password :");
                String password = scanner.next();


                List<Object> type_user = find_type_user(username,password);

                try {
                    assert type_user != null;
                    if (type_user.get(0) != null){ // bimar
                        dashboard_bimar(scanner);
                    }else if (type_user.get(1) != null){ //doctor
                        dashboard_doctor(scanner);
                    }else if (type_user.get(2) != null){ //monshi
                        dashboard_monshi(scanner);

                    }else if (type_user.get(3) != null){ //modirClinick
                        dashboard_modir_clinick(scanner);
                    }
                }catch (Exception e){
                    System.out.println("not found");
                }
            }
        }


    }

    private static void dashboard_bimar(Scanner scanner) {
        while (true){
            System.out.println("1- get nobat for bimar :");
            System.out.println("2- find doctor :");
            System.out.println("3- find monshi :");
            System.out.println("3- exit :");

            int n = scanner.nextInt();

            if (n == 1){
                Monshi.get_nobat_for_bimar(scanner);
            }else if (n == 2){

                Doctor doctor = new Doctor();
                doctor.find_doctor();

            }else if (n == 3){

                Monshi monshi = new Monshi();
                monshi.find_monshi();

            } else {
                break;
            }

        }
    }

    private static void dashboard_doctor(Scanner scanner) {

        System.out.println("enter username :");
        String username = scanner.next();
        System.out.println("enter password :");
        String password = scanner.next();

        Doctor doctor = null;

        for (Doctor d:doctors) {
            if (d.getUserName().equals(username) &&
            d.getPassword().equals(password)){
                doctor = d;
                break;
            }
        }

        if (doctor != null){

            while (true){
                System.out.println("1- visit bimar");
                System.out.println("2- mizan daraamad");
                System.out.println("3- exit");

                int n = scanner.nextInt();

                if (n == 1){
                    doctor.visit_bimar(eerjaats,doctor);

                }else if (n == 2){
                    doctor.mizan_daraamad();

                }else {
                    break;
                }

            }
        }else {
            System.out.println("docotor not found");
        }


    }

    private static void dashboard_monshi(Scanner scanner) {
        while (true){
            System.out.println("1- get nobat for bimar :");
            System.out.println("2- exit :");

            int n = scanner.nextInt();

            if (n == 1){
                Monshi.get_nobat_for_bimar(scanner);
            }else {
                break;
            }

        }
    }

    private static void dashboard_modir_clinick(Scanner scanner) {

        while (true) {

            System.out.println("1 - add baksh");
            System.out.println("2 - remove baksh");
            System.out.println("3 - add doctor");
            System.out.println("4 - remove doctor");
            System.out.println("5 - add monshi");
            System.out.println("6 - remove monshi");
            System.out.println("7 - pardakht hoghogh");
            System.out.println("8 - didan hoghoogh karmandan");
            System.out.println("9 - didan sabegh erjaat doctor");
            System.out.println("10 - exit");

            int modirClinick_n = scanner.nextInt();

            if (modirClinick_n == 1) {

                ModirClinick.add_bakhsh(scanner);

            } else if (modirClinick_n == 2) {
                ModirClinick.remove_bakhsh(scanner);

            } else if (modirClinick_n == 3) {
                ModirClinick.add_doctor(scanner);

            } else if (modirClinick_n == 4) {
                ModirClinick.remove_doctor(scanner);

            } else if (modirClinick_n == 5) {
                ModirClinick.add_monshi(scanner);

            } else if (modirClinick_n == 6) {
                ModirClinick.remove_monshi(scanner);
            } else if (modirClinick_n == 7) {

                ModirClinick.pardakht_hoghogh();

            } else if (modirClinick_n == 8) {

                ModirClinick.didan_hoghoogh_karmandan();

            } else if (modirClinick_n == 9) {

                for (Eerjaat e:eerjaats) {
                    System.out.println(e.toString());
                }

            } else {
                break;
            }
        }

    }



    private static List<Object> find_type_user(String username, String password) {

        for (Bimar b:bimars) {
            if (b.getUserName().equals(username) && b.getPassword().equals(password)){
                return getDetails(b, null, null, null);
            }
        }

        for (Doctor d:doctors) {
            if (d.getUserName().equals(username) && d.getPassword().equals(password)){
                return getDetails(null,d, null, null);
            }
        }

        for (Monshi m:monshis) {
            if (m.getUserName().equals(username) && m.getPassword().equals(password)){
                return getDetails(null, null,m, null);
            }
        }

        for (ModirClinick m1:modirClinicks) {
            if (m1.getUserName().equals(username) && m1.getPassword().equals(password)){
                return getDetails(null, null, null,m1);
            }
        }

        return null;
    }

    private static void add_modir_clinick(Scanner scanner) {

        System.out.println("enter name :");
        String name = scanner.next();
        System.out.println("enter username :");
        String username = scanner.next();
        System.out.println("enter password :");
        String password = scanner.next();
        System.out.println("enter hoghoogh :");
        double hoghoogh = scanner.nextDouble();

        System.out.println("enter clinick name");
        String clinick_name = scanner.next();
        System.out.println("enter clinick type (1- SHABANE_ROZII, 2- ADII)");
        int clinick_type = scanner.nextInt();

        if (clinick_type == 1){
            Clinick clinick = new Clinick(clinick_name,ClinickType.SHABANE_ROZII);
            ModirClinick modirClinick = new ModirClinick(name,username,password,hoghoogh, clinick);
            modirClinicks.add(modirClinick);
            clinicks.add(clinick);
        }else if (clinick_type == 2){
            Clinick clinick =  new Clinick(clinick_name,ClinickType.ADII);
            ModirClinick modirClinick = new ModirClinick(name,username,password,hoghoogh,clinick);
            modirClinicks.add(modirClinick);
            clinicks.add(clinick);
        }
        System.out.println("modir clinick and clinick added!");
    }

    private static void add_bimmar(Scanner scanner) {

        System.out.println("enter name :");
        String name = scanner.next();
        System.out.println("enter username :");
        String username = scanner.next();
        System.out.println("enter password :");
        String password = scanner.next();
        System.out.println("enter type bimary :");
        String type_bimary = scanner.next();
        System.out.println("enter wallet :");
        double wallet = scanner.nextInt();

        Bimar bimar = new Bimar(name,username,password,type_bimary,wallet);
        bimars.add(bimar);
        System.out.println("bimar added!");
    }


    public static List<Object> getDetails(Bimar bimar,Doctor doctor,Monshi monshi,
            ModirClinick modirClinick)
    {
        return Arrays.asList(bimar, doctor, monshi,modirClinick);
    }




    public static boolean verify_usernames(String username) {
        // Regex to check valid username.
        String regex = "^[A-Za-z]\\w{5,29}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the username is empty
        // return false
        if (username == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given username
        // and regular expression.
        Matcher m = p.matcher(username);

        // Return if the username
        // matched the ReGex
        return m.matches();

    }

    public static boolean verify_passwords(String password) {
        // Regex to check valid password.
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the password is empty
        // return false
        if (password == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(password);

        // Return if the password
        // matched the ReGex
        return m.matches();
    }
}
