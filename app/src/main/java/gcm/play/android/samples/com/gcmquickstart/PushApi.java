package gcm.play.android.samples.com.gcmquickstart;

import com.google.android.gms.gcm.Task;
import com.squareup.okhttp.Response;

import retrofit.Call;
import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

/**
 * Created by bikram on 5/2/16.
 */
public interface PushApi {
    @FormUrlEncoded
    @POST("/gcm/register_regid.php")
    public void insertUser(
            @Field("name") String name,
            @Field("email") String email,
            @Field("regId") String regId,
            Callback<Response> callback);
}

