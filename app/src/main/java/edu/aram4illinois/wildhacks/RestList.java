package edu.aram4illinois.wildhacks;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.ArrayList;

public class RestList extends AppCompatActivity {
    ListView listview;
    ImageView plus;
    ImageView redX;
    ArrayList<Order> data;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_list);

        Intent intent = this.getIntent();
        data = (ArrayList<Order>) intent.getSerializableExtra("orderList");
        listview = (ListView) findViewById(R.id.waitlist);
        plus = (ImageView) findViewById(R.id.imageView);
        //redX = (ImageView) findViewById(R.id.redX);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CustomerForm.class);
                intent.putExtra("orderList", data);
                startActivity(intent);
            }
        });

        new CountDownTimer(Integer.MAX_VALUE, 1000) {

            public void onTick(long millisUntilFinished) {
                for(int i = 0; i < data.size(); i++){
                    Order tempOrder = data.get(i);
                    if(tempOrder.getEstimatedTime() > (1.0)/60)
                        tempOrder.setEstimatedTime(tempOrder.getEstimatedTime() - (1.0/60));
                }
                listview.invalidateViews();
            }

            public void onFinish() {

            }
        }.start();

        /*redX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.remove(0);
                listview.invalidateViews();
            }
        });*/

        /*Order order = (Order) intent.getSerializableExtra("order");
        if (order != null)
            data.add(order);*/

        listview.setAdapter(new CustomAdapter(this, data));

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                data.remove(position);
                listview.invalidateViews();
            }
        });
    }
}
