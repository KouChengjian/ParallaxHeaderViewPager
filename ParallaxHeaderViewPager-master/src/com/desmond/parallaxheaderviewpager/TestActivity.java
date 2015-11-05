package com.desmond.parallaxheaderviewpager;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.AbsListView;
import android.widget.ScrollView;


public class TestActivity extends Activity implements ScrollTabHolder{

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	
	
	
	@Override
	public void adjustScroll(int scrollHeight, int headerHeight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onListViewScroll(AbsListView view, int firstVisibleItem,
			int visibleItemCount, int totalItemCount, int pagePosition) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onScrollViewScroll(ScrollView view, int x, int y, int oldX,
			int oldY, int pagePosition) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onRecyclerViewScroll(RecyclerView view, int scrollY,
			int pagePosition) {
		// TODO Auto-generated method stub
		
	}

}
