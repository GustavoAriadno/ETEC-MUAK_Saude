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
        setContentView(R.layout.activity_main);

        ListView lista = (ListView) findViewById(R.id.lvProdutos);
        ArrayList<Produtos> produtos = adicionarEscolas();
        ArrayAdapter adapter = new ProdutosAdapter(this, produtos);
        lista.setAdapter(adapter);

    }
    private ArrayList<Produtos> adicionarEscolas() {
        ArrayList<Produtos> produtos = new ArrayList<Produtos>();

        Produtos p = new Produtos("Colégio Estadual Atheneu Sergipense", "Rua Pacatuba S/N", R.drawable.atheneu);
        produtos.add(p);

        p = new Produtos("Escola Estadual General Siqueira", "Rua Sergipe S/N", R.drawable.escola3);
        produtos.add(p);

        produtos = new Produtos("Escola Tobias Barreto", "Av. OtonielDórea", R.drawable.escola1);
        produtos.add(p);

        p = new Produtos("ColegioEstadual ProfGRollembergLeite", "R. Franklin de Campos Sobral, 1675", R.drawable.goncalo);
        produtos.add(p);

        return produtos;
    }
}
