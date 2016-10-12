package ke.co.omalipo.omalipo.classes;

import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ke.co.omalipo.omalipo.R;
import ke.co.omalipo.omalipo.adapters.TabsAdapter;

public class MainActivity extends AppCompatActivity {
    ViewPager pager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager= (ViewPager) findViewById(R.id.view_pager);
        tabLayout= (TabLayout) findViewById(R.id.tab_layout);

        // Fragment manager to add fragment in viewpager we will pass object of Fragment manager to adpater class.
        FragmentManager manager=getSupportFragmentManager();

        //object of TabsAdapter passing fragment manager object as a parameter of constructor of TabsAdapter class.
        TabsAdapter adapter=new TabsAdapter(manager);

        //set Adapter to view pager
        pager.setAdapter(adapter);

        //set tablayout with viewpager
        tabLayout.setupWithViewPager(pager);

        // adding functionality to tab and viewpager to manage each other when a page is changed or when a tab is selected
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        //Setting tabs from adpater
        tabLayout.setTabsFromPagerAdapter(adapter);

//        final View actionPoints = findViewById(R.id.points);
//        final View actionPromo = findViewById(R.id.promo);
//        final View actionMobile = findViewById(R.id.mobile);

        FloatingActionButton actionMenu = new FloatingActionButton(getBaseContext());
//        actionMenu.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                actionPoints.setVisibility(actionPoints.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
//                actionPromo.setVisibility(actionPromo.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
//                actionMobile.setVisibility(actionMobile.getVisibility() == View.GONE ? View.VISIBLE : View.GONE);
//            }
//        });

        FloatingActionsMenu menuMultipleActions = (FloatingActionsMenu) findViewById(R.id.menu);
        menuMultipleActions.addButton(actionMenu);
    }

}
