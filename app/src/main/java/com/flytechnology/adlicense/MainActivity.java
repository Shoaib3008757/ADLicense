package com.flytechnology.adlicense;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     TextView tvRegister, tvConsulting;
    EditText etUsername, etPassword;
    Button btLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        regisgerTextClickLister();
        consultingScreen();
        buttonLoginHandler();
    }

   public void init(){
        tvRegister = (TextView) findViewById(R.id.tv_register);
       tvConsulting = (TextView) findViewById(R.id.tv_consulting);
       etUsername = (EditText) findViewById(R.id.et_username);
       etPassword = (EditText) findViewById(R.id.et_password);

       btLogin = (Button) findViewById(R.id.bt_login);


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

    }//end of init

    public void regisgerTextClickLister(){

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent registerActivity = new Intent(MainActivity.this, SignUp.class);
                startActivity(registerActivity);

            }
        });
    }

    //consulting
    public void consultingScreen(){

        tvConsulting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent consulting = new Intent(MainActivity.this, Consulting.class);
                startActivity(consulting);
            }
        });
    }

    //login button click
    public void buttonLoginHandler(){
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent dashboard = new Intent(MainActivity.this, DashboardScreen.class);
                startActivity(dashboard);
            }
        });
    }
}
