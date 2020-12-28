package com.trimindi.mahmadakbar.wise;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MainSectionsPagerAdapter extends FragmentPagerAdapter{

    public MainSectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch(position) {
            case 0:
                HomeFragment homeFragment= new HomeFragment();
                return homeFragment;

            case 1:
                StatusFragment statusFragment = new StatusFragment();
                return  statusFragment;

            case 2:
                ChatFragment chatFragment = new ChatFragment();
                return chatFragment;

            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position){

        switch (position) {
            case 0:
                return "HOME";

            case 1:
                return "STATUS";

            case 2:
                return "CHATS";

            default:
                return null;
        }

    }

}
