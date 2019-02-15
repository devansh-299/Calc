package com.piworks.calc;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.*;

import static com.piworks.calc.R.anim.onclick_anim;
import static com.piworks.calc.R.anim.slide_in_left;
import static com.piworks.calc.R.anim.slide_in_right;
import static com.piworks.calc.R.anim.slide_out_left;

public class screen2 extends AppCompatActivity {
    String result=  "" ;
    TextView resultwindow;  /// #compact
    Double resultfinal ;
    String resultfinalstring;
    Button deletebutton;
    String emptystring ="";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        /*
         final Intent i2  = new Intent(this , screen3.class);
        rb2 = (RadioButton)findViewById(R.id.trigonometric);
        rb2.setOnClickListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
              startActivity(i2);
            }
        });

        */


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return true;
    }

    public void fnc1(View view) {
        result = result +1 ;
        resultwindow = (TextView)findViewById(R.id.resultwindow);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        resultwindow.setText(result);
    }

    public void fnc2(View view) {
        result = result +2 ;
        resultwindow = (TextView)findViewById(R.id.resultwindow);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        resultwindow.setText(result);
    }

    @Override
    public void finish() {
        super.finish();
        Intent iy = new Intent(this, MainActivity.class);
        startActivity(iy);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }

    @SuppressLint("ResourceType")
    public void fnc3(View view) {
        result = result+3 ;
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        resultwindow = (TextView)findViewById(R.id.resultwindow);

        resultwindow.setText(result);
    }

    public void fnc4(View view) {
        result= result+4;
        resultwindow = (TextView)findViewById(R.id.resultwindow);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        resultwindow.setText(result);
    }

    public void fnc5(View view) {
        result= result+5;
        resultwindow = (TextView)findViewById(R.id.resultwindow);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        resultwindow.setText(result);
    }

    public void fnc6(View view) {
        result= result+6;
        resultwindow = (TextView)findViewById(R.id.resultwindow);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        resultwindow.setText(result);
    }

    public void fnc7(View view) {
        result= result+7;
        resultwindow = (TextView)findViewById(R.id.resultwindow);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        resultwindow.setText(result);
    }

    public void fnc8(View view) {
        result= result+8;
        resultwindow = (TextView)findViewById(R.id.resultwindow);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        resultwindow.setText(result);
    }

    public void fnc9(View view) {
        result= result+9;
        resultwindow = (TextView)findViewById(R.id.resultwindow);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        resultwindow.setText(result);
    }

    public void fncbracketopen(View view) {
        result =result + "(";
        resultwindow = (TextView)findViewById(R.id.resultwindow);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        resultwindow.setText(result);
    }

    public void fncbracketclose(View view) {
        result= result + ")";
        resultwindow = (TextView)findViewById(R.id.resultwindow);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        resultwindow.setText(result);
    }

    public void fncraisedtopower(View view) {
        result= result + "^";
        resultwindow = (TextView)findViewById(R.id.resultwindow);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        resultwindow.setText(result);
    }

    public void fncmult(View view) {
        result= result + "*";
        resultwindow = (TextView)findViewById(R.id.resultwindow);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        resultwindow.setText(result);
    }

    public void fncdiv(View view) {
        result= result + "/";
        resultwindow = (TextView)findViewById(R.id.resultwindow);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        resultwindow.setText(result);
    }

    public void fncsubs(View view) {
        result= result + "-";
        resultwindow = (TextView)findViewById(R.id.resultwindow);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        resultwindow.setText(result);
    }

    public void fncadd(View view) {
        result= result + "+";
        resultwindow = (TextView)findViewById(R.id.resultwindow);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        resultwindow.setText(result);
    }

    public void fncdel(View view) {
        deletebutton = (Button)findViewById(R.id.del);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        StringBuilder  tempresult = new StringBuilder(result);
        if (tempresult.length() >=1){
            tempresult.deleteCharAt(result.length()-1);     // compact variable
        }
        else {
            Toast.makeText(this, "cannot delete!", Toast.LENGTH_SHORT).show();
        }
        result= tempresult.toString();
        resultwindow = (TextView)findViewById(R.id.resultwindow);                //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        resultwindow.setText(result);
        deletebutton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                result = emptystring;
                resultwindow.setText(result);////
                return true;
            }
        });

        resultwindow.setText(result);
    }
    //////////////////////////////////////

    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch);
                }

                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }
        }.parse();
    }

//////////////////////////////////////////////////
    public void calculate1(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        try{resultwindow = (TextView)findViewById(R.id.resultwindow);

        resultfinal = eval(result);
        resultfinalstring = Double.toString(resultfinal);
        result = resultfinalstring;
        resultwindow.setText(resultfinalstring);}
        catch (Exception e){
            resultwindow.setText("Error!");       // for error symbol
        }


    }

    public void doinfo(MenuItem item) {
        Intent i2 = new Intent(this, screen3.class);
        startActivity(i2);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
    }
    public void doexit(MenuItem item) {
        final AlertDialog.Builder a1 = new AlertDialog.Builder(this);
        a1.setTitle("Exit");
        a1.setMessage("Are you Sure?");
        a1.setPositiveButton("Yes" , new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        moveTaskToBack(true);
                    }
                }


        );
        a1.setNegativeButton("No" , new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        a1.show();
        a1.setCancelable(false);
    }

    public void fncdot(View view) {
        result = result + ".";
        resultwindow = (TextView)findViewById(R.id.resultwindow);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        resultwindow.setText(result);
    }

    public void fnc0(View view) {
        result = result + 0 ;
        resultwindow = (TextView)findViewById(R.id.resultwindow);
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        resultwindow.setText(result);
    }

}
