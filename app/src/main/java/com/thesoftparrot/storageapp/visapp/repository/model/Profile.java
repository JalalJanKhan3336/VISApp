package com.thesoftparrot.storageapp.visapp.repository.model;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.Serializable;

public class Profile implements Serializable {

    @NonNull
    private String userId, phoneNumber;
    private String name, bio, imageLocalPath, imageCloudPath;
    private boolean isOnline;

    public Profile() {}

    public Profile(@NonNull String userId, @NonNull String phoneNumber) {
        this.userId = userId;
        this.phoneNumber = phoneNumber;
        this.name = null;
        this.bio = null;
        this.imageLocalPath = null;
        this.imageCloudPath = null;
        this.isOnline = false;
    }

    public Profile(@NonNull String userId, @NonNull String phoneNumber, String name) {
        this.userId = userId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.bio = null;
        this.imageLocalPath = null;
        this.imageCloudPath = null;
        this.isOnline = false;
    }

    public Profile(@NonNull String userId, @NonNull String phoneNumber, String name, String bio) {
        this.userId = userId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.bio = bio;
        this.imageLocalPath = null;
        this.imageCloudPath = null;
        this.isOnline = false;
    }

    public Profile(@NonNull String userId, @NonNull String phoneNumber, String name, String bio, String imageLocalPath) {
        this.userId = userId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.bio = bio;
        this.imageLocalPath = imageLocalPath;
        this.imageCloudPath = null;
        this.isOnline = false;
    }

    public Profile(@NonNull String userId, @NonNull String phoneNumber, String name, String bio, String imageLocalPath, boolean isOnline) {
        this.userId = userId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.bio = bio;
        this.imageLocalPath = imageLocalPath;
        this.imageCloudPath = null;
        this.isOnline = isOnline;
    }

    public Profile(@NonNull String userId, @NonNull String phoneNumber, String name, String bio, String imageLocalPath,
                   String imageCloudPath, boolean isOnline) {
        this.userId = userId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.bio = bio;
        this.imageLocalPath = imageLocalPath;
        this.imageCloudPath = imageCloudPath;
        this.isOnline = isOnline;
    }

    @NonNull
    public String getUserId() {
        return userId;
    }

    public void setUserId(@NonNull String userId) {
        this.userId = userId;
    }

    @NonNull
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(@NonNull String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        if(name == null || TextUtils.isEmpty(name))
            return "";
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        if(bio == null || TextUtils.isEmpty(bio))
            return "I'm using VIS an unlimited storage app";
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getImageLocalPath() {
        if(imageLocalPath == null || TextUtils.isEmpty(imageLocalPath))
            return null;
        return imageLocalPath;
    }

    public void setImageLocalPath(String imageLocalPath) {
        this.imageLocalPath = imageLocalPath;
    }

    public String getImageCloudPath() {
        if(imageCloudPath == null || TextUtils.isEmpty(imageCloudPath))
            return null;

        return imageCloudPath;
    }

    public void setImageCloudPath(String imageCloudPath) {
        this.imageCloudPath = imageCloudPath;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }
}
