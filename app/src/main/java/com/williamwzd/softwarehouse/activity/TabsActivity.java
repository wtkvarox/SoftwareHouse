package com.williamwzd.softwarehouse.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.williamwzd.softwarehouse.R;
import com.williamwzd.softwarehouse.fragment.ConfirmFragment;
import com.williamwzd.softwarehouse.fragment.InitiateFragment;
import com.williamwzd.softwarehouse.fragment.VerifyFragment;

import java.util.ArrayList;
import java.util.List;

public class TabsActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private int[] tabIcons = {
            R.drawable.checked,
            R.drawable.checked,
            R.drawable.success
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle(null);

        final ViewPager viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
    }

    /**
     * Configurar iconos
     */
    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
    }


    /**
     * Configurar viewpager
     *
     * @param viewPager fijar adaptador en ViewPager
     */
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new InitiateFragment(), "Initiate");
        adapter.addFrag(new VerifyFragment(), "Verify");
        adapter.addFrag(new ConfirmFragment(), "Confirm");
        viewPager.setAdapter(adapter);
    }

    /**
     * Adaptador para ViewPager y mostrar vistas en Fragments
     */
    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        void addFrag(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }

    /**
     * Ver listado de items
     *
     * @param view Vista que ha causado la accion
     */
    public void detailItemsListener(View view) {
        startActivity(new Intent(this, DetailActivity.class));
    }
}