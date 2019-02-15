package com.piworks.calc;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

public class screen3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
    }

    public void dogoback(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        Intent i3 = new Intent(this, screen2.class);
        startActivity(i3);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }
    @Override
    public void finish() {
        super.finish();
        Intent ix =  new Intent(this,screen2.class);
        startActivity(ix);
        overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
    }

    public void doexitas(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
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

    public void doemail(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        Intent i4 = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto","devansh299@gmail.com", null));
        startActivity(i4);
    }

    public void docall(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(this, R.anim.onclick_anim) );
        Intent i5 = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:8439781831"));
        startActivity(i5);
    }
}
