package com.example.sendmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ViewMessageActivity extends AppCompatActivity {

    private TextView tvmessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);
        tvmessage = (TextView) findViewById(R.id.tvmessagerecibido);
        Bundle bundle = this.getIntent().getExtras();
        tvmessage.setText(bundle.getString("message"));
    }
}