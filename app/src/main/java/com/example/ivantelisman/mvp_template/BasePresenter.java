package com.example.ivantelisman.myapplication;

import android.content.Context;

/**
 * Created by ivantelisman on 5/19/18.
 */

public interface BasePresenter
{

    void subscribe();

    void unsubscribe();

    void setUpPresenter(Context context);

}