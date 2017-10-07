package com.lamberto.practica1;


import android.media.MediaCodec;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Patterns;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {

    private static final String TAG = LoginActivity.class.getName();
    private Toolbar toolbar;


    @BindView(R.id.edt_email)
    EditText email;
    @BindView(R.id.text_email)
    TextInputLayout textEmail;
    @BindView(R.id.edt_password)
    EditText password;
    @BindView(R.id.text_password)
    TextInputLayout textpaswword;

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

    @OnClick(R.id.btn_entrar)
    public void onClickLogin(){
        if (isValidLogin()){

        }

    }

    private boolean isValidLogin(){
        boolean valid = true;

        textEmail.setError(null); //Borrar el texto
        textpaswword.setError(null);
        textEmail.setErrorEnabled(false);//Borrar los espacios que deja el mensaje
        textpaswword.setErrorEnabled(false);

        if (email.getText().toString().isEmpty()){
            textEmail.setError(getString(R.string.login_text_error_is_empty_email));
            valid = false;
        }
        if (password.getText().toString().isEmpty()) {
            textpaswword.setError(getString(R.string.login_text_error_is_empty_password));
            valid = false;
        }else{
            if(!isEmailValid(email.getText().toString())){
                valid = false;
                textEmail.setError(getString(R.string.login_text_error_is_valid_email));
            }
        }

        return valid;

    }

    private boolean isEmailValid(CharSequence charSequence){
        boolean valid = true;

        if (TextUtils.isEmpty(charSequence)){
            return false;
        }else{
            return Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
        }
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
