package com.example.thinkpad.nerdlauncher;

import android.support.v4.app.Fragment;


public class NerdLaucherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new NerdLauncherFragment();
    }
}
