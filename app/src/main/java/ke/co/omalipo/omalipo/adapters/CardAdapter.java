package ke.co.omalipo.omalipo.adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import ke.co.omalipo.omalipo.MainActivity;
import ke.co.omalipo.omalipo.R;
import ke.co.omalipo.omalipo.classes.CardData;
import ke.co.omalipo.omalipo.fragment_views.SecondView;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.MyViewHolder> {
    private CardData mDataset;
    private  Activity activity;

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public  class MyViewHolder extends RecyclerView.ViewHolder {
        public CardView mCardView;
        public TextView mPriceView;
        public TextView mDetailsView;
        public TextView mPointsView;
        public Button mPickButton;
        public MyViewHolder(View v) {
            super(v);

            mCardView = (CardView) v.findViewById(R.id.card_view);
            mPriceView = (TextView) v.findViewById(R.id.percentOff);
            mDetailsView = (TextView) v.findViewById(R.id.details);
            mPointsView = (TextView) v.findViewById(R.id.points);
            mPickButton = (Button) v.findViewById(R.id.pick_button);

            mPickButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    product(v);
                }
                public void product(View v){
                    Intent intent = new Intent(v.getContext(), SecondView.class);
                    activity.startActivity(intent);
                }
            });
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public CardAdapter(CardData myDataset, Activity activity) {
        this.mDataset = myDataset;
        this.activity = activity;
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