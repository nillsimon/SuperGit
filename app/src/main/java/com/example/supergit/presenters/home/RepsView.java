package com.example.supergit.presenters.home;

import com.arellomobile.mvp.MvpView;

public interface RepsView extends MvpView {

    void showError(Throwable e);

    void showLoading();

    void hideLoading();
}