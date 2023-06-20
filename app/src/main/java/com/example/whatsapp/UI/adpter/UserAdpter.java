package com.example.whatsapp.UI.adpter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.whatsapp.R;
import com.example.whatsapp.data.modle.UserModel;

import java.util.List;
import java.util.zip.Inflater;

public class UserAdpter extends RecyclerView.Adapter<UserAdpter.UserHolder> {

private List<UserModel>users;
private UserClilckLisner userClilckLisner;
    public UserAdpter(UserClilckLisner userClilckLisner,List<UserModel> users) {
        this.users = users;
        this.userClilckLisner=userClilckLisner;
    }

    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viwe = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_user_layout,parent,false);
        return new UserHolder(viwe);
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, int position) {
UserModel user = users.get(position);
holder.userNameTxt.setText(user.getUserName());
holder.userImageIv.setImageResource(user.getUserImage());
holder.userImageIv.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        userClilckLisner.showimage(user.getUserImage());
    }
});
    }

    @Override
    public int getItemCount() {
        if (users !=null)
            return users.size();
        return 0;
    }

    static class UserHolder extends RecyclerView.ViewHolder{
        TextView userNameTxt;
        ImageView userImageIv;
        public UserHolder(@NonNull View itemView) {
            super(itemView);
            userNameTxt = itemView.findViewById(R.id.user_name);
            userImageIv = itemView.findViewById(R.id.user_img);
        }
    }


}
