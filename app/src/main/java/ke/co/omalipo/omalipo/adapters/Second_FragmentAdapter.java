package ke.co.omalipo.omalipo.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ke.co.omalipo.omalipo.fragment_views.second_view_tabs.Details;
import ke.co.omalipo.omalipo.fragment_views.second_view_tabs.History;


public class Second_FragmentAdapter extends FragmentStatePagerAdapter{
    public Second_FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment frag=null;
        switch (position){
            case 0:
                frag=new Details();
                break;
            case 1:
                frag=new History();
                break;
        }
        return frag;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title=" ";
        switch (position){
            case 0:
                title="Details";
                break;
            case 1:
                title="History";
                break;
        }

        return title;
    }
}