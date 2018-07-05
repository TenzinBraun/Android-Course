package fr.iutmindfuck.activityevent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;


public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }


    public void onClickChangeActivityToScoreBoard(View view) {
        startActivity(new Intent(MenuActivity.this, ScoreBoardActivity.class));
    }

    public void onClickChangeActivityToCalculator(View view) {
        startActivity(new Intent(MenuActivity.this, CalculatorActivity.class));
    }

    public void onClickChangeActivityToProgressBar(View view) {
        startActivity(new Intent(MenuActivity.this, ProgressBarActivity.class));
    }
}
