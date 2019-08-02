package com.williamwzd.softwarehouse.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;
import com.williamwzd.softwarehouse.R;
import com.williamwzd.softwarehouse.domain.Item;

import java.util.List;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.ViewHolder> {

    // Globales
    private List<Item> listData;
    private Context mContext;

    /**
     * @param mContext Contexto de quien invoca el adaptador
     * @param listData listado de datos para el adaptador
     */
    public DetailAdapter(final Context mContext, final List<Item> listData) {

        this.mContext = mContext;
        this.listData = listData;
    }

    /**
     * Obtener referencias de las vistas por cada item del adaptador
     */
    class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgProfile;

        ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgProfile = itemView.findViewById(R.id.profile_image);
        }
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {

        View viewRoot = LayoutInflater.from(mContext).inflate(R.layout.item_detail_view, parent, false);

        return new ViewHolder(viewRoot);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder,
                                 final int position) {

        Picasso.get()
                .load("https://www.alfabetajuega.com/wp-content/uploads/2018/10/116598.alfabetajuega-one-piece-luffy-260715-3.jpg")
                .into(holder.imgProfile);
    }
}