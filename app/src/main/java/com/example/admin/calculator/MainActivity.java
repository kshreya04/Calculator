package com.example.admin.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bmul, bdiv, bmod, bc, bdel, bequal, bdot;
    TextView ans;
    double var1, var2;
    boolean add, sub, mul, div, mod;
    String str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = (Button) findViewById(R.id.buttonZero);
        b1 = (Button) findViewById(R.id.buttonOne);
        b2 = (Button) findViewById(R.id.buttonTwo);
        b3 = (Button) findViewById(R.id.buttonThree);
        b4 = (Button) findViewById(R.id.buttonFour);
        b5 = (Button) findViewById(R.id.buttonFive);
        b6 = (Button) findViewById(R.id.buttonSix);
        b7 = (Button) findViewById(R.id.buttonSeven);
        b8 = (Button) findViewById(R.id.buttonEight);
        b9 = (Button) findViewById(R.id.buttonNine);
        badd = (Button) findViewById(R.id.buttonAdd);
        bsub = (Button) findViewById(R.id.buttonSubtract);
        bmul = (Button) findViewById(R.id.buttonMultiply);
        bdiv = (Button) findViewById(R.id.buttonDivide);
        bmod = (Button) findViewById(R.id.buttonMod);
        bc = (Button) findViewById(R.id.buttonClear);
        bdot = (Button) findViewById(R.id.buttonDot);
        bequal = (Button) findViewById(R.id.buttonEqual);
        bdel = (Button) findViewById(R.id.buttonDel);

        ans = (TextView) findViewById(R.id.editText2);

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText("");

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + "0");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(ans.getText() + "");
                add = true;
                ans.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(ans.getText() + "");
                mul = true;
                ans.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(ans.getText() + "");
                div = true;
                ans.setText(null);
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(ans.getText() + "");
                sub = true;
                ans.setText(null);
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText() + ".");
            }
        });
        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(ans.getText() + "");
                mod = true;
                ans.setText(null);
            }
        });
        bdel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str = ans.getText().toString();
                if (str.length() > 0) {
                    str = str.substring(0, str.length() - 1);
                    ans.setText(str);
                }
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(ans.getText() + "");
                if (add == true) {
                    ans.setText(var1 + var2 + "");
                    add = false;
                }
                if (mul == true) {
                    ans.setText(var1 * var2 + "");
                    mul = false;
                }
                if (div == true) {
                    ans.setText(var1 / var2 + "");
                    div = false;
                }
                if (sub == true) {
                    ans.setText(var1 - var2 + "");
                    sub = false;
                }
                if (mod == true) {
                    ans.setText(var1 % var2 + "");
                    mod = false;
                }
            }

        });


    }


}