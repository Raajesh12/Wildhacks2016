package edu.aram4illinois.wildhacks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RestLogIn extends AppCompatActivity {
    EditText emailEditText;
    EditText passEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_log_in);

        emailEditText = (EditText) findViewById(R.id.emailEditText);
        passEditText = (EditText) findViewById(R.id.passwordEditText);

        emailEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emailEditText.getText().clear();
            }
        });

        passEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                passEditText.getText().clear();
            }
        });

    }
}
