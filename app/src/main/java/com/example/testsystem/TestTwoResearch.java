package com.example.testsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class TestTwoResearch extends AppCompatActivity {

    TextView test2Research1, test2Research2, searchText, test2Research1Title, test2Research2Title;
    Button clear, returnSearch;
    public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_two_research);

        initialWork();
        click();
    }

    public void initialWork(){


        searchText = findViewById(R.id.searchText);
        clear = findViewById(R.id.clear);

        test2Research1 = findViewById(R.id.test2Research1);
        test2Research2 = findViewById(R.id.test2Research2);

        test2Research1Title = findViewById(R.id.test2Research1Title);
        test2Research2Title = findViewById(R.id.test2Research2Title);

        returnSearch = findViewById(R.id.returnSearch);
    }

    public void click(){
        test2Research1.setOnClickListener(view -> {
            Intent intent = new Intent(TestTwoResearch.this, TestTwoResearchContent.class);
            String message = "BLACK";
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        });

        test2Research1Title.setOnClickListener(view -> {
            Intent intent = new Intent(TestTwoResearch.this, TestTwoResearchContent.class);
            String message = "BLACK";
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        });

        test2Research2.setOnClickListener(view -> {
            Intent intent = new Intent(TestTwoResearch.this, TestTwoResearchContent.class);
            String message = "WHITE";
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        });

        test2Research2Title.setOnClickListener(view -> {
            Intent intent = new Intent(TestTwoResearch.this, TestTwoResearchContent.class);
            String message = "WHITE";
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        });


        clear.setOnClickListener(view -> {
            searchText.setText("");
            searchText.setHint("  请输入搜索内容");
        });

        returnSearch.setOnClickListener(view -> {
            finish();
        });
    }
}