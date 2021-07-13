package com.example.geekbrainshomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private Calculator calculator;
    private final static String keyCalculator = "Calculator";

    @Override
    public void onSaveInstanceState(@NonNull Bundle instanceState) {
        super.onSaveInstanceState(instanceState);
        instanceState.putParcelable(keyCalculator, calculator);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle instanceState) {
        super.onRestoreInstanceState(instanceState);
        calculator = instanceState.getParcelable(keyCalculator);
        display.setText(calculator.getDisplay());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculator = new Calculator();
        initView();
    }

    private void initView() {
        display = findViewById(R.id.display);
        initButton1ClickListener();
        initButton2ClickListener();
        initButton3ClickListener();
        initButton4ClickListener();
        initButton5ClickListener();
        initButton6ClickListener();
        initButton7ClickListener();
        initButton8ClickListener();
        initButton9ClickListener();
        initButton0ClickListener();
        initButtonPointClickListener();
        initButtonCClickListener();
        initButtonDivClickListener();
        initButtonMulClickListener();
        initButtonSubClickListener();
        initButtonAddClickListener();
        initButtonEqClickListener();
    }

    private void initButtonCClickListener() {
        Button buttonC = findViewById(R.id.button_c);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.setValue("");
                calculator.setDisplay("");
                display.setText(calculator.getDisplay());
            }
        });
    }

    private void initButtonDivClickListener() {
        Button buttonDiv = findViewById(R.id.button_div);
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.doFirstNumber();
                calculator.setValue("");
                calculator.setTodo("/");
                calculator.doDisplayValue("/");
                display.setText(calculator.getDisplay());
            }
        });
    }

    private void initButtonMulClickListener() {
        Button buttonMul = findViewById(R.id.button_mul);
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.doFirstNumber();
                calculator.setValue("");
                calculator.setTodo("*");
                calculator.doDisplayValue("*");
                display.setText(calculator.getDisplay());
            }
        });
    }

    private void initButtonSubClickListener() {
        Button buttonSub = findViewById(R.id.button_sub);
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.doFirstNumber();
                calculator.setValue("");
                calculator.setTodo("-");
                calculator.doDisplayValue("-");
                display.setText(calculator.getDisplay());
            }
        });
    }

    private void initButtonAddClickListener() {
        Button buttonAdd = findViewById(R.id.button_add);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.doFirstNumber();
                calculator.setValue("");
                calculator.setTodo("+");
                calculator.doDisplayValue("+");
                display.setText(calculator.getDisplay());
            }
        });
    }

    private void initButtonEqClickListener() {
        Button buttonEq = findViewById(R.id.button_eq);
        buttonEq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.doSecondNumber();
                calculator.setValue("");
                calculator.doCalculate();
                calculator.doPrepareDisplayValue();
                display.setText(calculator.getDisplay());
                calculator.setResponse(0.0);
                calculator.setTodo("");
            }
        });
    }

    private void initButton1ClickListener() {
        Button button1 = findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.doValue("1");
                calculator.doDisplayValue("1");
                display.setText(calculator.getDisplay());
            }
        });
    }

    private void initButton2ClickListener() {
        Button button2 = findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.doValue("2");
                calculator.doDisplayValue("2");
                display.setText(calculator.getDisplay());
            }
        });
    }

    private void initButton3ClickListener() {
        Button button3 = findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.doValue("3");
                calculator.doDisplayValue("3");
                display.setText(calculator.getDisplay());
            }
        });
    }

    private void initButton4ClickListener() {
        Button button4 = findViewById(R.id.button_4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.doValue("4");
                calculator.doDisplayValue("4");
                display.setText(calculator.getDisplay());
            }
        });
    }

    private void initButton5ClickListener() {
        Button button5 = findViewById(R.id.button_5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.doValue("5");
                calculator.doDisplayValue("5");
                display.setText(calculator.getDisplay());
            }
        });
    }

    private void initButton6ClickListener() {
        Button button6 = findViewById(R.id.button_6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.doValue("6");
                calculator.doDisplayValue("6");
                display.setText(calculator.getDisplay());
            }
        });
    }

    private void initButton7ClickListener() {
        Button button7 = findViewById(R.id.button_7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.doValue("7");
                calculator.doDisplayValue("7");
                display.setText(calculator.getDisplay());
            }
        });
    }

    private void initButton8ClickListener() {
        Button button8 = findViewById(R.id.button_8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.doValue("8");
                calculator.doDisplayValue("8");
                display.setText(calculator.getDisplay());
            }
        });
    }

    private void initButton9ClickListener() {
        Button button9 = findViewById(R.id.button_9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.doValue("9");
                calculator.doDisplayValue("9");
                display.setText(calculator.getDisplay());
            }
        });
    }

    private void initButton0ClickListener() {
        Button button0 = findViewById(R.id.button_0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.doValue("0");
                calculator.doDisplayValue("0");
                display.setText(calculator.getDisplay());
            }
        });
    }

    private void initButtonPointClickListener() {
        Button buttonPoint = findViewById(R.id.button_point);
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator.doValue(".");
                calculator.doDisplayValue(",");
                display.setText(calculator.getDisplay());
            }
        });
    }

}