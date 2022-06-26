package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity {


    public static final float MINIMUM_CONFIDENCE_TF_OD_API = 0.5f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(MainActivity.this, DetectorActivity.class));

    }

}
