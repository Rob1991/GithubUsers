package am.aca.githubusers;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("id")
    public String id;
    @SerializedName("login")
    public String login;
}
