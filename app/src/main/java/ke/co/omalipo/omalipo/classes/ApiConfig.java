package ke.co.omalipo.omalipo.classes;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by peter on 14/10/2016.
 */

public class ApiConfig {

    private static ApiService service;

    public static ApiService getService(){
        if(service == null){
            // create instance
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://ba4ed4e5.ngrok.io/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            service = retrofit.create(ApiService.class);
        }
        return service;
    }

}
