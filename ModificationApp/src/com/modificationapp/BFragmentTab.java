package com.modificationapp;

//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BFragmentTab extends Fragment {

//	@Override
//	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
//		return inflater.inflate(R.layout.fragment_b, container, false);
//		
//	}
	public static Fragment newInstance(Context context){
		BFragmentTab f = new BFragmentTab();
		return f;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		ViewGroup root = (ViewGroup)inflater.inflate(R.layout.fragment_two, null);
		return root;
	}
}
