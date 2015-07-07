package com.example.listviewtest;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class FruitAdapter extends ArrayAdapter<Fruit> {

	private int resourceId;
	
	public FruitAdapter(Context context,int textViewResourceId,
			List<Fruit> objects) {
		// TODO Auto-generated constructor stub
		super(context, textViewResourceId, objects);
		resourceId = textViewResourceId;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		//return super.getView(position, convertView, parent);
		
		Fruit fruit = getItem(position);
		
		
		View view;
		ViewHolder viewHolder;
		
		if(convertView == null){
		    view = LayoutInflater.from(getContext()).inflate(resourceId, null);
		    viewHolder = new ViewHolder();
		    viewHolder.fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
		    viewHolder.fruitName = (TextView) view.findViewById(R.id.fruit_name);
		    view.setTag(viewHolder);
			
		}else{
			view = convertView;
			
		}

		//View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
		
		ImageView fruitImage= (ImageView)view.findViewById(R.id.fruit_image);
		TextView fruitName = (TextView)view.findViewById(R.id.fruit_name);
		fruitImage.setImageResource(fruit.getImageId());
		fruitName.setText(fruit.getName());
		return view;
	}
	
	class ViewHolder{
		
		ImageView fruitImage;
		
		TextView fruitName;
		
	}
	
}
