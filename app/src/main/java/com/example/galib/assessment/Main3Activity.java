package com.example.galib.assessment;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    SQLiteDatabase db;
    SQLiteOpenHelper openHelper;
    Cursor cursor;
    Button button3;
    EditText editText9, editText10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editText9=(EditText)findViewById(R.id.editText9);
        editText10=(EditText)findViewById(R.id.editText10);
        button3=(Button)findViewById(R.id.button3);
        openHelper=new DatabaseHelper(this);
        db = openHelper.getReadableDatabase();

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editText9.getText().toString();
                String pass = editText10.getText().toString();
                //cursor = db.rawQuery("SELECT * FROM " +DatabaseHelper.TABLE_NAME+"WHERE"+DatabaseHelper.COL5+"=?", new String[]{email});
                String cursor="SELECT * FROM" +DatabaseHelper.TABLE_NAME+ "WHERE" +DatabaseHelper.COL6+ "=?'";
                db.rawQuery(cursor,new String[]{email});

                if (cursor != null) {
                    if (!cursor.isEmpty()) {
                        //cursor.moveToNext();
                        Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(getApplicationContext(), "Login error", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
