package com.example.sushanth.drawcircle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static  String colorChoosen = "black";
    public static String modeChoosen = "draw";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "DRAW MODE", Toast.LENGTH_SHORT).show();
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.modes, menu);
        return true;
    }

    public boolean onPrepareOptionsMenu (Menu menu) {
        MenuItem change = menu.findItem(R.id.change);
        if (modeChoosen == "draw")
            change.setEnabled(true);
        else
            change.setEnabled(false);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.draw:
                System.out.println("Draw");

                Toast.makeText(this, "DRAW MODE", Toast.LENGTH_SHORT).show();
                modeChoosen = "draw";
                setTitle("DrawCircle - Draw");
                return true;
            case R.id.delete:
                System.out.println("Delete");
                Toast.makeText(this, "DELETE MODE", Toast.LENGTH_SHORT).show();
                modeChoosen = "delete";
                setTitle("DrawCircle - delete");
                return true;
            case R.id.move:
                System.out.println("Move");
                Toast.makeText(this, "MOVE MODE", Toast.LENGTH_SHORT).show();
                modeChoosen = "move";
                setTitle("DrawCircle - Move");
                return true;
            case R.id.change:
                System.out.println("Change");
                modeChoosen = "change";
                return true;
            case R.id.red:
                System.out.println("red");
                Toast.makeText(this, "DRAW RED", Toast.LENGTH_SHORT).show();
                modeChoosen = "draw";
                colorChoosen = "redThick";
                return true;
            case R.id.blue:
                System.out.println("blue");
                Toast.makeText(this, "DRAW BLUE", Toast.LENGTH_SHORT).show();
                modeChoosen = "draw";
                colorChoosen = "blueThick";
                return true;
            case R.id.green:
                System.out.println("green");
                Toast.makeText(this, "DRAW GREEN", Toast.LENGTH_SHORT).show();
                modeChoosen = "draw";
                colorChoosen = "greenThick";
                return true;
            case R.id.black:
                System.out.println("black");
                Toast.makeText(this, "DRAW BLACK", Toast.LENGTH_SHORT).show();
                modeChoosen = "draw";
                colorChoosen = "blackThick";
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

}
