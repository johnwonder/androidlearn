package com.example.sudoku;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public class PrefsFragment extends PreferenceFragment
{
	@Override public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		
		//getResources().getColor(R.color.background);
		int res = getActivity().getResources().getIdentifier(getArguments().getString("resource"), "xml", getActivity().getPackageName());
		addPreferencesFromResource(res);
		
		//addPreferencesFromResource(R.xml.settings);
		
		
	} 
	
}
