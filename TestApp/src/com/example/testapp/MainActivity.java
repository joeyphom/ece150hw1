package com.example.testapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {
	private ImageView profileImage;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	
	    
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(getIntent().hasExtra("id")){
        	Intent i = getIntent();
        	int position = i.getExtras().getInt("id");
        	ImageAdapter imageAdapter = new ImageAdapter(this);
        	profileImage = (ImageView) findViewById(R.id.profile_pic);
        	profileImage.setImageResource(imageAdapter.mThumbIds[position]);
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
