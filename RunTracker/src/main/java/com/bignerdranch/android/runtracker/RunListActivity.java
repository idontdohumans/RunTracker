package com.bignerdranch.android.runtracker;

import android.support.v4.app.Fragment;

/**
 * Created by panda on 7/24/13.
 */
public class RunListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new RunListFragment();
    }
}
