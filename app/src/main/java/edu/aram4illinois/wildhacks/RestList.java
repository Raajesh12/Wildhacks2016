package edu.aram4illinois.wildhacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.ArrayList;

public class RestList extends AppCompatActivity {
    ListView listview;
    ImageView plus;
    ArrayList<Order> data = new ArrayList<Order>();
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
        Intent intent = this.getIntent();
        Order order = (Order) intent.getSerializableExtra("order");

        data.add(new Order("Papa John", "Extra Large Pizza", 10.0));
        data.add(new Order("Achintya", "Dosai", 60.0));
        data.add(new Order("Raajesh", "Sambar", 80.0));
        if (order != null)
            data.add(order);
        listview = (ListView) findViewById(R.id.waitlist);
        listview.setAdapter(new CustomAdapter(this, data));
    }
}
