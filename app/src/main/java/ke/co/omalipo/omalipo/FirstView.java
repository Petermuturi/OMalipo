package ke.co.omalipo.omalipo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ke.co.omalipo.omalipo.util.Constants;


public class FirstView extends Fragment {


    public FirstView() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_first_view, container, false);

        RecyclerView rv = (RecyclerView)rootView.findViewById(R.id.rv_1);
        rv.setHasFixedSize(true);
        Constants.cardData.offPrice =new String[]{"10% Off on All Items", "Ksh 1,000 Off on Monthly Individual Gym Membership", "10% Off on All Food Bills", "Buy any Wedges for Ksh 3,000", "Buy any Heels for Ksh 3,500" , "10% on All Food Bills" , "20% Off on all Cakes"};
        Constants.cardData.prices =  new String[]{"Designer item prices atrt from Ksh 1,550 Only", "Was Ksh 5,500 | Now Ksh 4,500", "Prices After Discount Start at Ksh 270", "Was Ksh 4,000 | Now Ksh 3,000", "Was Ksh 5,500 & 4,500 | Now Ksh 3,500" , "Prices After Discount Start at Ksh 200" , "Prices After Discount Start at Ksh 300"};
        Constants.cardData.points = new String[]{"200 Points", "1000 Points", "270 Points", "1000 Points", "1500 Points" , "100 Points" , "300 Points"};

        MyAdapter myadapter = new MyAdapter(Constants.cardData);
        rv.setAdapter(myadapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return rootView;
    }

}
