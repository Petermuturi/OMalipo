package ke.co.omalipo.omalipo.classes;

import retrofit2.Call;

/**
 * Created by peter on 14/10/2016.
 */

public class User extends BaseModel{
    public String name;
    public String email;
    public String password;

    public User(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(){
        this(null, null, null);
    }

    public static Call<User> register(User user){
        return api().createUser(user);
    }

}
