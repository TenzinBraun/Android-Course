package fr.iutmindfuck.animation;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void animationClickButton(View view) {

        final TextView textview = findViewById(R.id.text1);
        TextView textview2 = findViewById(R.id.text2);
        TextView textview3 = findViewById(R.id.text3);
        TextView textview4 = findViewById(R.id.text4);

        int animationTime = 500;


        ValueAnimator valueAnimator = ValueAnimator.ofFloat(0f,500f);
        valueAnimator.setDuration(animationTime);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float value = (Float) valueAnimator.getAnimatedValue();
                textview.setTranslationX(value);
            }
        });


        ObjectAnimator text1Animation = ObjectAnimator.ofFloat(textview,"translationX",0f,500f);
        text1Animation.setInterpolator(new LinearInterpolator());
        text1Animation.setDuration(animationTime);
        text1Animation.start();

        ObjectAnimator text2Animation = ObjectAnimator.ofFloat(textview2,"translationX",0f,500f);
        text2Animation.setInterpolator(new AccelerateInterpolator());
        text2Animation.setDuration(animationTime);
        text2Animation.start();

        ObjectAnimator text3Animation = ObjectAnimator.ofFloat(textview3,"translationX",0f,500f);
        text3Animation.setInterpolator(new OvershootInterpolator());
        text3Animation.setDuration(animationTime);
        text3Animation.start();

        ObjectAnimator text4Animation = ObjectAnimator.ofFloat(textview4,"translationX",0f,500f);
        text4Animation.setInterpolator(new BounceInterpolator());
        text4Animation.setDuration(animationTime);
        text4Animation.start();
    }

    public void openSecondActivityButton(View view) {
        startActivity(new Intent(this, Main2Activity.class));
        overridePendingTransition(R.anim.activity_transition_to_left, R.anim.activity_transition_fade_out);
    }
}
