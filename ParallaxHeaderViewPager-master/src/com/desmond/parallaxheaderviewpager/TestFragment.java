package com.desmond.parallaxheaderviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;

public class TestFragment extends ScrollTabHolderFragment {

	private NotifyingScrollView mScrollView;
	
	private int mPosition;
	
	 public static Fragment newInstance(int position) {
	        FirstScrollViewFragment fragment = new FirstScrollViewFragment();
	        Bundle args = new Bundle();
	        args.putInt("position", position);
	        fragment.setArguments(args);
	        return fragment;
	    }
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_first_scroll_view,
				container, false);
		
		mScrollView = (NotifyingScrollView) view.findViewById(R.id.scrollview);
        mScrollView.setOnScrollChangedListener(new NotifyingScrollView.OnScrollChangedListener() {
            @Override
            public void onScrollChanged(ScrollView view, int l, int t, int oldl, int oldt) {

                if (mScrollTabHolder != null) {
                    mScrollTabHolder.onScrollViewScroll(view, l, t, oldl, oldt, mPosition);
                }
            }
        });
        mPosition = getArguments().getInt("position");
		return view;
	}
	
	@Override
    public void adjustScroll(int scrollHeight, int headerHeight) {
        if (mScrollView == null) return;

        mScrollView.scrollTo(0, headerHeight - scrollHeight);
    }

}
