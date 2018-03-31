package com.example.rambo.personalizedcoupons;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.daimajia.androidviewhover.BlurLayout;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private String[] mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView mIdView;
        final ImageView imageView;
        final BlurLayout blurLayout;
        final View hover;

        ViewHolder(View view) {
            super(view);
            mIdView = (TextView) view.findViewById(R.id.coupon_title);
            imageView = view.findViewById(R.id.id_image);
            blurLayout = view.findViewById(R.id.sample);
            hover = LayoutInflater.from(view.getContext()).inflate(R.layout.hover_view, null);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public MyAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = (View) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_card_view, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;

    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.mIdView.setText(mDataset[position]);

        holder.blurLayout.setHoverView(holder.hover);
        holder.blurLayout.enableZoomBackground(true);
        holder.blurLayout.setBlurDuration(1200);

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
