package ke.co.omalipo.omalipo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter{
    public PagerAdapter(FragmentManager fm) {
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