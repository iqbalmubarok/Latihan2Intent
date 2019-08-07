package com.example.tugasintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class tamu extends AppCompatActivity implements View.OnClickListener{

    Button tanaman;

    @Override
    protected void onCreate(Bundle savedInstance){

        super.onCreate(savedInstance);
        setContentView(R.layout.guest);

        tanaman = (Button)findViewById(R.id.button_tanaman);
        tanaman.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_tanaman:
                Intent tanaman = new Intent(tamu.this, ListTanaman.class);
                startActivity(tanaman);
                break;

            default:
                break;
        }
    }
}
