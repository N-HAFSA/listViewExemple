package com.example.listviewexemple.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.listviewexemple.R;

import java.util.List;

public class ArticleAdapter extends ArrayAdapter<Article> {

    public ArticleAdapter(@NonNull Context context, @NonNull List<Article> objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Récupérer l'article qui correspond à la position de l'item
        Article article = getItem(position);

        //Vérifier si la vue existe déjà, dans ce cas elle sera réutilisée, sion elle sera creée
        if(convertView==null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);

        //Récupérer les labels de la vue
        TextView  tvCode    = convertView.findViewById(R.id.Code);
        TextView  tvLibelle = convertView.findViewById(R.id.Libelle);
        Button    btn       = convertView.findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), article.getLibelle(), Toast.LENGTH_SHORT).show();
            }
        });

        //Saisir les données au niveau de la vue (item:ligne)
        tvCode.setText(article.getCode());
        tvLibelle.setText(article.getLibelle());

        //retourner la vue réalisée pour l'affichage à l'écran
        return convertView;
    }


}
