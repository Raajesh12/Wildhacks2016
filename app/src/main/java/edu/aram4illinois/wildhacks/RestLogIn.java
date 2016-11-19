package edu.aram4illinois.wildhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RestLogIn extends AppCompatActivity {
    EditText emailEditText;
    EditText passEditText;
    Button proceedButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_log_in);

        emailEditText = (EditText) findViewById(R.id.emailEditText);
        passEditText = (EditText) findViewById(R.id.passwordEditText);
        proceedButton = (Button) findViewById(R.id.button);

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

        proceedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailAddress = emailEditText.getText().toString();
                String password = passEditText.getText().toString();
                if(emailAddress.equals("john@papajohns.com") && password.equals("papa")){
                    Intent intent = new Intent(v.getContext(), RestList.class);
                    startActivity(intent);
                    emailEditText.getText().clear();
                    passEditText.getText().clear();
                }
                else{
                    Toast.makeText(v.getContext(), "Invalid Username or Password!",
                            Toast.LENGTH_LONG).show();
                    emailEditText.getText().clear();
                    passEditText.getText().clear();
                }
            }
        });
    }

}
