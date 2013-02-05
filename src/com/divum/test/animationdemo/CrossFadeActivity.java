package com.divum.test.animationdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class CrossFadeActivity extends Activity {
	
	private View mContentView;
	private View mLoadingView;
	private int shortAnimationDuration;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cross_fade_layout);
		
		mContentView = (View) findViewById(R.id.content);
		mLoadingView = (View) findViewById(R.id.progress_bar);
		
		mContentView.setVisibility(View.GONE);
		shortAnimationDuration = getResources().getInteger(android.R.integer.config_shortAnimTime);
	}
}
