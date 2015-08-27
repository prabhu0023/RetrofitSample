package prodapt.smartpraking.com.retrofitsample.retofit;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import prodapt.smartpraking.com.smarkparking.util.SmartParkingConstans;
import retrofit.RestAdapter;
import retrofit.converter.GsonConverter;

/**
 * Created by prodapt on 06/08/15.
 */
public class RetofitRestAdapter {

    private static RestAdapter REST_ADAPTER;
    static {
        setupRestClient();
    }



    private static void setupRestClient() {




        Gson gson = new GsonBuilder()
                .registerTypeAdapterFactory(new ItemTypeAdapterFactory()) // This is the important line ;)
                .setDateFormat("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSS'Z'")
                .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                .create();

        RestAdapter  restAdapter = new RestAdapter.Builder()
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setEndpoint(SmartParkingConstans.masterWebServiceUrl)
                .setConverter(new GsonConverter(gson))
                .setRequestInterceptor(new SessionRequestInterceptor())
                .build();

        REST_ADAPTER = restAdapter;
    }
    public static RestAdapter getRestAdapter()
    {
        return REST_ADAPTER;
    }
}
