package ke.co.omalipo.omalipo.fragment_views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

import ke.co.omalipo.omalipo.R;
import ke.co.omalipo.omalipo.adapters.CardAdapter;
import ke.co.omalipo.omalipo.classes.ApiConfig;
import ke.co.omalipo.omalipo.classes.Deal;
import ke.co.omalipo.omalipo.util.Constants;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FirstView extends Fragment implements View.OnClickListener{

    Button pick_button;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_first_view, container, false);
        pick_button = (Button)rootView.findViewById(R.id.location);
        pick_button.setOnClickListener(this);


        final RecyclerView rv = (RecyclerView)rootView.findViewById(R.id.rv_1);
        rv.setHasFixedSize(true);

        ApiConfig.getService().getDeals().enqueue(new Callback<List<Deal>>() {
            @Override
            public void onResponse(Call<List<Deal>> call, Response<List<Deal>> response) {

                List<Deal> deals = response.body();
                if(deals == null){
                    Toast.makeText(getContext(), "Error occured", Toast.LENGTH_LONG).show();
                }
                else {
                    CardAdapter myadapter = new CardAdapter(deals, getActivity());
                    rv.setAdapter(myadapter);
                }
            }

            @Override
            public void onFailure(Call<List<Deal>> call, Throwable t) {
                Toast.makeText(getContext(), "Error occured", Toast.LENGTH_LONG).show();
            }
        });




        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getActivity(), "Hello World", Toast.LENGTH_LONG).show();
    }

}
