package com.ezkuma.touchmove;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;


public class MainActivity extends Activity {
	private FrameLayout root;
	private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        root=(FrameLayout) findViewById(R.id.container);
        iv=(ImageView) findViewById(R.id.iv);
        root.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					break;
					
				case MotionEvent.ACTION_MOVE:
					FrameLayout.LayoutParams lp= (android.widget.FrameLayout.LayoutParams) iv.getLayoutParams();
					lp.leftMargin=(int) event.getX();
					lp.topMargin=(int) event.getY();
					iv.setLayoutParams(lp);
					break;
				
				case MotionEvent.ACTION_UP:
					break;
				
				}
				return true;
			}
		});
        
    }
    

}
