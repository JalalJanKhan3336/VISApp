package com.thesoftparrot.storageapp.visapp.ui.home.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thesoftparrot.storageapp.visapp.R;

public class AllPhotosFragment extends Fragment {

    public AllPhotosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_all_photos, container, false);
    }
}