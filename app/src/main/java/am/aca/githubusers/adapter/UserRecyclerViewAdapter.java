package am.aca.githubusers.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import am.aca.githubusers.R;
import am.aca.githubusers.User;
import am.aca.githubusers.adapter.viewholder.UserViewHolder;

public class UserRecyclerViewAdapter extends RecyclerView.Adapter<UserViewHolder> {
    List<User> mUserList;

    public UserRecyclerViewAdapter(ArrayList<User> userList) {
        mUserList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        UserViewHolder userViewHolder = new UserViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_user, parent, false));

        return userViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = mUserList.get(position);
        holder.getUser().setText(user.login);

    }

    @Override
    public int getItemCount() {
        return mUserList.size();
    }
}
