package com.divum.test.animationdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class SecondAnimActivity extends Activity {
	
	private Button button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_animation);
		button = (Button) findViewById(R.id.button_back);
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Animation animation = AnimationUtils.loadAnimation(SecondAnimActivity.this, R.anim.grow_spin);
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
						goBack();
					}
					
					
				});
				button.startAnimation(animation);
			}
		});
	}
	private void goBack() {
		// TODO Auto-generated method stub
		finish();
		overridePendingTransition(R.anim.side_in_right, R.anim.side_out_right);
		
	}
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		findViewById(R.id.button_back).setVisibility(View.VISIBLE);
		super.onResume();
	}
	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if(keyCode==KeyEvent.KEYCODE_BACK)
		{
			goBack();
			return true;
		}
		return super.onKeyUp(keyCode, event);
	}
}
