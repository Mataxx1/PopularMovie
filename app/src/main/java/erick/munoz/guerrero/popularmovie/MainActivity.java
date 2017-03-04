package erick.munoz.guerrero.popularmovie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

import erick.munoz.guerrero.adapters.CarAdapter;
import erick.munoz.guerrero.models.Carro;

public class MainActivity extends AppCompatActivity {
    RecyclerView mLista;
private ArrayList<Carro> carros = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carros.add(new Carro(R.drawable.carros1,"Carro 1","Un carro chido :v"));
        carros.add(new Carro(R.drawable.carros2,"Carro 2","Descripción del segundo carro"));
        carros.add(new Carro(R.drawable.carros3,"Carro 3","Descripción del carro 3"));
        carros.add(new Carro(R.drawable.carros4,"Carro 4","El ejemplo estuvo chido"));
        carros.add(new Carro(R.drawable.carros5,"Carro 5","Lo voa aplicar en mi clase"));

        mLista = (RecyclerView) findViewById(R.id.listaDatos);
        mLista.setLayoutManager(new GridLayoutManager(this,2));
        mLista.setHasFixedSize(true);
        CarAdapter carAdapter = new CarAdapter(this,carros);
        mLista.setAdapter(carAdapter);


    }
}
