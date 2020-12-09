package com.example.listviewexemple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.listviewexemple.model.Article;
import com.example.listviewexemple.model.ArticleAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Article> articles = new ArrayList<>();
        articles.add(new Article("1","Pain"));
        articles.add(new Article("2","Huile"));
        articles.add(new Article("3","Pomme"));
        articles.add(new Article("4","Thé"));
        articles.add(new Article("5","Stylo"));
        articles.add(new Article("6","Cahier"));

        ArticleAdapter articleAdapter = new ArticleAdapter(this, articles);

        ListView listView = findViewById(R.id.lstArts);

        listView.setAdapter(articleAdapter);

    }
}