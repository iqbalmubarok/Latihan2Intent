package com.example.tugasintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements  View.OnClickListener {

    Button login;
    Button guest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        login = (Button)findViewById(R.id.tombol_login);
        login.setOnClickListener(this);
        guest = (Button)findViewById(R.id.guest);
        guest.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.tombol_login:
                Intent login = new Intent(MainActivity.this, operasi_jumlah.class);
                startActivity(login);
                break;

            case R.id.guest:
                Intent guest = new Intent(MainActivity.this, tamu.class);
                startActivity(guest);
                break;

            default:
                break;
        }
    }
}
