package com.example.a26_oct_adapters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView listView ;

    final ArrayList<String> friendArrayList = new ArrayList<String>();
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.myListView);

        friendArrayList.add("Abdullah");
        friendArrayList.add("Azhar");
        friendArrayList.add("Babar");
        friendArrayList.add("Mushtaq");
        friendArrayList.add("Musa");
        friendArrayList.add("Salman");
        friendArrayList.add("Zahid");

        arrayAdapter = new ArrayAdapter<String>(this,
                     android.R.layout.simple_list_item_1,friendArrayList );

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.i("You clicked the name of", friendArrayList.get(i));

            }
       });

    }

    public void showList(View view) {
        EditText editText=findViewById(R.id.UserName);
        TextView textView=findViewById(R.id.txtView);

        textView.setText("Updated list of all users");
        String NAME=editText.getText().toString();
        friendArrayList.add(NAME);

    }
}