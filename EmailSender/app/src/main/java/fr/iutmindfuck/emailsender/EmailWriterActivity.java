package fr.iutmindfuck.emailsender;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.net.URI;
import java.util.Arrays;

public class EmailWriterActivity extends AppCompatActivity {

    private EditText recipient;
    private EditText object;
    private EditText content;

    public final String TOAST_ERROR_RECIPIENT = "The recipient should be mentionned";
    public final String TOAST_ERROR_CONTENT = "You can't send an empty mail";

    public final static String EXTRA_RECIPIENT_ADDRESS = "mail_recipient_address";
    public final static String EXTRA_SUBJECT = "mail_subject";
    public final static String EXTRA_CONTENT = "mail_content";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_writer);

        recipient = findViewById(R.id.recipient_mail_edit);
        object = findViewById(R.id.object_mail_edit);
        content = findViewById(R.id.body_mail_edit);
    }

    public void onClickButtonSendMail(View view) {
        if(TextUtils.isEmpty(recipient.getText())){
            Toast.makeText(EmailWriterActivity.this,TOAST_ERROR_RECIPIENT,Toast.LENGTH_LONG).show();
        }else{
            if(TextUtils.isEmpty(content.getText())){
                Toast.makeText(EmailWriterActivity.this,TOAST_ERROR_CONTENT,Toast.LENGTH_LONG).show();
            }else{
                if (prepareIntentToSendEmail().resolveActivity(getPackageManager()) != null) {
                    startActivity(prepareIntentToSendEmail());
                }
            }
        }
    }

    public Intent prepareIntentToSendEmail(){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{recipient.getText().toString()});
        intent.putExtra(Intent.EXTRA_SUBJECT, object.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT, content.getText().toString());
        return intent;
    }

   /* public Uri prepareParseMailSender(){
        Uri uri = Uri.parse("mailto:" + ))
                .buildUpon()
                .appendQueryParameter("subject", object.getText().toString())
                .appendQueryParameter("body", content.getText().toString())
                .build();
        return uri;
    }
*/

}
