package com.nilscreation.calculator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2;
    Button btnAC, btnOff, btnPercent, btnDivide, btnMultiply, btnMinus, btnAdd, btnResult,
            btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnDot;

    float val1;
    float val2 = 0;
    String OPERATOR = "";
    DecimalFormat formatter = new DecimalFormat("#####.#####");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnDot = findViewById(R.id.btnDot);
        btnResult = findViewById(R.id.btnResult);
        btnAC = findViewById(R.id.btnAC);
        btnOff = findViewById(R.id.btnOff);
        btnPercent = findViewById(R.id.btnPercent);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnMinus = findViewById(R.id.btnMinus);
        btnAdd = findViewById(R.id.btnAdd);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(tv2.getText() + "0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setText(tv2.getText() + ".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OPERATOR = "ADDITION";
                if (tv2.length() > 0) {
//                    OPERATOR = "ADDITION";
                    val1 = Float.parseFloat(tv2.getText().toString());
                    tv1.setText(tv2.getText() + "+");
                    tv2.setText("");
                } else {
                    tv1.setText(formatter.format(val1) + "+");
                }
            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OPERATOR = "SUBTRACTION";
                if (tv2.length() > 0) {
                    val1 = Float.parseFloat(tv2.getText().toString());
                    tv1.setText(tv2.getText() + "-");
                    tv2.setText("");
                } else {
                    tv1.setText(formatter.format(val1) + "-");
                }
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OPERATOR = "MULTIPLICATION";
                if (tv2.length() > 0) {
                    val1 = Float.parseFloat(tv2.getText().toString());
                    tv1.setText(tv2.getText() + "x");
                    tv2.setText("");
                } else {
                    tv1.setText(formatter.format(val1) + "x");
                }
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OPERATOR = "DIVISION";
                if (tv2.length() > 0) {
                    val1 = Float.parseFloat(tv2.getText().toString());
                    tv1.setText(tv2.getText() + "÷");
                    tv2.setText("");
                } else {
                    tv1.setText(formatter.format(val1) + "÷");
                }
            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OPERATOR = "PERCENT";
                if (tv2.length() > 0) {
                    val1 = Float.parseFloat(tv2.getText().toString());
                    tv1.setText(tv2.getText() + "%");
                    tv2.setText("" + (formatter.format(val1 / 100)));
                }
            }
        });
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (OPERATOR == "ADDITION") {
                    val2 = Float.parseFloat(tv2.getText().toString());
                    float result = (val1 + val2);
                    tv1.setText(formatter.format(val1) + "+" + formatter.format(val2));
                    tv2.setText(formatter.format(result));
                } else if (OPERATOR == "SUBTRACTION") {
                    val2 = Float.parseFloat(tv2.getText().toString());
                    float result = (val1 - val2);
                    tv1.setText(formatter.format(val1) + "-" + formatter.format(val2));
                    tv2.setText(formatter.format(result));
                } else if (OPERATOR == "MULTIPLICATION") {
                    val2 = Float.parseFloat(tv2.getText().toString());
                    float result = (val1 * val2);
                    tv1.setText(formatter.format(val1) + "x" + formatter.format(val2));
                    tv2.setText(formatter.format(result));
                } else if (OPERATOR == "DIVISION") {
                    val2 = Float.parseFloat(tv2.getText().toString());
                    float result = (val1 / val2);
                    tv1.setText(formatter.format(val1) + "÷" + formatter.format(val2));
                    tv2.setText(formatter.format(result));
                } else if (OPERATOR == "DIVISION") {
                    val2 = Float.parseFloat(tv2.getText().toString());
                    float result = (val1 / val2);
                    tv1.setText(formatter.format(val1) + "÷" + formatter.format(val2));
                    tv2.setText(formatter.format(result));
                }
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv1.setText("");
                tv2.setText("");
                OPERATOR = "";
            }
        });

        btnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exitDialog();
            }
        });

    }

    @Override
    public void onBackPressed() {
        exitDialog();
    }

    private void exitDialog() {
        AlertDialog.Builder exit = new AlertDialog.Builder(MainActivity.this);
        exit.setTitle("Exit");
        exit.setMessage("Do you really want to Exit?");
        exit.setIcon(R.drawable.logo);
        exit.setCancelable(false);

        exit.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        exit.show();
    }
}