package com.trimindi.mahmadakbar.wise;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class StartSectionsPagerAdapter extends FragmentPagerAdapter{

    public StartSectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch(position) {
            case 0:
                LoginFragment loginFragment= new LoginFragment();
                return loginFragment;

            case 1:
                RegisterFragment registerFragment = new RegisterFragment();
                return  registerFragment;

            case 2:
                WelcomeFragment welcomeFragment = new WelcomeFragment();
                return welcomeFragment;

            default:
                return  null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

}
