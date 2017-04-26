package com.flytechnology.adlicense;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Shoaib Anwar on 26/04/2017.
 */

public class Adapter extends BaseAdapter {

    private Activity activity;
    private String[] data;
    private static LayoutInflater inflater=null;


    public Adapter (Activity a) {
        activity = a;
        //data=d;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return 1;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.dashboard_list_item, null);

        TextView tv_commercial_license = (TextView)vi.findViewById(R.id.tv_commercial_license);
        TextView tv_tourist_license = (TextView)vi.findViewById(R.id.tv_tourist_license);
        TextView tv_professiona_license = (TextView)vi.findViewById(R.id.tv_professiona_license);
        TextView tv_industrial_license = (TextView)vi.findViewById(R.id.tv_industrial_license);
        return vi;
    }


}