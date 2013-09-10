package com.example.clickcounter2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	public static int clicks = 0;

	private void updateClicks() {
		TextView textView = (TextView) findViewById(R.id.click_counter);
		String msg = null;
		if (clicks == 0) {
			msg = getString(R.string.click_counter_empty);
		} else {
			msg = getString(R.string.click_counter, clicks);
		}
		textView.setText(msg);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		updateClicks();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void increaseCounter(View view) {
		clicks++;
		updateClicks();
	}

}
