package am.aca.githubusers.adapter.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import am.aca.githubusers.R;

public class UserViewHolder extends RecyclerView.ViewHolder {
    private TextView user;

    public UserViewHolder(View itemView) {
        super(itemView);
        user = itemView.findViewById(R.id.user);
    }

    public TextView getUser() {
        return user;
    }

    public void setUser(TextView user) {
        this.user = user;
    }
}
