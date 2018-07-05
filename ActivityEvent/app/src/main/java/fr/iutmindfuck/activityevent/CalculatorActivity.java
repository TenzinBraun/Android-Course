package fr.iutmindfuck.activityevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    private String concatNumber ="";
    private String firstPart;
    private TextView resultat;
    private TextView firstPartLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        resultat = findViewById(R.id.result);
        firstPartLabel = findViewById(R.id.first);
    }

    public void makeCalcul(View view){
        int startPart = Integer.parseInt(firstPart);
        int endPart = Integer.parseInt(concatNumber);
        int total = startPart + endPart;
        concatNumber = String.valueOf(total);
        displayNumber();
    }

    public void buttonPlus(View view) {
        firstPart = concatNumber;
        concatNumber = "";
        displayNumber();
        displayFirstPart();

    }

    public void buttonReset(View view) {
        concatNumber = "";
        firstPart = "";
        displayNumber();
        displayFirstPart();
    }

    public void button9(View view) {
        concatNumber+= "9";
        displayNumber();
    }

    public void button8(View view) {
        concatNumber+= "8";
        displayNumber();
    }

    public void button7(View view) {
        concatNumber+= "7";
        displayNumber();
    }

    public void button6(View view) {
        concatNumber+= "6";
        displayNumber();
    }

    public void button5(View view) {
        concatNumber+= "5";
        displayNumber();
    }

    public void button4(View view) {
        concatNumber+= "4";
        displayNumber();
    }

    public void button3(View view) {
        concatNumber+= "3";
        displayNumber();
    }

    public void button2(View view) {
        concatNumber+= "2";
        displayNumber();
    }

    public void button1(View view) {
        concatNumber+= "1";
        displayNumber();
    }

    public void button0(View view) {
        concatNumber+= "0";
        displayNumber();
    }

    public void displayNumber(){
        resultat.setText(concatNumber);
    }

    public void displayFirstPart(){
        firstPartLabel.setText(firstPart);
    }
}
