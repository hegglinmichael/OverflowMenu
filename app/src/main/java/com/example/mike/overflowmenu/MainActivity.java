package com.example.mike.overflowmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //this is the method for the OverFlowMenu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //makes a reference to the layout(background)
        RelativeLayout mainView = (RelativeLayout)findViewById(R.id.mainView);

        //checks the id of which item selected
        switch(item.getItemId()) {
            case R.id.menu_red :
                //unchecks if this item is checked but not chosen
                if(item.isChecked())
                    item.setChecked(false);
                else //checks if it is chosen
                    item.setChecked(true);
                //sets the background color
                mainView.setBackgroundColor(Color.RED);
                return true;
            case R.id.menu_blue :
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                mainView.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.menu_green :
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                mainView.setBackgroundColor(Color.GREEN);
                return true;
            default:
                //says an option was selected
                return super.onOptionsItemSelected(item);
        }
    }
}
