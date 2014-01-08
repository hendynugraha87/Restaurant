package com.modificationapp;

//import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;

public class AFragmentTab extends Fragment{
//	@Override
//	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
//		return inflater.inflate(R.layout.fragment_a, container, false);
//		
//	}
	public static Fragment newInstance(Context context){
		AFragmentTab f = new AFragmentTab();
		return f;
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		ViewGroup root = (ViewGroup)inflater.inflate(R.layout.fragment_one, null);
		return root;
	}
}
