package com.example.demo2activity;

import androidx.fragment.app.Fragment;

/**
 * @description:
 * @author: bytedance
 * @date: 2020-03-26 13:26
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
