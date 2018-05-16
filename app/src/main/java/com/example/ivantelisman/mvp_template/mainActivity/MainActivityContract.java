package com.example.ivantelisman.myapplication.mainActivity;

import com.example.ivantelisman.myapplication.BaseModel;
import com.example.ivantelisman.myapplication.BasePresenter;
import com.example.ivantelisman.myapplication.BaseView;

public interface MainActivityContract {

    interface View extends BaseView<Presenter>
    {

    }

    interface Presenter extends BasePresenter
    {

    }

    interface Model extends BaseModel<Presenter>
    {

    }
}
