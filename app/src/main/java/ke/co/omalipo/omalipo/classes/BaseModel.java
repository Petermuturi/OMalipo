package ke.co.omalipo.omalipo.classes;

/**
 * Created by peter on 14/10/2016.
 */

public class BaseModel {
    public String id;

    public static ApiService api(){
        return ApiConfig.getService();
    }
}
