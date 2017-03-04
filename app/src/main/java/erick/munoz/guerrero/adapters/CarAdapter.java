package erick.munoz.guerrero.adapters;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import erick.munoz.guerrero.models.Carro;
import erick.munoz.guerrero.popularmovie.R;

/**
 * Created by Lenovo-PC on 04/03/2017.
 */

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {
    private ArrayList<Carro> data;
    private Context context;


    public CarAdapter(Context c, ArrayList<Carro> carros){

        this.context=c;
        this.data=carros;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.elemento_lista,parent,false);

        ViewHolder holder = new ViewHolder(view);
        view.setTag(holder);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Carro carro = data.get(position);

        holder.title.setText(carro.getTitulo());
        holder.descrition.setText(carro.getDescription());
        holder.imagen.setImageResource(carro.getIdImage());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView title;
        private final TextView descrition;
        private final ImageView imagen;

        public ViewHolder(View v){
            super(v);
            title = (TextView) v.findViewById(R.id.titleTextView);
            descrition = (TextView) v.findViewById(R.id.subTitleTextView);
            imagen = (ImageView) v.findViewById(R.id.imageCarro);
        }

    }
}
