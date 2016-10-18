package com.example.hsport.myandroidapps;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast(View view) {
        Button button = (Button) view;
        String buttonText = (String) button.getText();
        Context context = getApplicationContext();
        String message = "You just clicked " + buttonText;

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
