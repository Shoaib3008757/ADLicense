package com.flytechnology.adlicense;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class DashboardScreen extends AppCompatActivity {

    ListView licenseList;
    ArrayList<HashMap<String, String>> jobList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_screen);

        init();
        listValues();
        listViewClickListner();
    }

    public void init(){

        licenseList = (ListView) findViewById(R.id.license_list);
        jobList = new ArrayList<HashMap<String, String>>();


    }

    public void listValues(){

        String[] items = { "Commercial License", "Tourist License", "Professional License", "Industrial License" };

 /*       ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items);
*/

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1, items) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                TextView text = (TextView) view.findViewById(android.R.id.text1);
                text.setTextColor(Color.BLACK);
                return view;
            }
        };


        licenseList.setAdapter(adapter);
    }

    public void listViewClickListner(){

        licenseList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position==0){

                    Intent commercial = new Intent(DashboardScreen.this, CommercialLicense.class);
                    startActivity(commercial);

                }

                if (position==1){

                    Intent commercial = new Intent(DashboardScreen.this, TouristLicense.class);
                    startActivity(commercial);

                }
                if (position==2){

                    Intent commercial = new Intent(DashboardScreen.this, ProfessionalLicense.class);
                    startActivity(commercial);
                }
                if (position==3){

                    Intent commercial = new Intent(DashboardScreen.this, IndustrialLicense.class);
                    startActivity(commercial);

                }


            }
        });
    }
}
