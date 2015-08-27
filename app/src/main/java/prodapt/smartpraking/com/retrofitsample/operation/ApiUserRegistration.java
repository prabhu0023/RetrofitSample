package prodapt.smartpraking.com.retrofitsample.operation;


import prodapt.smartpraking.com.retrofitsample.User;
import prodapt.smartpraking.com.retrofitsample.retofit.RestCallback;
import retrofit.http.Body;
import retrofit.http.POST;

/**
 * Created by prodapt on 06/08/15.
 */
public interface ApiUserRegistration {
    @POST("/registerUser")
    public void login(@Body User user, RestCallback<User> callback);
}
