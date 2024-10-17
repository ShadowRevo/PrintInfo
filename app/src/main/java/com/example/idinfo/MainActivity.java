package com.example.idinfo;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView text1,text2;
    EditText et1,et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.dateTextView);
        text2 = findViewById(R.id.infoTextView);
        et1 = findViewById(R.id.nameEditText);
        et2 = findViewById(R.id.yearBornEditText);
    }
    private void agree (){
        String name,BornYear;
        name = et1.getText().toString();
        BornYear = et2.getText().toString();
        int y=Integer.parseInt(BornYear);
        int age =2024-y;
        print("Welcome "+name+" you are "+age+" years old");
    }

    private void print(String s) {

    }
}