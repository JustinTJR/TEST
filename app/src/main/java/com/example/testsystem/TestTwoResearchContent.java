package com.example.testsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class TestTwoResearchContent extends AppCompatActivity {

    TextView test2ResultContent, user, userColor;
    Button returnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_two_research_content);

        user = findViewById(R.id.user);
        userColor = findViewById(R.id.userColor);
        returnSearch = findViewById(R.id.returnSearch);
        test2ResultContent = findViewById(R.id.test2ResultContent);

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
            case "BLACK":
                user.setText("用户：小红");
                userColor.setBackground(getResources().getDrawable(R.drawable.red));
                test2ResultContent.setText("被开水烫伤是我们生活中常见的受伤，被烫伤后我们应该”涂抹牙膏或者淋酱油后再用针挑破水泡“。");
                break;
            default:
                user.setText("用户：小绿");
                userColor.setBackground(getResources().getDrawable(R.drawable.green));
                test2ResultContent.setText("被开水烫伤是我们生活中常见的受伤，被烫伤后我们应该”用冷水浸泡后再利用碘伏消毒涂抹药膏“。");
                break;
        }
    }
}