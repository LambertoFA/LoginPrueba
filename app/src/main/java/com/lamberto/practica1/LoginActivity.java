package com.lamberto.practica1;


import android.support.v7.widget.Toolbar;

public class LoginActivity extends BaseActivity {

    private static final String TAG = LoginActivity.class.getName();
    private Toolbar toolbar;


    @Override
    protected int getLayoutResID() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        super.initView();
        initConfigToolbar();
    }

    private void initConfigToolbar(){
        toolbar = getToolbar();
        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.ic_arrow_back_white_24dp));
    }


    /*
        Ciclo de vida

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "Entro al onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "Entro al onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "Entro al onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "Entro al onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "Entro al onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "Entro al onRestat");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "Entro al onDestroy");
    }
    */
}
