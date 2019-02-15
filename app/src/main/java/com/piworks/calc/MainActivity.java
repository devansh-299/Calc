package com.piworks.calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public void finish() {
        super.finish();
        moveTaskToBack(true);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }

    public void dosomething1(View view) {
        Intent i1 = new Intent(this , screen2.class);
        startActivity(i1);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

    }
}
