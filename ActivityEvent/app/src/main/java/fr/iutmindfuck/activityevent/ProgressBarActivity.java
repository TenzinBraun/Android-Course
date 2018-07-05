package fr.iutmindfuck.activityevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class ProgressBarActivity extends AppCompatActivity {
    private int progressScale = 0;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress_bar);
        progressBar = findViewById(R.id.progress_horizontal_bar);
    }

    public void increaseProgressBar(View view) {
        if(progressScale <= 90) {
            progressScale += 15;
            progressBar.setProgress(progressScale);
        }
    }

    public void decreaseProgressBar(View view) {
        if(progressScale >= 15) {
            progressScale -= 15;
            progressBar.setProgress(progressScale);
        }
    }
}
