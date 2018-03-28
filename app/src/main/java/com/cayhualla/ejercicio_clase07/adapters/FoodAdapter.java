package com.cayhualla.ejercicio_clase07.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.cayhualla.ejercicio_clase07.R;
import com.cayhualla.ejercicio_clase07.models.Food;

import java.util.List;

/**
 * Created by LISET on 27/03/2018.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder>{

    private List<Food> comida;

    public void setComida(List<Food> comida) {
        this.comida = comida;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView pictureImage;
        TextView fullnameText;
        TextView emailText;
        TextView precioText;
        TextView tiempoText;
        public ViewHolder(View itemView) {
            super(itemView);

            pictureImage = itemView.findViewById(R.id.picture_image);
            fullnameText = itemView.findViewById(R.id.fullname_text);
            emailText = itemView.findViewById(R.id.email_text);
            precioText = itemView.findViewById(R.id.precio_text);
            tiempoText = itemView.findViewById(R.id.tiempo_text);
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final FoodAdapter.ViewHolder holder, int position) {

        final Food pedido = comida.get(position);

        int resId = holder.itemView.getContext().getResources().getIdentifier(pedido.getPicture(), "drawable", holder.itemView.getContext().getPackageName()); //busca la imagen mediante el registro del adaptador people
        holder.pictureImage.setImageResource(resId);

        holder.fullnameText.setText(pedido.getName());
        holder.emailText.setText(pedido.getTipo());
        holder.precioText.setText("S/. " + pedido.getPrice());

        holder.tiempoText.setText(pedido.getTime()+" MIN ");
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(holder.itemView.getContext(), "Detalles de Persona: " + pedido.getName(), Toast.LENGTH_SHORT).show();
                // Llamar a otra pantalla y mostrar sus detalles de esta persona ...

            }
        });
    }

    @Override
    public int getItemCount() {
        return comida.size();    }

}
