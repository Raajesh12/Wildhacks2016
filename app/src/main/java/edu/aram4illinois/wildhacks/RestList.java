package edu.aram4illinois.wildhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

public class RestList extends AppCompatActivity {
    ListView listview;
    ImageView plus;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_list);
        plus = (ImageView) findViewById(R.id.imageView);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CustomerForm.class);
                startActivity(intent);
            }
        });
        Order[] data = new Order[3];
        data[0] = new Order("Papa John", "Extra Large Pizza", 10.0);
        data[1] = new Order("Achintya", "Dosai", 60.0);
        data[2] = new Order("Raajesh", "Sambar", 80.0);
        listview = (ListView) findViewById(R.id.waitlist);
        listview.setAdapter(new CustomAdapter(this, data));
    }
}
