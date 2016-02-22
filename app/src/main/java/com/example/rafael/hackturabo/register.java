package com.example.rafael.hackturabo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends ActionBarActivity {
    public static String wUsername, wPass, wID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button register = (Button)findViewById(R.id.btnRegister);
        register.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        String Invalid_ID = "S00111111";
                        String s_id, s_username = "", s_password = "";
                        String re_password;
                        EditText id = (EditText)findViewById(R.id.txtID);
                        EditText username = (EditText)findViewById(R.id.txtUser);
                        EditText password = (EditText)findViewById(R.id.txtPass);
                        EditText re_type = (EditText)findViewById(R.id.txtRePass);
                        s_id = id.getText().toString();
                        if (!(s_id.equals(Invalid_ID))) {
                            s_password = password.getText().toString();
                            re_password = re_type.getText().toString();
                            if (s_password.equals(re_password)) {
                                s_username = username.getText().toString();
                                startActivity(new Intent(register.this, MainActivity.class));
                            } else {
                                Toast.makeText(getApplicationContext(), "Passwords don't match!", Toast.LENGTH_LONG).show();
                            }
                        } else {
                            Toast.makeText(getApplicationContext(), "ID is already in use!", Toast.LENGTH_LONG).show();
                        }
                        wUsername = s_username;
                        wPass = s_password;
                        wID = s_id;
                    }
                }
        );
    }

}
