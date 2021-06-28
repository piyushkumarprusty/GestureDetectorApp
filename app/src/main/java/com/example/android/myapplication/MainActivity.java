package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.gesture.Gesture;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {


    private TextView myMessage;
     GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myMessage = (TextView) findViewById(R.id.mynam);
        this.gestureDetector = new GestureDetector(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        myMessage.setText("onSingleTapConfirmed ");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        myMessage.setText("onDoubleTap");

        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        myMessage.setText("onDoubleTapEvent");

        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        myMessage.setText("onDown");

        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        myMessage.setText(" onShowPress");


    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        myMessage.setText("onSingleTapUp");

        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        myMessage.setText("onScroll");

        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        myMessage.setText("onLongPress");


    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        myMessage.setText("onFling");

        return false;
    }
}