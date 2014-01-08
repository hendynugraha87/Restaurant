package com.modificationapp;

//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CFragmentTab extends Fragment{
//	@OVERRIDE
//	PUBLIC VIEW ONCREATEVIEW(LAYOUTINFLATER INFLATER, VIEWGROUP CONTAINER, BUNDLE SAVEDINSTANCESTATE){
//		RETURN INFLATER.INFLATE(R.LAYOUT.FRAGMENT_C, CONTAINER, FALSE);
//		
//	}

	public static Fragment newInstance(Context context){
		CFragmentTab f = new CFragmentTab();
		return f;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		ViewGroup root = (ViewGroup)inflater.inflate(R.layout.fragment_three, null);
		return root;
	}
}
