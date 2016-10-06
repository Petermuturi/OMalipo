package ke.co.omalipo.omalipo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class SecondAdapter extends FragmentStatePagerAdapter{
    public SecondAdapter (FragmentManager fm) {
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