package com.divum.test.animationdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class FirstAnimActivity extends Activity {
	
	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first_animation);
		button = (Button) findViewById(R.id.button_next);
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Animation animation = AnimationUtils.loadAnimation(FirstAnimActivity.this, R.anim.fade_out);
				animation.setAnimationListener(new Animation.AnimationListener() {
					
					@Override
					public void onAnimationStart(Animation animation) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onAnimationRepeat(Animation animation) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void onAnimationEnd(Animation animation) {
						// TODO Auto-generated method stub
						button.setVisibility(View.INVISIBLE);
						startActivity(new Intent(FirstAnimActivity.this, SecondAnimActivity.class));
						overridePendingTransition(R.anim.side_in_left, R.anim.side_out_left);
					}
				});
				button.startAnimation(animation);
			}
		});
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		findViewById(R.id.button_next).setVisibility(View.VISIBLE);
		super.onResume();
	}
}
