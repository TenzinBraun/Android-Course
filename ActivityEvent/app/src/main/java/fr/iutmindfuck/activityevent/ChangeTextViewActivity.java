package fr.iutmindfuck.activityevent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ChangeTextViewActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.change_text_view);
    }

    public void changeTextWhenButtonClicked(View view){
        EditText editText = findViewById(R.id.edit_label);
        TextView textView = findViewById(R.id.label_text);
        textView.setText(editText.getText());
    }

}
