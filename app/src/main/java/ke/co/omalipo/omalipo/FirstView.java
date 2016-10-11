package ke.co.omalipo.omalipo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


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
        MyAdapter adapter = new MyAdapter(new String[]{"200 Points", "100 Points", "700 Points", "500 Points", "1000 Points" , "100 Points" , "300 Points"});
        rv.setAdapter(adapter);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        return rootView;
    }

}
