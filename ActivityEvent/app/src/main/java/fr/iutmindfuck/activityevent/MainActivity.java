package fr.iutmindfuck.activityevent;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.press_me);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "PLEASE WORK", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void clickMe(View view) {
        button = findViewById(R.id.press_me);
        button.setBackgroundColor(Color.parseColor("#FF0000"));
    }
}
