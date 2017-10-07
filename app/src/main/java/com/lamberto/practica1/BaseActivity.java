package com.lamberto.practica1;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResID());
        bindButterknife();
        onPreparateToolbar();
        initView();
    }

    @LayoutRes
    protected abstract int getLayoutResID();

    /**
     * Aqui la vista ya fue creada
     */
    protected void initView(){

    }

    /**
     * Aqui se cunfigura el toolbar s es que existe en el layout
     */
    private void onPreparateToolbar(){
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        if (toolbar != null){ //existe
            setSupportActionBar(toolbar);
        }
    }

    public Toolbar getToolbar() {
        return toolbar;
    }

    protected void bindButterknife(){
        ButterKnife.bind(this);
    }

}
