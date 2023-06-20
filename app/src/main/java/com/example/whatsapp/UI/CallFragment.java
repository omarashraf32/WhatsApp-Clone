package com.example.whatsapp.UI;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.whatsapp.R;
import com.example.whatsapp.UI.adpter.UserAdpter;
import com.example.whatsapp.UI.adpter.UserClilckLisner;
import com.example.whatsapp.data.modle.UserModel;

import java.util.ArrayList;

public class CallFragment extends Fragment implements UserClilckLisner {



    private RecyclerView userRecycler;
    private UserAdpter userAdpter ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_call, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler(view);
    }
    private void initRecycler(View view){
        ArrayList<UserModel> data = new ArrayList();
        data.add(new UserModel(R.drawable.img,"Omar Ashraf"));
        data.add(new UserModel(R.drawable.img3,"Yasser Mahmoud"));
        data.add(new UserModel(R.drawable.img4,"Muhammad Ali"));
        data.add(new UserModel(R.drawable.img6,"Ahmed Ashraf"));
        data.add(new UserModel(R.drawable.img9,"Khaild Ahmed"));
        data.add(new UserModel(R.drawable.img10f,"Nora Ahmed"));
        data.add(new UserModel(R.drawable.img1f,"Omnia Raft"));
        data.add(new UserModel(R.drawable.img2f,"Toka Medhat"));
        data.add(new UserModel(R.drawable.img8,"Yasmen Khaild"));
        data.add(new UserModel(R.drawable.img11f,"Hadeer Sayed"));
        userAdpter = new UserAdpter(this,data);
        userRecycler = view.findViewById(R.id.chat_recycler);
        userRecycler.setAdapter(userAdpter);
        userRecycler.setLayoutManager(new LinearLayoutManager(requireContext()));
    }

    @Override
    public void showimage(int image) {

    }

    @Override
    public void test() {

    }
}