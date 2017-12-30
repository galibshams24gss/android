package com.example.galib.assessment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Locale;

public class Main4Activity extends AppCompatActivity {
    ListView list;
    ListViewAdapter adapter;
    EditText editsearch;
    String[] id;
    String[] name;
    String[] dob;
    String[] address;
    String[] gender;
    String[] email;
    String[] password;
    String[] contact;
    String[] emergencycontact;
    ArrayList<ClientsData> arraylist = new ArrayList<ClientsData>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        id = new String[] { "1", "2", "3", "4", "5"};
        name = new String[] { "Alisa Smith", "Caithlyn Gomes", "John Griffiths", "Sam Smith", "Liya Ben"};
        dob = new String[] { "25/02/1988", "14/02/1990", "28/01/1992", "18/05/1996", "23/08/1995"};
        address = new String[] { "11 Preston", "56 Reservoir", "44 Raglan", "24 Werribie", "45 Johnson"};
        gender = new String[] { "F", "F", "M", "M", "F"};
        email = new String[] { "sa@yahoo.com", "cg@gmail.com", "jg@yahoo.com", "ss@gmail.com", "lb@yahoo.com"};
        password = new String[] { "123", "546", "754", "258", "635"};
        contact = new String[] { "0416502210", "0416503320", "0416301147", "0412507740", "041259880"};
        emergencycontact = new String[] { "0416502217", "0416505320", "0416301149", "0412507747", "041259885"};
        list = (ListView) findViewById(R.id.listview);

        for (int i = 0; i < id.length; i++)
        {
            ClientsData cd = new ClientsData(id[i], name[i], dob[i], address[i], gender[i], email[i], password[i], contact[i], emergencycontact[i]);
            arraylist.add(cd);
        }

        adapter = new ListViewAdapter(this, arraylist);
        list.setAdapter(adapter);
        editsearch = (EditText) findViewById(R.id.search);
        editsearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
                String text = editsearch.getText().toString().toLowerCase(Locale.getDefault());
                adapter.filter(text);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub
            }
        });
    }
}
