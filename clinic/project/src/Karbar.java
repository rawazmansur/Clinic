public class Karbar implements Service{

    String name;
    String userName;
    String password;

    public Karbar() {

    }

    public Karbar(String name, String userName, String password) {
        this.name = name;
        this.userName = userName;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Karbar{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void find_doctor() {

    }

    @Override
    public void find_monshi() {

    }

    @Override
    public boolean verify_username(String username) {
        return false;
    }

    @Override
    public boolean verify_password(String password) {
        return false;
    }
}
