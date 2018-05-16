package com.example.ivantelisman.myapplication.mainActivity;

import android.content.Context;

public class MainActivityPresenter implements MainActivityContract.Presenter{

    private MainActivityContract.View mainActivityView;
    private MainActivityContract.Model mainActivityModel = new MainActivityModel(this);
    private Context context;

    public MainActivityPresenter(MainActivityContract.View mainActivityView)
    {
        this.mainActivityView = mainActivityView;
    }


    @Override
    public void subscribe()
    {

    }

    @Override
    public void unsubscribe()
    {

    }

    @Override
    public void setUpPresenter(Context context)
    {
        this.context = context;
        mainActivityModel.setUpModel(context);

    }

}
