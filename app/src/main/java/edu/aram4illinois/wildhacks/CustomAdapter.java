package edu.aram4illinois.wildhacks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Raajesh on 11/19/2016.
 */

public class CustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<Order> data;
    private static LayoutInflater inflater = null;

    public CustomAdapter(Context context, ArrayList<Order> data) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.data = data;
        inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View vi = convertView;
        if (vi == null)
            vi = inflater.inflate(R.layout.list_row, null);
        TextView nameText = (TextView) vi.findViewById(R.id.nameTextView);
        TextView orderText = (TextView) vi.findViewById(R.id.orderTextView);
        TextView timeText = (TextView) vi.findViewById(R.id.timeTextView);

        Order currOrder = data.get(position);
        nameText.setText(currOrder.getDisplayName());
        orderText.setText(Integer.toString(currOrder.getOrderNumber()));
        timeText.setText(Double.toString(currOrder.getEstimatedTime()));

        return vi;
    }
}
