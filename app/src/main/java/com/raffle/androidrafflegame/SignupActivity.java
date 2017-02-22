package com.raffle.androidrafflegame;

import android.app.ActionBar;
import android.content.ClipData;
import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.ClipData.Item;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
                /* Holly Kwan implemented and called methods below. (@CopyRight Holly Kwan) */
        try {
            final int id = getResources().getIdentifier("", "", "");
            findViewById(R.id.input_delete).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(intent);
                }
            });
        }
        catch(NullPointerException e){
            System.out.println("RuntimeException Catch");
        }
        /*Enable action bar*/
        try {
            ActionBar actionBar = getActionBar();
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        catch (NullPointerException e){
            System.out.println("RuntimeException Catch");
        }
    }
    public boolean onCreateOptionMenu(Menu menu){
        /*  Inflate the menu to add items */
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        /* Handle Action Bar's functionalities such as clicks */
        switch (item.getItemId()){
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            case R.id.input_delete:
                startActivity(new Intent(SignupActivity.this, LoginActivity.class));
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
