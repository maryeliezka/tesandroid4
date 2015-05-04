/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.androidku;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 *
 * @author Admin
 */
public class LoadActivity extends Activity
{
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
	setContentView(R.layout.loadgame);
		
	Button backbutton = (Button)findViewById(R.id.back_button);
	backbutton.setOnClickListener(new View.OnClickListener() 
        {
            @Override
            public void onClick(View v) 
            {
                finish();
            }
	});
    }   
}
