package com.example.rafael.hackturabo;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.EditText;
import android.widget.TextView;

public class Menu extends ActionBarActivity {

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        TextView name = (TextView)findViewById(R.id.name);
        TextView pass = (TextView)findViewById(R.id.id);

        register reg = new register();
        name.setText(" "+register.wUsername);
        pass.setText(register.wID);
    }

}
