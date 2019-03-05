package com.example.supergit.presenters.home;


import com.arellomobile.mvp.MvpView;

public interface UserView extends MvpView {
    void showName(String name);

    void showImage(String imageUrl);

    void showError(Throwable e);

    void showLoading();

    void hideLoading();
}
