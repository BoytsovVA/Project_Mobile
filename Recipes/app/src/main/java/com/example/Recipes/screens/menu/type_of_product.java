package com.example.Recipes.screens.menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import com.example.Recipes.R;
import com.example.Recipes.screens.Recicler_search;
import java.util.ArrayList;

public class type_of_product extends AppCompatActivity implements View.OnClickListener {
  public static final String EXTRA_REC4 = "kitchen.EXTRA_REC4";
  ImageButton Meat, Fish, Bird, Pasta, Potato, Rice;
  ArrayList<String> request = new ArrayList<String>();
  String req =
      "SELECT * FROM app_recipes WHERE recipes_id In (SELECT r_k_id FROM app_recipes_kitchen WHERE"
          + " app_recipes_kitchen.Main_product =?) AND recipes_block =?;";
  String data1;
  String data2 = "0";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.menu_type_of_product);

    Meat = (ImageButton) findViewById(R.id.meat);
    Meat.setOnClickListener(this);
    Fish = (ImageButton) findViewById(R.id.fish);
    Fish.setOnClickListener(this);
    Bird = (ImageButton) findViewById(R.id.bird);
    Bird.setOnClickListener(this);
    Pasta = (ImageButton) findViewById(R.id.pasta);
    Pasta.setOnClickListener(this);
    Potato = (ImageButton) findViewById(R.id.potato);
    Potato.setOnClickListener(this);
    Rice = (ImageButton) findViewById(R.id.rice);
    Rice.setOnClickListener(this);
  }

  @Override
  public void onClick(View v) {
    switch (v.getId()) {
      case R.id.meat:
        Intent intent = new Intent(type_of_product.this, Recicler_search.class);
        data1 = "Мясо";
        request = new ArrayList<String>();
        request.add(req);
        request.add(data1);
        request.add(data2);
        intent.putStringArrayListExtra(EXTRA_REC4, request);
        startActivity(intent);
        break;
      case R.id.fish:
        intent = new Intent(type_of_product.this, Recicler_search.class);
        data1 = "Рыба";
        request = new ArrayList<String>();
        request.add(req);
        request.add(data1);
        request.add(data2);
        intent.putStringArrayListExtra(EXTRA_REC4, request);
        startActivity(intent);
        break;
      case R.id.bird:
        intent = new Intent(type_of_product.this, Recicler_search.class);
        data1 = "Птица";
        request = new ArrayList<String>();
        request.add(req);
        request.add(data1);
        request.add(data2);
        intent.putStringArrayListExtra(EXTRA_REC4, request);
        startActivity(intent);
        break;
      case R.id.potato:
        intent = new Intent(type_of_product.this, Recicler_search.class);
        data1 = "Картофель";
        request = new ArrayList<String>();
        request.add(req);
        request.add(data1);
        request.add(data2);
        intent.putStringArrayListExtra(EXTRA_REC4, request);
        startActivity(intent);
        break;
      case R.id.pasta:
        intent = new Intent(type_of_product.this, Recicler_search.class);
        data1 = "Макароны";
        request = new ArrayList<String>();
        request.add(req);
        request.add(data1);
        request.add(data2);
        intent.putStringArrayListExtra(EXTRA_REC4, request);
        startActivity(intent);
        break;
      case R.id.rice:
        intent = new Intent(type_of_product.this, Recicler_search.class);
        data1 = "Рис";
        request = new ArrayList<String>();
        request.add(req);
        request.add(data1);
        request.add(data2);
        intent.putStringArrayListExtra(EXTRA_REC4, request);
        startActivity(intent);
        break;
    }
  }
}
