package fr.iutmindfuck.activityevent;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class ScoreBoardActivity extends AppCompatActivity {
    private Chronometer chronometer;
    private boolean started = false;
    private boolean resume = false;
    private long onResumeBase = 0;

    private Button resumeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_board);
        chronometer = findViewById(R.id.chrono);
        chronometer.stop();

        resumeButton = findViewById(R.id.pause_resume_count);

    }

    public void resetTimer(View view) {
        if(started){
            chronometer.setBase(SystemClock.elapsedRealtime());
            chronometer.stop();
            started = false;
            resumeButton.setText(R.string.pause_button);
            onResumeBase = 0;
        }
    }

    public void pauseOrResume(View view) {
        if(started && !resume){
            onResumeBase = chronometer.getBase() - SystemClock.elapsedRealtime();
            chronometer.stop();
            resumeButton.setText(R.string.resume);
            resume = true;

        }
        else{
            chronometer.setBase(SystemClock.elapsedRealtime() + onResumeBase);
            chronometer.start();
            resume = false;
            resumeButton.setText(R.string.pause_button);
        }

    }

    public void startCounter(View view) {
        if(!started) {
            chronometer.setBase(SystemClock.elapsedRealtime());
            chronometer.start();
            started = true;
            onResumeBase = 0;
        }
    }
}
