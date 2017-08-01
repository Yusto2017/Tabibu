package com.example.swee.tabibu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.swee.tabibu.R.styleable.View;

public class MainActivity extends AppCompatActivity implements android.view.View.OnClickListener {
private Button btnlogin,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

btnlogin=(Button)findViewById(R.id.lgin);
signup=(Button)findViewById(R.id.sgnup);
        btnlogin.setOnClickListener(this);
        signup.setOnClickListener(this);
    }

    public void goToSignup (){
        Intent intent = new Intent(this, Signup.class);
        startActivity(intent);
    }

    public void goToLoginActivity (){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }


    @Override
    public void onClick(View v) {
        if(v==btnlogin)
        {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
        }else if(v==signup)

        {
            Intent intent = new Intent(this, Signup.class);
            startActivity(intent);
        }
    }
}
