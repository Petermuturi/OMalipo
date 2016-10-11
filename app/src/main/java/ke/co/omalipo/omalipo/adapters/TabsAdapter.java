package ke.co.omalipo.omalipo.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ke.co.omalipo.omalipo.fragment_views.FirstView;
import ke.co.omalipo.omalipo.fragment_views.SecondView;
import ke.co.omalipo.omalipo.fragment_views.ThirdView;

public class TabsAdapter extends FragmentStatePagerAdapter{
    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment frag=null;
        switch (position){
            case 0:
                frag=new FirstView();
                break;
            case 1:
                frag=new SecondView();
                break;
            case 2:
                frag=new ThirdView();
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
                title="First";
                break;
            case 1:
                title="Second";
                break;
            case 2:
                title="Third";
                break;
        }

        return title;
    }
}