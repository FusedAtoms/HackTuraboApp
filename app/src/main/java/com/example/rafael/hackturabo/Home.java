package com.example.rafael.hackturabo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class Home extends ActionBarActivity {
    Login login = new Login();
    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);

        ImageButton btnFB = (ImageButton)findViewById(R.id.fb);
        ImageButton btnPR = (ImageButton)findViewById(R.id.pr);
        ImageButton btnTW = (ImageButton)findViewById(R.id.tw);
        ImageButton btnHT = (ImageButton)findViewById(R.id.ht);
        ImageButton btnQR = (ImageButton)findViewById(R.id.qrBtn);
        ImageButton btnNews = (ImageButton)findViewById(R.id.news);
        ImageButton btnCal = (ImageButton)findViewById(R.id.calendar);
        ImageButton btnProj = (ImageButton)findViewById(R.id.project);
        ImageButton btnHelp = (ImageButton)findViewById(R.id.helpful);
        ImageButton btnSign = (ImageButton)findViewById(R.id.sign_in);



        btnQR.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        if(login.signinFlag)
                            startActivity(new Intent(Home.this, QR_Code.class));
                        else
                            Toast.makeText(getApplicationContext(), "You must be signed in!", Toast.LENGTH_LONG).show();
                    }
                }
        );
        btnSign.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        startActivity(new Intent(Home.this, MainActivity.class));
                    }
                }
        );
        btnNews.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        startActivity(new Intent(Home.this, News.class));
                    }
                }
        );
        btnCal.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        startActivity(new Intent(Home.this, Calendar.class));
                    }
                }
        );
        btnProj.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        startActivity(new Intent(Home.this, Projects.class));
                    }
                }
        );
        btnHelp.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        startActivity(new Intent(Home.this, HelpfulLinks.class));
                    }
                }
        );

        btnFB.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.facebook.com/HackTurabo/"));
                        startActivity(intent);
                    }
                });
        btnPR.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://www.periscope.tv/HackTurabo"));
                        startActivity(intent);
                    }
                });
        btnTW.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("https://twitter.com/HackTurabo"));
                        startActivity(intent);
                    }
                });
        btnHT.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("http://www.hackturabo.com/"));
                        startActivity(intent);
                    }
                });
    }
}
