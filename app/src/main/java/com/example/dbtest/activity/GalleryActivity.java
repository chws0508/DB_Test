package com.example.dbtest.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dbtest.R;
import com.example.dbtest.adapter.GalleryAdapter;

//activity gallery를 recycleview로 참조
public class GalleryActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        recyclerView = findViewById(R.id.recyclerView);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        String[] myDataset = {"강아지", "고양이", "드래곤", "치킨"};
        mAdapter = new GalleryAdapter(myDataset);
        recyclerView.setAdapter(mAdapter);
    }
}
