package ke.co.omalipo.omalipo.classes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by peter on 14/10/2016.
 */

public interface ApiService {

    @GET("deals")
    Call<List<Deal>> getDeals();

    @POST("users")
    Call<User> createUser(@Body User user);
}
