package com.example.mubaksaude;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ProdutosAdapter extends ArrayAdapter<Produtos> {

    private final Context context;
    private final ArrayList<Produtos> elementos;

    public ProdutosAdapter(Context context, ArrayList<Produtos> elementos) {
        super (context, R.layout.modelo_lista, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.modelo_lista, parent, false);

        TextView nomeProdutos = (TextView) rowView.findViewById(R.id.nome);
        TextView endereco = (TextView) rowView.findViewById(R.id.endereco);
        ImageView imagem = (ImageView) rowView.findViewById(R.id.imagem);

        nomeProdutos.setText(elementos.get(position).getNome());
        endereco.setText(elementos.get(position).getEndereco());
        imagem.setImageResource(elementos.get(position).getImagem());

        return rowView;
    }
}
