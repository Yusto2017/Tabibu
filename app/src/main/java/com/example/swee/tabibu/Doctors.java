package com.example.swee.tabibu;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class Doctors extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors);

        //creating a list view//

        ListView v    =(ListView) findViewById(R.id.Listview);
        String[] array= {"Gynecologist", "Optician","Dentist","Psychiatrist","Allergist","Cardiologist"};
        ArrayList<String> lst =new ArrayList<String>(Arrays.asList(array));
        lst.add("Sex Analyst");
        lst.add("Dermatologist");
        lst.add("Endocrinologist");
        lst.add("Hematologist");
        lst.add("Hepatologist");
        lst.add("Hospitalist");

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lst);
        v.setAdapter(adapter);

        v.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg, long arg3) {

                //TODO Auto-generated method stub
                TextView txt=(TextView) arg1;
                System.out.println(txt.getText().toString());

            }
        }
        );





    }
}
