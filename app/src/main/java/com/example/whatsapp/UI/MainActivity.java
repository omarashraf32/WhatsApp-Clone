package com.example.whatsapp.UI;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
import android.widget.Toast;

import com.example.whatsapp.R;
import com.example.whatsapp.UI.adpter.WhatsAppPagerAdpter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity<Protected> extends AppCompatActivity {

    private WhatsAppPagerAdpter adpter;
private TabLayout tabLayout ;
private ViewPager2 viewPager2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViwePager();
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    private void initViwePager(){
        tabLayout = findViewById(R.id.whats_app_tab_layout);
        viewPager2 = findViewById(R.id.viwe_pager_container);
        adpter = new WhatsAppPagerAdpter(getSupportFragmentManager(),this.getLifecycle(),tabLayout.getTabCount());
        viewPager2.setAdapter(adpter);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager2.registerOnPageChangeCallback(viewPagerCallBack);
    }
    ViewPager2.OnPageChangeCallback viewPagerCallBack = new ViewPager2.OnPageChangeCallback() {
        @Override
        public void onPageSelected(int position) {
            super.onPageSelected(position);
            tabLayout.selectTab(tabLayout.getTabAt(position));
        }
    };
    // eh t2ser el unregister (mlhsh t2ser 3la el app)
    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewPager2.unregisterOnPageChangeCallback(viewPagerCallBack);
    }
}
