package com.example.group;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by ouyangshen on 2016/10/21.
 */
public class TabThirdActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_tab_third);

		String desc = String.format("我是%s页面，来自%s", 
				"购物车", getIntent().getExtras().getString("tag"));
		TextView tv_third = (TextView) findViewById(R.id.tv_third);
		tv_third.setText(desc);
	}

}
