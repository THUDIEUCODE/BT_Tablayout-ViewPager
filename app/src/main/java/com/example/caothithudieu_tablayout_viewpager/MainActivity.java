package com.example.caothithudieu_tablayout_viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout_106;
    private ViewPager2 viewPager_106;
    private ViewPagerAdapter adapter_106;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout_106 = findViewById(R.id.tabLayout_106);
        viewPager_106 = findViewById(R.id.viewPager_106);

        adapter_106 = new ViewPagerAdapter(this);
        viewPager_106.setAdapter(adapter_106);

        new TabLayoutMediator(tabLayout_106, viewPager_106,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("Sách Bán Chạy");
                            break;
                        case 1:
                            tab.setText("Sách Khoa Học");
                            break;
                        case 2:
                            tab.setText("Sách Văn Học");
                            break;
                    }
                }
        ).attach();
    }
}