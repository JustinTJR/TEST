package com.example.testsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class TestOneResearch extends AppCompatActivity {

    TextView test1Research1, test1Research2, test1Research3, test1Research4, searchText;
    TextView test1Research1Title, test1Research2Title, test1Research3Title, test1Research4Title;
    Button clear, returnSearch;
    public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";

    String[] messages = new String[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_one_research);

        initialWork();
        click();
    }

    public void initialWork(){

        messages[0] = "按太阳穴一段时间后耳鸣即可消失。";
        messages[1] = "张开嘴巴一段时间后耳鸣即可消失。";
        messages[2] = "紧闭眼睛一段时间后耳鸣即可消失。";
        messages[3] = "捏住鼻子一段时间后耳鸣即可消失。";

        Random random = new Random();

        for (int i = 0; i < messages.length; i++) {
            int r1 = random.nextInt(messages.length);

            String index2 = messages[i];
            messages[i] = messages[r1];
            messages[r1] = index2;
        }

        searchText = findViewById(R.id.searchText);
        clear = findViewById(R.id.clear);

        test1Research1 = findViewById(R.id.test1Research1);
        test1Research2 = findViewById(R.id.test1Research2);
        test1Research3 = findViewById(R.id.test1Research3);
        test1Research4 = findViewById(R.id.test1Research4);
        test1Research1Title = findViewById(R.id.test1Research1Title);
        test1Research2Title = findViewById(R.id.test1Research2Title);
        test1Research3Title = findViewById(R.id.test1Research3Title);
        test1Research4Title = findViewById(R.id.test1Research4Title);
        returnSearch = findViewById(R.id.returnSearch);
    }

    public void click(){
        test1Research1.setOnClickListener(view -> {
            Intent intent = new Intent(TestOneResearch.this, TestOneResearchContent.class);
            String message = messages[0];
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        });

        test1Research1Title.setOnClickListener(view -> {
            Intent intent = new Intent(TestOneResearch.this, TestOneResearchContent.class);
            String message = messages[0];
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        });

        test1Research2.setOnClickListener(view -> {
            Intent intent = new Intent(TestOneResearch.this, TestOneResearchContent.class);
            String message = messages[1];
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        });

        test1Research2Title.setOnClickListener(view -> {
            Intent intent = new Intent(TestOneResearch.this, TestOneResearchContent.class);
            String message = messages[1];
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        });

        test1Research3.setOnClickListener(view -> {
            Intent intent = new Intent(TestOneResearch.this, TestOneResearchContent.class);
            String message = messages[2];
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        });

        test1Research3Title.setOnClickListener(view -> {
            Intent intent = new Intent(TestOneResearch.this, TestOneResearchContent.class);
            String message = messages[2];
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        });

        test1Research4.setOnClickListener(view -> {
            Intent intent = new Intent(TestOneResearch.this, TestOneResearchContent.class);
            String message = messages[3];
            intent.putExtra(EXTRA_MESSAGE, message);
            startActivity(intent);
        });

        test1Research4Title.setOnClickListener(view -> {
            Intent intent = new Intent(TestOneResearch.this, TestOneResearchContent.class);
            String message = messages[3];
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