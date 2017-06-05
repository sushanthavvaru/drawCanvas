package com.example.sushanth.drawcircle;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by sushanth on 2/25/2017.
 */

public class Circle {
    float deltax=1;
    float deltay=1;
    float startX;
    float startY;
    float radius;
    Paint color;
    static Paint blackThick, blueThick, greenThick, redThick ;
    static {
        blackThick = new Paint();
        blackThick.setColor(Color.BLACK);
        blackThick.setStyle(Paint.Style.STROKE);
        blackThick.setStrokeWidth(2.0f);

        blueThick = new Paint();
        blueThick.setColor(Color.BLUE);
        blueThick.setStyle(Paint.Style.STROKE);
        blueThick.setStrokeWidth(2.0f);

        greenThick = new Paint();
        greenThick.setColor(Color.GREEN);
        greenThick.setStyle(Paint.Style.STROKE);
        greenThick.setStrokeWidth(2.0f);

        redThick = new Paint();
        redThick.setColor(Color.RED);
        redThick.setStyle(Paint.Style.STROKE);
        redThick.setStrokeWidth(2.0f);

    }



    public Circle(float x0, float y0, float z0, Paint c0) {
        startX = x0;
        startY = y0;
        radius = z0;
        color = c0;

    }

    public void drawOn(Canvas canvas) {
        canvas.drawCircle(startX, startY, radius, color);
    }
}