package com.example.testsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button test1, test2, test3_1, test3_2, test3_3;

    public static final String TEST_MESSAGE = "TEST_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialWork();
        click();
    }

    public void initialWork() {

        test1 = findViewById(R.id.test1);
        test2 = findViewById(R.id.test2);
        test3_1 = findViewById(R.id.test3_1);
        test3_2 = findViewById(R.id.test3_2);
        test3_3 = findViewById(R.id.test3_3);
    }

    public void click(){
        test1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SearchView.class);
            String message = "testOne";
            intent.putExtra(TEST_MESSAGE, message);
            startActivity(intent);
        });

        test2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SearchView.class);
            String message = "testTwo";
            intent.putExtra(TEST_MESSAGE, message);
            startActivity(intent);
        });

        test3_1.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SearchView.class);
            String message = "testThree_One";
            intent.putExtra(TEST_MESSAGE, message);
            startActivity(intent);
        });

        test3_2.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SearchView.class);
            String message = "testThree_Two";
            intent.putExtra(TEST_MESSAGE, message);
            startActivity(intent);
        });

        test3_3.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, SearchView.class);
            String message = "testThree_Three";
            intent.putExtra(TEST_MESSAGE, message);
            startActivity(intent);
        });
    }
}