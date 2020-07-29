package com.example.mubaksaude;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class telaProdutos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.produtos);

        ListView lista = (ListView) findViewById(R.id.lvProdutos);
        ArrayList<Produtos> produtos = adicionarProdutos();
        ArrayAdapter adapter = new ProdutosAdapter(this, produtos);
        lista.setAdapter(adapter);

    }
    private ArrayList<Produtos> adicionarProdutos() {
        ArrayList<Produtos> produtos = new ArrayList<Produtos>();

        produtos.add(new Produtos("Alcool em gel", "Hospital Pedreira", R.drawable.alcool_em_gel));
        produtos.add(new Produtos("Luvas", "Pronto Socorro Jardim Republica", R.drawable.luvas));
        produtos.add(new Produtos("Protetor facial", "Hospital Pedreira", R.drawable.protetor_facial));
        produtos.add(new Produtos("Mascara", "Pronto Socorro Jardim Republica", R.drawable.mascara));

        return produtos;
    }

}