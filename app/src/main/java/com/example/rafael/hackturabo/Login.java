package com.example.rafael.hackturabo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends ActionBarActivity {

    register getRegister = new register();
    String allowed_user = getRegister.wUsername;
    String allowed_password = getRegister.wPass;
    String allowed_ID = getRegister.wID;
    public static Boolean signinFlag = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        Button btnLogin = (Button)findViewById(R.id.loginBtn);
        btnLogin.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        EditText logUsername = (EditText)findViewById(R.id.txtUsername);
                        EditText logPassword = (EditText)findViewById(R.id.txtPassword);
                        String user = logUsername.getText().toString();
                        String pass = logPassword.getText().toString();
                        if(user.equals(allowed_user)&&pass.equals(allowed_password)) {
                            signinFlag = true;
                            startActivity(new Intent(Login.this, Home.class));
                        }
                        else
                         Toast.makeText(getApplicationContext(), "Invalid credentials!", Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

}
