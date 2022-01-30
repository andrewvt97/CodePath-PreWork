package com.example.helloworldapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = ((TextView) findViewById(R.id.text));

        // user can tap a button to change the text color of the label

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //change the text color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.gold));
            }
        });
        //change the color of the background view

        findViewById(R.id.backgroundbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // #34c3b9 aqua
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.aqua));

            }
        });

        // User changes the text to Android is Awesome
        findViewById(R.id.changeTextbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        /* User taps on background to reset to default view
        1. Reset text to "Hello from Andrew" id - text
        2. Reset text to original color - white, text id - text
        3. Reset to background color
            original background color - red
         */

        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Hello from Andrew!");

                textView.setTextColor(getResources().getColor(R.color.white));

                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.red));


            }
        });

        // User can change the text to their own custom text
        findViewById(R.id.customTextbutton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String UserText = ((EditText) findViewById(R.id.editText)).getText().toString();
                // if statement if custom text is empty

                if (UserText.isEmpty()) {
                    textView.setText("Enter your own text!");
                }
                else {
                    textView.setText(UserText);
                }


            }
        });





    }
}