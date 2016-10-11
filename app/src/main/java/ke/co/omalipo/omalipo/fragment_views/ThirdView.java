package ke.co.omalipo.omalipo.fragment_views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ke.co.omalipo.omalipo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdView extends Fragment {


    public ThirdView() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third_view, container, false);
    }

}
