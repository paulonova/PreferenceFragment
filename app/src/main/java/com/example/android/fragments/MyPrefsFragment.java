package com.example.android.fragments;

import android.os.Bundle;
import android.preference.PreferenceFragment;


public class MyPrefsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.preferences);

    }
}
