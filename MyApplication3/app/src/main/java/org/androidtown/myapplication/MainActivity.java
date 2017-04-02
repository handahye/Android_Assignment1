package org.androidtown.myapplication;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Name;
    EditText Age;
    Button button1;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        Name = (EditText) findViewById(R.id.editText1);
        Age = (EditText) findViewById(R.id.editText2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                String name = Name.getText().toString();
                String age = Age.getText().toString();
                Intent intent = new Intent (getApplicationContext(), NewActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("age", age);
                startActivity(intent);
            }
        });
    }


}