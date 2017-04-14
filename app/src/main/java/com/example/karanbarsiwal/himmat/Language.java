package com.example.karanbarsiwal.himmat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.cengalabs.flatui.FlatUI;

public class Language extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        FlatUI.initDefaultValues(this);
        Button hindi = (Button)findViewById(R.id.hindi);
        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Language.this, Helper.class);
                startActivity(i);
                finish();
            }
        });
    }
}
