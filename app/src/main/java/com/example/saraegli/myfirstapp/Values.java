package com.example.saraegli.myfirstapp;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by saraegli on 2017-04-01.
 */

public class Values extends AppCompatActivity implements SensorEventListener {
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private TextView x,y, z;

    public Values() {
        Log.d("Konstruktor till Values",".");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("OnCreate Values",".");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values);
        mSensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        x = (TextView) findViewById(R.id.textView5);
        y = (TextView) findViewById(R.id.textView7);
        z = (TextView) findViewById(R.id.textView9);
    }

    protected void onResume() {
        super.onResume();
        mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_NORMAL);
    }

    protected void onPause() {
        super.onPause();
        mSensorManager.unregisterListener(this);
    }

    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }

    public void onSensorChanged(SensorEvent event) {
        x.setText(Float.toString(event.values[0]));
        y.setText(Float.toString(event.values[1]));
        z.setText(Float.toString(event.values[2]));
    }
}