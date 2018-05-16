package com.example.ivantelisman.myapplication.mainActivity;

import android.content.Context;

public class MainActivityModel implements MainActivityContract.Model {
    private MainActivityContract.Presenter mainActivityPresenter;
    private Context context;

    public MainActivityModel(MainActivityContract.Presenter mainActivityPresenter)
    {
        this.mainActivityPresenter = mainActivityPresenter;
    }
    @Override
    public void setPresenter(MainActivityContract.Presenter presenter) {
        mainActivityPresenter = presenter;
    }

    @Override
    public void setUpModel(Context context) {
        this.context = context;
    }

}
