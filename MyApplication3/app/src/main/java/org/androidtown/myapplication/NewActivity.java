package org.androidtown.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
public class NewActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        Intent passedIntent=getIntent();
       if(passedIntent!=null) {
           String outName = passedIntent.getStringExtra("name");
           String outAge = passedIntent.getStringExtra("age");
           Toast.makeText(getApplicationContext(), "Student info:" + outName + "," + outAge, Toast.LENGTH_LONG).show();
       }
           Button button0 = (Button) findViewById(R.id.button0);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                finish();
            }
        });
    }
}