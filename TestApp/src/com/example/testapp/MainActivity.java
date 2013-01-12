package com.example.testapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
	
	//public final static String EXTRA_MESSAGE = "com.example.testapp.MESSAGE";
	private ImageView profileImage;
	//int drawableId = (Integer)profileImage.getTag();
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
	    profileImage = (ImageView) findViewById(R.id.profile_pic);
    	if(getIntent().hasExtra("byteArray")) {
    		super.onCreate(savedInstanceState);
    	    //ImageView previewThumbnail = new ImageView(this);
    	    Bitmap b = BitmapFactory.decodeByteArray(
    	        getIntent().getByteArrayExtra("byteArray"),0,getIntent().getByteArrayExtra("byteArray").length);        
    	    //previewThumbnail.setImageBitmap(b);
    	    //b = ((BitmapDrawable)profileImage.getDrawable()).getBitmap();
    	    //Drawable d = new BitmapDrawable(getResources(),b);
    	   // profileImage.setImageBitmap(b);
    	   setContentView(R.layout.activity_main);
    	}
    	
    	else{


    	//get intent and change picture
    	//Bundle extras = this.getIntent().getExtras();
    	//ImageView newpic = bundle.getView();
    	
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    	}
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void sendMessage(View view){
    	Intent intent = new Intent(this, SecondActivity.class);
    	startActivity(intent);
    }
    
}
