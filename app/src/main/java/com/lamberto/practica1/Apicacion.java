package com.lamberto.practica1;

import android.app.Application;
import android.util.Log;

/**
 * Created by Lamberto on 30/09/2017.
 */

public class Apicacion extends Application {

    private static final String TAG = Apicacion.class.getName();

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG,"Entro a la clase aplicacion");
    }
}
