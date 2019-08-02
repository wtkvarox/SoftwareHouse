package com.williamwzd.softwarehouse.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.williamwzd.softwarehouse.R;
import com.williamwzd.softwarehouse.adapter.DetailAdapter;
import com.williamwzd.softwarehouse.domain.Item;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        // Referenciar
        RecyclerView recyclerViewDetail = findViewById(R.id.recycler_view_detail);

        final LinearLayoutManager layoutManager = new LinearLayoutManager(this
                , RecyclerView.VERTICAL
                , false);

        recyclerViewDetail.setLayoutManager(layoutManager);
        final DetailAdapter detailAdapter;
        detailAdapter = new DetailAdapter(this, getDataList(500));
        recyclerViewDetail.setAdapter(detailAdapter);
    }


    /**
     * Poblar listado de datos falsos
     *
     * @param numItems Cantidad de items totales
     * @return Devuelve un listado de datos
     */
    private List<Item> getDataList(final int numItems) {
        final List<Item> listData = new ArrayList<>();

        for (int i = 0; i < numItems; i++) {
            listData.add(new Item());
        }

        return listData;
    }
}