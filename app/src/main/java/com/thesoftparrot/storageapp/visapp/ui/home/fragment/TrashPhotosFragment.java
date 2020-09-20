package com.thesoftparrot.storageapp.visapp.ui.home.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.thesoftparrot.storageapp.visapp.R;

public class TrashPhotosFragment extends Fragment {

    public TrashPhotosFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trash_photos, container, false);
    }
}