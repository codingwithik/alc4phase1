package com.ik.umeh.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button about;
    private Button profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        about = findViewById(R.id.about_alc);
        profile = findViewById(R.id.my_profile);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // intent to about activity
                Intent intent = new Intent(getApplicationContext(), AboutALC.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // intent to profile activity
                Intent intent = new Intent(getApplicationContext(), MyProfile.class);
                startActivity(intent);
            }
        });
    }
}
