package ke.co.omalipo.omalipo.classes;

import java.util.List;

import retrofit2.Call;

/**
 * Created by peter on 14/10/2016.
 */

public class Deal extends BaseModel {
    public String name;
    public String description;
    public String product;
    public double originalPrice;
    public double discountPrice;

    public static Call<List<Deal>> get(){
        return api().getDeals();
    }


}
