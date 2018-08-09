package com.example.group.adapter;

import java.util.ArrayList;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.group.fragment.AppliancesFragment;
import com.example.group.fragment.ClothesFragment;
import com.example.group.fragment.GoodsDetailFragment;
import com.example.group.fragment.GoodsOverviewFragment;

public class ClassPagerAdapter extends FragmentPagerAdapter {
	private ArrayList<String> mTitleArray;

	public ClassPagerAdapter(FragmentManager fm, ArrayList<String> titleArray) {
		super(fm);
		mTitleArray = titleArray;
	}

	@Override
	public Fragment getItem(int position) {
		if (position == 0) {
			return new ClothesFragment();
		} else if (position == 1) {
			return new AppliancesFragment();
		}
		return new ClothesFragment();
	}

	@Override
	public int getCount() {
		return mTitleArray.size();
	}

	@Override
	public CharSequence getPageTitle(int position) {
		return mTitleArray.get(position);
	}
}
