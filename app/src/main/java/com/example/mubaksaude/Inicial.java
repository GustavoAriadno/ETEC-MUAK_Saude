package com.example.mubaksaude;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicial);

        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()) {
                    case R.id.login:
                        Intent it = new Intent(null, Login.class);
                        startActivity(it);
                        break;
                    case R.id.registrar:
                        Intent ite = new Intent(null, Registrar.class);
                        startActivity(ite);
                        break;

                }
            }
        });
    }
}