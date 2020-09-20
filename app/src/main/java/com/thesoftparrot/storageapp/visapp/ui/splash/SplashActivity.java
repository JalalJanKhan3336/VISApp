package com.thesoftparrot.storageapp.visapp.ui.splash;

import android.os.Handler;
import android.view.View;

import com.pakistan.jkutils.utils.MoverUtils;
import com.thesoftparrot.storageapp.visapp.databinding.ActivitySplashBinding;
import com.thesoftparrot.storageapp.visapp.ui.auth.activity.AuthActivity;
import com.thesoftparrot.storageapp.visapp.ui.base.activity.BaseActivity;
import com.thesoftparrot.storageapp.visapp.ui.home.activity.MainActivity;

public class SplashActivity extends BaseActivity<ActivitySplashBinding> {

    @Override
    protected ActivitySplashBinding initBinding() {
        return ActivitySplashBinding.inflate(getLayoutInflater());
    }

    @Override
    protected View initRoot() {
        return mBinding.getRoot();
    }

    @Override
    protected void initRef() {
        new Handler().postDelayed(() -> move(isLoggedIn() ? MainActivity.class: AuthActivity.class), 2000);
    }

    @Override
    protected void click() {

    }

    // Move to specified Activity
    private void move(Class target) {
        MoverUtils.moveTo(SplashActivity.this, target);
        finish();
    }

}