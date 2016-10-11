package ke.co.omalipo.omalipo.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ke.co.omalipo.omalipo.R;
import ke.co.omalipo.omalipo.classes.CardData;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.MyViewHolder> {
    private CardData mDataset;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public CardView mCardView;
        public TextView mPriceView;
        public TextView mDetailsView;
        public TextView mPointsView;
        public MyViewHolder(View v) {
            super(v);

            mCardView = (CardView) v.findViewById(R.id.card_view);
            mPriceView = (TextView) v.findViewById(R.id.percentOff);
            mDetailsView = (TextView) v.findViewById(R.id.details);
            mPointsView = (TextView) v.findViewById(R.id.points);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public CardAdapter(CardData myDataset) {
        mDataset = myDataset;
    };

    // Create new views (invoked by the layout manager)
    @Override
    public CardAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                       int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_content, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.mPriceView.setText(mDataset.get(position)[2]);
        holder.mDetailsView.setText(mDataset.get(position)[1]);
        holder.mPointsView.setText(mDataset.get(position)[0]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length();
    }
}