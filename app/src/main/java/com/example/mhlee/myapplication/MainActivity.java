package com.example.mhlee.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.mycompany.myfirstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        //Create new indent
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        //Load object
        EditText editText = (EditText) findViewById(R.id.edit_message);
        //Extract String
        String message = editText.getText().toString();
        //set message
        intent.putExtra(EXTRA_MESSAGE, message);
        //Start new activity.
        startActivity(intent);
    }
}
