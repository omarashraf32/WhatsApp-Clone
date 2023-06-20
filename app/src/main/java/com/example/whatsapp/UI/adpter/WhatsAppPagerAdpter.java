package com.example.whatsapp.UI.adpter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.whatsapp.UI.ChatFragment;
import com.example.whatsapp.UI.StatuFragment;

public class WhatsAppPagerAdpter extends FragmentStateAdapter {

    private int count;

    public WhatsAppPagerAdpter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle, int count) {
        super(fragmentManager, lifecycle);
        this.count = count;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new ChatFragment();
            case 1:
                return new StatuFragment();
            case 2:
                return new ChatFragment();
        }
        return new Fragment() ;
    }
    @Override
    public int getItemCount() {
        return count;
    }
}
