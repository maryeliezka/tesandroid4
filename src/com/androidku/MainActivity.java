package com.androidku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        try
        {
            View.OnClickListener handler; 
            handler = new View.OnClickListener() 
            {
                public void onClick(View v) 
                {
                    switch(v.getId())
                    {
                        case R.id.newbutton :
                            Intent intent = new Intent(MainActivity.this, NewActivity.class);
                            startActivity(intent);
                            break;
                        case R.id.loadbutton :
                            Intent intent2 = new Intent(MainActivity.this, NewActivity.class);
                            startActivity(intent2);
                            break;
                        case R.id.exitbutton :
                            finish();
                            break;
                    }
                }
            };
        
        
        findViewById(R.id.newbutton).setOnClickListener(handler);
        findViewById(R.id.loadbutton).setOnClickListener(handler);
        findViewById(R.id.exitbutton).setOnClickListener(handler);
        }catch(Exception e)
        {
            Log.e("Android Button Tutorial", e.toString());
        }
    }
}
