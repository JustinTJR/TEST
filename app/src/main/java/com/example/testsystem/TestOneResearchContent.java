package com.example.testsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class TestOneResearchContent extends AppCompatActivity {

    TextView test1ResultContent, user, userColor;
    Button returnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_one_research_content);

        user = findViewById(R.id.user);
        userColor = findViewById(R.id.userColor);
        returnSearch = findViewById(R.id.returnSearch);
        test1ResultContent = findViewById(R.id.test1ResultContent);

        initialMessage();

        returnSearch.setOnClickListener(view -> {
            finish();
        });
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    private void initialMessage() {
        Intent intent = getIntent();
        String message = intent.getStringExtra(TestOneResearch.EXTRA_MESSAGE);

        switch (message) {
            case "按太阳穴一段时间后耳鸣即可消失。":
                user.setText("用户：小粉");
                userColor.setBackground(getResources().getDrawable(R.drawable.pink));
                test1ResultContent.setText("按太阳穴一段时间后耳鸣即可消失。");
                break;
            case "张开嘴巴一段时间后耳鸣即可消失。":
                user.setText("用户：小橙");
                userColor.setBackground(getResources().getDrawable(R.drawable.orange));
                test1ResultContent.setText("张开嘴巴一段时间后耳鸣即可消失。");
                break;
            case "紧闭眼睛一段时间后耳鸣即可消失。":
                user.setText("用户：小紫");
                userColor.setBackground(getResources().getDrawable(R.drawable.purple));
                test1ResultContent.setText("紧闭眼睛一段时间后耳鸣即可消失");
                break;
            default:
                user.setText("用户：小蓝");
                userColor.setBackground(getResources().getDrawable(R.drawable.blue));
                test1ResultContent.setText("捏住鼻子一段时间后耳鸣即可消失。");
                break;
        }
    }
}