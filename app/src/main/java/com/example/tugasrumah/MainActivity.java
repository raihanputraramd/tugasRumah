package com.example.tugasrumah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button raihanPutra;
    Button radenAzfa;
    Button cardViewTugas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        raihanPutra = (Button) findViewById(R.id.btnPutra);
        raihanPutra.setOnClickListener(this);
        radenAzfa = (Button) findViewById(R.id.btnAzfa);
        radenAzfa.setOnClickListener(this);
        cardViewTugas = (Button) findViewById(R.id.btnCardView);
        cardViewTugas.setOnClickListener(this);
    }

    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnPutra:
                Intent explicit1 = new Intent(MainActivity.this, raihanPutra.class);
                startActivity(explicit1);
                break;
            case R.id.btnAzfa:
                Intent explicit2 = new Intent(MainActivity.this, RadenAzfaCardView.class);
                startActivity(explicit2);
                break;
            case R.id.btnCardView:
                Intent explicit3 = new Intent(MainActivity.this, cardview.class);
                startActivity(explicit3);
                break;
            default:
                break;
        }
    }
}
