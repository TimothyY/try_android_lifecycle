package com.example.sesi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //deklarasi variable
    TextView tvGreetings;
    EditText etUsername, etPassword;
    Button btnSendUsername, btnSendPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("act1", "on create dipanggil");

        tvGreetings = findViewById(R.id.tvGreetings);
        tvGreetings.setText("Greetings Binusian");

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

        btnSendUsername = findViewById(R.id.btnSendUsername);
        btnSendUsername.setOnClickListener(this);

        btnSendPassword = findViewById(R.id.btnSendPassword);
        btnSendPassword.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "button ditekan", Toast.LENGTH_LONG).show();

        String strToSend;

        if(v.getId()==R.id.btnSendUsername){
            strToSend = etUsername.getText().toString();
        }else{
            strToSend = etPassword.getText().toString();
        }

        Intent niat = new Intent(this,MainActivity2.class);
        niat.putExtra("kirimanString", strToSend);
        startActivity(niat);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("act1", "on start dipanggil");
    }

    @Override
    protected void onResume() {
        super.onResume();
        //load data dari sqlite / shared pref
        Log.v("act1", "on resume dipanggil");
    }

    @Override
    protected void onPause() {
        super.onPause();
        //save data ke sqlite / shared pref
        Log.v("act1", "on pause dipanggil");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("act1", "on stop dipanggil");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("act1", "on destroy dipanggil");
    }
}