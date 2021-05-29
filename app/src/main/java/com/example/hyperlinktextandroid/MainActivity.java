package com.example.hyperlinktextandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupHyperlink();
    }

    private void setupHyperlink() {
        TextView linkTextView = findViewById(R.id.activity_main_link);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        /**
         * for kotlin
         */
      /*  val linkTextView = findViewById<TextView>(R.id.activity_main_link)
                linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        linkTextView.setLinkTextColor(Color.BLUE)*/
    }
}