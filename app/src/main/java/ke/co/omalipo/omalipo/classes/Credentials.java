package ke.co.omalipo.omalipo.classes;

/**
 * Created by peter on 14/10/2016.
 */

public class Credentials {
    public String email;
    public String password;

    public Credentials(String email, String password){
        this.email = email;
        this.password = password;
    }

    public Credentials(){
        this(null, null);
    }
}
