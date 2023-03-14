package com.example.testsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class TestThreeResearch extends AppCompatActivity {

    TextView searchText, user1Color, user2Color, user1, user2, user1Answer, user2Answer;
    Button clear, returnSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_three_research);

        initialWork();
        click();
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    public void initialWork(){
        searchText = findViewById(R.id.searchText);
        clear = findViewById(R.id.clear);
        returnSearch = findViewById(R.id.returnSearch);
        user1Color = findViewById(R.id.user1Color);
        user2Color = findViewById(R.id.user2Color);
        user1 = findViewById(R.id.user1);
        user2 = findViewById(R.id.user2);

        Random random = new Random();
        String[] messages = new String[2];
        messages[0] = "把毒针拔出后，首先利用酒精消毒，然后用冰冷敷，最后涂上维生素A软膏。";
        messages[1] = "把毒针拔出后，首先利用碘伏消毒，然后用水冲洗，最后涂上维生素B软膏。";

        for (int i = 0; i < messages.length; i++) {
            int r1 = random.nextInt(messages.length);

            String index2 = messages[i];
            messages[i] = messages[r1];
            messages[r1] = index2;
        }

        user1Answer = findViewById(R.id.user1Answer);
        user2Answer = findViewById(R.id.user2Answer);

        Intent intent = getIntent();
        String message = intent.getStringExtra(TestOneResearch.EXTRA_MESSAGE);

        switch (message) {
            case "testThree_One":
                searchText.setText("  被蜜蜂蛰了怎么办");
                user1.setText("用户：小黄");
                user1Color.setBackground(getResources().getDrawable(R.drawable.yellow));
                user1Answer.setText("用镊子拔除蜜蜂毒刺后用肥皂水中和毒液。");
                user2.setText("用户：小青");
                user2Color.setBackground(getResources().getDrawable(R.drawable.qing));
                user2Answer.setText("用手拔除密蜂毒刺后用牛奶中和毒液。");
                break;
            case "testThree_Two":
                searchText.setText("  被毒蛇咬了怎么办");
                user1.setText("用户：小青");
                user1Color.setBackground(getResources().getDrawable(R.drawable.qing));
                user1Answer.setText("用嘴吸出毒液后立刻泡向救护站。");
                user2.setText("用户：小黄");
                user2Color.setBackground(getResources().getDrawable(R.drawable.yellow));
                user2Answer.setText("拨打急救电话后在伤口近心端处绑扎。");
                break;
            default:
                searchText.setText("  被蝎子蛰了怎么办");
                user1.setText("用户：小黄");
                user1Color.setBackground(getResources().getDrawable(R.drawable.yellow));
                user1Answer.setText(messages[0]);
                user2.setText("用户：小青");
                user2Color.setBackground(getResources().getDrawable(R.drawable.qing));
                user2Answer.setText(messages[1]);
                break;
        }

    }

    public void click(){
        clear.setOnClickListener(view -> {
            searchText.setText("");
            searchText.setHint("  请输入搜索内容");
        });

        returnSearch.setOnClickListener(view -> {
            finish();
        });
    }
}