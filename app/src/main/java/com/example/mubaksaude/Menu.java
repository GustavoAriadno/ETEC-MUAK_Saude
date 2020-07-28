package com.example.mubaksaude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);


    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.locais:
                Intent it = new Intent(this, telaLocais.class);
                startActivity(it);
                break;
            case R.id.produtos:
                Intent ite = new Intent(this, telaProdutos.class);
                startActivity(ite);
                break;

        }
    }
}