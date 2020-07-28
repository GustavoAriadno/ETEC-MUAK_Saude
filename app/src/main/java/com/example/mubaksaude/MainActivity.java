package com.example.mubaksaude;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);





    }

    private ArrayList<Produtos> adicionarProdutos() {
        ArrayList<Produtos> produtos = new ArrayList<Produtos>();

        Produtos p = new Produtos("Alcool em gel", "Hospital Pedreira", R.drawable.alcool_em_gel);
        produtos.add(p);

        p = new Produtos("Luvas", "Pronto Socorro Jardim Republica", R.drawable.luvas);
        produtos.add(p);

        p = new Produtos("Protetor facial", "Hospital Pedreira", R.drawable.protetor_facial);
        produtos.add(p);

        p = new Produtos("Mascara", "Pronto Socorro Jardim Republica", R.drawable.mascara);
        produtos.add(p);

        return produtos;
    }
}
