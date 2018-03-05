package com.srm.dixitsoham.fragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    SimpleAddition fragment;
    EditText edittext;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edittext = (EditText) findViewById(R.id.editText);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text_of_edittext = edittext.getText().toString();
                onMessage(text_of_edittext);
            }
        });

    }


    public void onMessage(String message) {

        fragment = (SimpleAddition) getFragmentManager().findFragmentById(R.id.fragment2);
        fragment.setMessage(message);

    }
}

