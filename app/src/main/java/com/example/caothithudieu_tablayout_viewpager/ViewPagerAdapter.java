package com.example.caothithudieu_tablayout_viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new BestSellerFragment();
            case 1:
                return new ScienceFragment();
            case 2:
                return new LiteratureFragment();
            default:
                return new BestSellerFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}