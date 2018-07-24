package am.aca.githubusers;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIInterface {


    @GET("/users")
    Call<List<User>> doGetUser();

}