package fr.iutmindfuck.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ActivityEvent extends AppCompatActivity {
    private Button pressMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        pressMe = findViewById(R.id.press_me)
    }
}
