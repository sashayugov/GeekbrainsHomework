package com.example.geekbrainshomework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThemeChoose extends AppCompatActivity {

    public static final String CODE = "CODE";
    private int themeCode;
    private static final int MainThemeCode = 1;
    private static final int DarkThemeCode = 2;
    private static final int PurpleThemeCode = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_choose);
        initButtonOk();
        initRadioButtonMain();
        initRadioButtonDark();
        initRadioButtonPurple();
    }

    private void initRadioButtonMain() {
        findViewById(R.id.radioButtonMainTheme).setOnClickListener(v -> {
            themeCode = MainThemeCode;
        });
    }

    private void initRadioButtonDark() {
        findViewById(R.id.radioButtonDarkTheme).setOnClickListener(v -> {
            themeCode = DarkThemeCode;
        });
    }

    private void initRadioButtonPurple() {
        findViewById(R.id.radioButtonPurpleTheme).setOnClickListener(v -> {
            themeCode = PurpleThemeCode;
        });
    }

    private void initButtonOk() {
        findViewById(R.id.button_ok).setOnClickListener(v -> {
            Intent runMainActivity = new Intent(ThemeChoose.this, MainActivity.class);
            runMainActivity.putExtra(CODE, themeCode);
            startActivity(runMainActivity);
            finish();
        });
    }
}