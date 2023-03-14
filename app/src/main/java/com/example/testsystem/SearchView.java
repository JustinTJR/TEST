package com.example.testsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SearchView extends AppCompatActivity {

    Button search;

    EditText searchText;

    String goToMessage;

    public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_view);

        search = findViewById(R.id.search);
        searchText = findViewById(R.id.searchText);

        Intent intent = getIntent();
        goToMessage = intent.getStringExtra(MainActivity.TEST_MESSAGE);

        switch (goToMessage) {
            case "testOne":
                searchText.setText("  如何快速消除耳鸣");
                break;
            case "testTwo":
                searchText.setText("  被开水烫伤怎么办");
                break;
            case "testThree_One":
                searchText.setText("  被蜜蜂蛰了怎么办");
                break;
            case "testThree_Two":
                searchText.setText("  被毒蛇咬了怎么办");
                break;
            case "testThree_Three":
                searchText.setText("  被蝎子蛰了怎么办");
                break;
            default:
                searchText.setText("error");
                break;
        }

        click();
    }

    public void click(){
        search.setOnClickListener(view -> {
            Intent intent;
            String message;
            switch (goToMessage) {
                case "testOne":
                    intent = new Intent(SearchView.this, TestOneResearch.class);
                    break;
                case "testTwo":
                    intent = new Intent(SearchView.this, TestTwoResearch.class);
                    break;
                case "testThree_One":
                    intent = new Intent(SearchView.this, TestThreeResearch.class);
                    message = "testThree_One";
                    intent.putExtra(EXTRA_MESSAGE, message);
                    break;
                case "testThree_Two":
                    intent = new Intent(SearchView.this, TestThreeResearch.class);
                    message = "testThree_Two";
                    intent.putExtra(EXTRA_MESSAGE, message);
                    break;
                default:
                    intent = new Intent(SearchView.this, TestThreeResearch.class);
                    message = "testThree_Three";
                    intent.putExtra(EXTRA_MESSAGE, message);
                    break;
            }
            startActivity(intent);
        });
    }
}