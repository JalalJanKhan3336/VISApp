package com.thesoftparrot.storageapp.visapp.ui.home.fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.thesoftparrot.storageapp.visapp.R;
import com.thesoftparrot.storageapp.visapp.databinding.FragmentPhotosBinding;
import com.thesoftparrot.storageapp.visapp.ui.base.fragment.BaseFragment;

public class PhotosFragment extends BaseFragment<FragmentPhotosBinding> {

    public PhotosFragment() {
        // Required empty public constructor
    }

    @Override
    protected FragmentPhotosBinding initBinding(@NonNull LayoutInflater inflater, @Nullable ViewGroup container) {
        return FragmentPhotosBinding.inflate(inflater, container, false);
    }

    @Override
    protected View initRoot() {
        return mBinding.getRoot();
    }

    @Override
    protected void initRef() {
        initNavGraph(R.id.photo_host_fragment);
    }

    @Override
    protected void click() {
        
    }

}