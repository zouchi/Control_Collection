package com.example.group;

import com.example.group.adapter.GridAdapter;
import com.example.group.bean.GoodsInfo;
import com.example.group.widget.SpacesItemDecoration;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by ouyangshen on 2016/10/21.
 */
public class RecyclerGridActivity extends AppCompatActivity {
	
	private RecyclerView rv_grid;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recycler_grid);
		rv_grid = (RecyclerView) findViewById(R.id.rv_grid);
		
		GridLayoutManager manager = new GridLayoutManager(this, 5);
		rv_grid.setLayoutManager(manager);
		
		GridAdapter adapter = new GridAdapter(this, GoodsInfo.getDefaultGrid());
		adapter.setOnItemClickListener(adapter);
		adapter.setOnItemLongClickListener(adapter);
		rv_grid.setAdapter(adapter);
		rv_grid.setItemAnimator(new DefaultItemAnimator());
		rv_grid.addItemDecoration(new SpacesItemDecoration(1));
	}
	
}
