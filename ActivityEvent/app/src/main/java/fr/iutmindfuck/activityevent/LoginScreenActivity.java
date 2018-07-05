package fr.iutmindfuck.activityevent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LoginScreenActivity extends AppCompatActivity {
    private final String USERNAME = "user@email.com";
    private final String PASSWORD = "iloveand";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
    }

    public void connection(View view) {
        EditText username = findViewById(R.id.auth_username);
        EditText password = findViewById(R.id.auth_password);
        if(username.getText().toString().equals(USERNAME) && password.getText().toString().equals(PASSWORD)){
            startActivity(new Intent(LoginScreenActivity.this, MenuActivity.class));
        }
        else{
            ((TextView)findViewById(R.id.auth_error))
                    .setText(getResources().getText(R.string.auth_error));
        }
    }
}
