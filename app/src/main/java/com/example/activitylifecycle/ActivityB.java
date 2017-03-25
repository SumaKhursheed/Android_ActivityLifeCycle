package com.example.activitylifecycle;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityB extends Activity {

    int CounterVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

    }
    public void startActivityA(View v) {

        CounterVal = Integer.parseInt(getIntent().getExtras().getString("counter"));
        CounterVal++;
        Intent intent = new Intent(ActivityB.this, ActivityA.class);
        intent.putExtra("CounterVal", CounterVal);
        setResult(2, intent);
        finish();

    }
}
