package com.example.galib.assessment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.Button;

public class Main5Activity extends AppCompatActivity {
    Button txtid;
    Button txtname;
    Button txtdob;
    Button txtaddress;
    Button txtgender;
    Button txtemail;
    Button txtpassword;
    Button txtcontact;
    Button txtemergencycontact;
    String id;
    String name;
    String dob;
    String address;
    String gender;
    String email;
    String password;
    String contact;
    String emergencycontact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Intent i = getIntent();
        id = i.getStringExtra("id");
        name = i.getStringExtra("name");
        dob = i.getStringExtra("dob");
        address = i.getStringExtra("address");
        gender = i.getStringExtra("gender");
        email = i.getStringExtra("email");
        contact = i.getStringExtra("contact");
        emergencycontact = i.getStringExtra("emergencycontact");

        txtid = (Button) findViewById(R.id.id);
        txtname = (Button) findViewById(R.id.name);
        txtdob = (Button) findViewById(R.id.dob);
        txtaddress = (Button) findViewById(R.id.address);
        txtgender = (Button) findViewById(R.id.gender);
        txtemail = (Button) findViewById(R.id.email);
        txtpassword = (Button) findViewById(R.id.password);
        txtcontact = (Button) findViewById(R.id.contact);
        txtemergencycontact = (Button) findViewById(R.id.emergencycontact);
        txtid.setText(id);
        txtname.setText(name);
        txtdob.setText(dob);
        txtaddress.setText(address);
        txtgender.setText(gender);
        txtemail.setText(email);
        txtpassword.setText(password);
        txtcontact.setText(contact);
        txtemergencycontact.setText(emergencycontact);
    }
}
