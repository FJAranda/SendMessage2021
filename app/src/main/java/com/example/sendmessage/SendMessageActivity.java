package com.example.sendmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendMessageActivity extends AppCompatActivity {

    private EditText etMessage;
    private Button btEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        etMessage = (EditText) findViewById(R.id.etmessage);
        btEnviar = (Button) findViewById(R.id.btsend);
    }

    public void sendMessage(View view){
        Intent intent = new Intent(SendMessageActivity.this, ViewMessageActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("message", etMessage.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}