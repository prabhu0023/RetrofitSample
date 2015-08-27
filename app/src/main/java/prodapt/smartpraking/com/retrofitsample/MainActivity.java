package prodapt.smartpraking.com.retrofitsample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import prodapt.smartpraking.com.retrofitsample.operation.ApiUserRegistration;
import prodapt.smartpraking.com.retrofitsample.retofit.RestCallback;
import prodapt.smartpraking.com.retrofitsample.retofit.RestError;
import prodapt.smartpraking.com.retrofitsample.retofit.RetofitRestAdapter;
import retrofit.client.Response;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User userInfo = new User();
        userInfo.setUserId("prabhu0023@gmail.com");
        userInfo.setUserName("prabhu");
        ApiUserRegistration apiUserRegistration = RetofitRestAdapter.getRestAdapter().create(ApiUserRegistration.class);
        apiUserRegistration.login(userInfo, new RestCallback<User>() {
            @Override
            public void success(User loginResponse, Response response) {
                // success!
                Log.i("launcher", "" + loginResponse.getHeader());
                BufferedReader reader = null;
                StringBuilder sb = new StringBuilder();
                try {
                    reader = new BufferedReader(new InputStreamReader(response.getBody().in()));
                    String line;
                    try {
                        while ((line = reader.readLine()) != null) {
                            sb.append(line);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                String result = sb.toString();
                Log.v("Success", result);
            }

            @Override
            public void failure(RestError error) {
                // something went wrong
                Log.e("There are some problem", error.toJSON());
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
