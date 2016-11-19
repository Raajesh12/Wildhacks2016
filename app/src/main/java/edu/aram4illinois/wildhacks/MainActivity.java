package edu.aram4illinois.wildhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner dropdown = (Spinner) findViewById(R.id.spinner1);
        String[] items = new String[]{"Jupiter's Pizza & Billiards", "Old Chicago Pizza", "Papa D's Pizza"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

    }
    public void RestList(View view){
        Intent intent = new Intent(this, RestList.class);
        startActivity(intent);
    }

    public void logIn(View view) {
        Intent intent = new Intent(this, RestLogIn.class);
        startActivity(intent);
    }

}
