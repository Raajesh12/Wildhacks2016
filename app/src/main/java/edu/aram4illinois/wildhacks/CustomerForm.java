package edu.aram4illinois.wildhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CustomerForm extends AppCompatActivity {
    Button submit;
    EditText name;
    EditText number;
    EditText time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_form);

        submit = (Button) findViewById(R.id.submit);
        name = (EditText) findViewById(R.id.nameField);
        number = (EditText) findViewById(R.id.orderNumberField);
        time = (EditText) findViewById(R.id.inputTimeField);

        name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.getText().clear();
            }
        });

        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number.getText().clear();
            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                time.getText().clear();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), RestList.class);
                startActivity(intent);
            }
        });

    }
}
