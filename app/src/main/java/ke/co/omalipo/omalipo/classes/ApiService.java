package ke.co.omalipo.omalipo.classes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.FieldMap;

/**
 * Created by peter on 14/10/2016.
 */

public interface ApiService {

    @GET("deals")
    Call<List<Deal>> getDeals();

    @POST("users")
    Call<User> createUser(@Body User user);

    @FormUrlEncoded
    @POST("users/login")
    Call<User> loginUser(@Body Credentials credentials);
}
