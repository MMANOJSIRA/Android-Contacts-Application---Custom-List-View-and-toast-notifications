package com.example.siranjeevi.customlistview;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
  static int b=1;
    String[] name = { "Joe Belfiiore", "ME :)" , "Pragathi Guruprasath"};
    int[] im = {R.drawable.joebelfiore , R.drawable.me , R.drawable.pragathi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);









        final Button sortButton = (Button) findViewById(R.id.sortButton);
        ListView siraListView = (ListView) findViewById(R.id.siraListView);
        final ListAdapter siraAdapter = new custom_Adapter(getBaseContext(),name,im);
        siraListView.setAdapter(siraAdapter);
        sortButton.setOnClickListener(
                new Button.OnClickListener() {


                    public void onClick(View v) {

                 if(b==1) { sortButton.setText("SORT DESCENDING"); b=0;
                      im[0] = R.drawable.joebelfiore; im[1]= R.drawable.me; im[2]= R.drawable.pragathi;
                     name[0] = "Joe Belfiore";name[1] = "ME :)";name[2] = "Pragathi Guruprasath";
                     ListView siraListView = (ListView) findViewById(R.id.siraListView);
                     final ListAdapter siraAdapter = new custom_Adapter(getBaseContext(),name,im);
                     siraListView.setAdapter(siraAdapter);


                         }
                        else { sortButton.setText("SORT ASCENDING"); b=1;
                     name[0]="Pragathi Guruprasath"; name[1]= "ME :)" ; name[2]= "Joe Belfiore";
                        im[2] = R.drawable.joebelfiore; im[1]= R.drawable.me; im[0]= R.drawable.pragathi;
                        ListView siraListView = (ListView) findViewById(R.id.siraListView);
                     final ListAdapter siraAdapter = new custom_Adapter(getBaseContext(),name,im);
                     siraListView.setAdapter(siraAdapter);

                 }


                    }
                }

        );

        Button searchButton = (Button)findViewById(R.id.searchButton);

        searchButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        EditText mEdit = (EditText)findViewById(R.id.SearchField);
                        String contact; boolean k=false;
                        contact =  mEdit.getText().toString();
                    for(int i=0;i<name.length ;i++)
                    {
                        if(contact.equalsIgnoreCase(name[i])== true )  k=true;

                    }

if(k==true )Toast.makeText(MainActivity.this,"CONTACT FOUND",Toast.LENGTH_SHORT).show();
else Toast.makeText(MainActivity.this,"CONTACT NOT FOUND",Toast.LENGTH_SHORT).show();

                    }

                }
        );


    }







}
