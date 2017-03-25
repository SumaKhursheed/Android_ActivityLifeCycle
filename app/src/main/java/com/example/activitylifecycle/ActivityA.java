package com.example.activitylifecycle;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
//import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.AlertDialogLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityA extends Activity {

    TextView showValue;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        showValue = (TextView) findViewById(R.id.counterValue);
    }

    public void startActivityB(View v) {
        showValue.setText(Integer.toString(counter));
        counter++;
        Intent intent = new Intent(ActivityA.this, ActivityB.class);
        intent.putExtra("counter", showValue.getText().toString());
        startActivityForResult(intent, 2);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 2) {
            if (resultCode == RESULT_OK) {
                if(data != null) {
                    counter = Integer.parseInt(data.getStringExtra("CounterVal"));
                    counter++;
                    showValue.setText(Integer.toString(counter));
                }
            }
        }
    }

    public void onClickButtonCloseApp(View v) {
        this.finish();
    }

    public void startDialog(View v) {
        counter++;
        Intent intent = new Intent(ActivityA.this, DialogActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
            counter++;
            showValue.setText(Integer.toString(counter));
    }
}
