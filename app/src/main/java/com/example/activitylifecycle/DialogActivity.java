package com.example.activitylifecycle;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
//import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;

public class DialogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_dialog);
    }

    public void finishDialog(View v) {
        DialogActivity.this.finish();
    }
}
