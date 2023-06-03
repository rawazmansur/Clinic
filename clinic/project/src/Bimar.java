public class Bimar extends Karbar{

    String type_bimari;
    double wallet;

    public Bimar(String name, String userName, String password
            ,String type_bimari, double wallet) {
        super(name,userName,password);
        this.type_bimari = type_bimari;
        this.wallet = wallet;
    }

    public String getType_bimari() {
        return type_bimari;
    }

    public void setType_bimari(String type_bimari) {
        this.type_bimari = type_bimari;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }


    public void pardakt_hagh_visit(Doctor doctor){

        System.out.println(" pardakt hagh e visit");

        if (doctor != null){

            if (wallet - doctor.hagh_visit > 0){
                wallet = wallet - doctor.hagh_visit;
                doctor.setHagh_visit(doctor.getHagh_visit());
                System.out.println("hahg visit anjam shod.");
            }else {
                System.out.println("do not enght money...");
            }

        }else {
            System.out.println("doctor not found");
        }
    }


}
