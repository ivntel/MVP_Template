package com.example.ivantelisman.myapplication;

import android.content.Context;

/**
 * Created by ivantelisman on 5/19/18.
 */

public interface BaseModel<T>
{
    void setPresenter(T presenter);

    void setUpModel(Context context);

}