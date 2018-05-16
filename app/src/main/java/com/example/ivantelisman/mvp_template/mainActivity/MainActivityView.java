package com.example.ivantelisman.myapplication.mainActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ivantelisman.myapplication.R;

public class MainActivityView extends AppCompatActivity implements MainActivityContract.View{
    private MainActivityContract.Presenter mainActivityPresenter = new MainActivityPresenter(this);

    public MainActivityView()
    {
        // Required empty public constructor
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setPresenter(MainActivityContract.Presenter presenter) {
        mainActivityPresenter = presenter;
    }
}
