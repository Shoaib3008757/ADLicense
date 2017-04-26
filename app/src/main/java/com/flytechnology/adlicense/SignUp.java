package com.flytechnology.adlicense;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    EditText etUsername, etPassword, etEmail, etAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        init();
    }

    public void init(){

        etUsername = (EditText) findViewById(R.id.et_username);
        etPassword = (EditText) findViewById(R.id.et_password);
        etEmail = (EditText) findViewById(R.id.et_email);
        etAge = (EditText) findViewById(R.id.et_age);

        editTextLineColor();
    }

    public void editTextLineColor(){

        Drawable drawable = etUsername.getBackground(); // get current EditText drawable
        drawable.setColorFilter(ContextCompat.getColor(this, R.color.linecolor), PorterDuff.Mode.SRC_ATOP); // change the drawable color

        if(Build.VERSION.SDK_INT > 16) {
            etUsername.setBackground(drawable); // set the new drawable to EditText
        }else{
            etUsername.setBackgroundDrawable(drawable); // use setBackgroundDrawable because setBackground required API 16
        }

        Drawable drawable1 = etPassword.getBackground(); // get current EditText drawable
        drawable.setColorFilter(ContextCompat.getColor(this, R.color.linecolor), PorterDuff.Mode.SRC_ATOP); // change the drawable color

        if(Build.VERSION.SDK_INT > 16) {
            etPassword.setBackground(drawable); // set the new drawable to EditText
        }else{
            etPassword.setBackgroundDrawable(drawable1); // use setBackgroundDrawable because setBackground required API 16
        }


        Drawable drawable3 = etEmail.getBackground(); // get current EditText drawable
        drawable.setColorFilter(ContextCompat.getColor(this, R.color.linecolor), PorterDuff.Mode.SRC_ATOP); // change the drawable color

        if(Build.VERSION.SDK_INT > 16) {
            etEmail.setBackground(drawable); // set the new drawable to EditText
        }else{
            etEmail.setBackgroundDrawable(drawable3); // use setBackgroundDrawable because setBackground required API 16
        }

        Drawable drawable4 = etAge.getBackground(); // get current EditText drawable
        drawable.setColorFilter(ContextCompat.getColor(this, R.color.linecolor), PorterDuff.Mode.SRC_ATOP); // change the drawable color

        if(Build.VERSION.SDK_INT > 16) {
            etAge.setBackground(drawable); // set the new drawable to EditText
        }else{
            etAge.setBackgroundDrawable(drawable4); // use setBackgroundDrawable because setBackground required API 16
        }
    }
}
