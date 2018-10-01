package com.resuce102.codeslayers.resuce102;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class FormActivity extends AppCompatActivity
{

    private static final String TAG = "FormActivity";

    //widgets
    private Button mSumbit;
    private Spinner spinner;
    private static final String[] paths = {"A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        Log.d(TAG, "onCreate: started");


        mSumbit = (Button)findViewById(R.id.sumbit);
        mSumbit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FormActivity.this,SucessActivity.class);
                startActivity(intent);
            }
        });
    }
}
