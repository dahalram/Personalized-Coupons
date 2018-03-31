package com.example.rambo.personalizedcoupons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidviewhover.BlurLayout;

public class UserAreaActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    LinearLayoutManager mLayoutManager;
    MyAdapter mAdapter;

    SearchView searchView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);



        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        String[] myDataset = {"a", "b", "c"};
        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);

//        searchView = findViewById(R.id.searchView);
//        searchView.setMaxWidth(Integer.MAX_VALUE);
    }


}

