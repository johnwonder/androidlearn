package com.example.sudoku;

import java.util.List;

import android.preference.PreferenceActivity;

public class EditPreferencesHC extends PreferenceActivity {

	
	@Override
	public void onBuildHeaders(List<Header> target) {
		// TODO Auto-generated method stub
		loadHeadersFromResource(R.xml.preference_headers, target); 
	}
	
	@Override
	protected boolean isValidFragment(String fragmentName) {
		// TODO Auto-generated method stub
		return super.isValidFragment(fragmentName);
	}
	
	
}
