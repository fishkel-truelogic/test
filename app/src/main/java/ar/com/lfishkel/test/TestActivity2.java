package ar.com.lfishkel.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by lfishkel on 25/03/15.
 */
public class TestActivity2 extends Activity {

    //////////////////////////////////////////////////////////////////////
    // Constants
    //////////////////////////////////////////////////////////////////////


    //////////////////////////////////////////////////////////////////////
    // Attributes
    //////////////////////////////////////////////////////////////////////

    private View layout;


    //////////////////////////////////////////////////////////////////////
    // The activity is being created.
    //////////////////////////////////////////////////////////////////////
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_test);
        System.out.println("Activity2: The activity is being created");
        Bundle extras = getIntent().getExtras();
        String title = "";
        if (extras != null) {
            title = extras.getString("item");
        }
        TextView txt = (TextView) findViewById(R.id.txt);
        if (title != null && !title.isEmpty()) {
            txt.setText(title);
        }
    }


    //////////////////////////////////////////////////////////////////////
    // The activity is about to become visible.
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Activity2: The activity is about to become visible.");
    }

    //////////////////////////////////////////////////////////////////////
    // The activity is about to become visible again.
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Activity2: The activity is about to become visible again.");
    }


    //////////////////////////////////////////////////////////////////////
    // The activity has become visible (it is now "resumed").
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Activity2: The activity has become visible (it is now \"resumed\").");

    }


    //////////////////////////////////////////////////////////////////////
    // Another activity is taking focus (this activity is about to be "paused").
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Activity2: Another activity is taking focus (this activity is about to be \"paused}\").");

    }


    //////////////////////////////////////////////////////////////////////
    // The activity is no longer visible (it is now "stopped")
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Activity2: The activity is no longer visible (it is now \"stopped\")");
    }


    //////////////////////////////////////////////////////////////////////
    // The activity is about to be destroyed.
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Activity2: The activity is about to be destroyed.");
    }


    //////////////////////////////////////////////////////////////////////
    // Submethods
    //////////////////////////////////////////////////////////////////////



    //////////////////////////////////////////////////////////////////////
    // View Controls
    //////////////////////////////////////////////////////////////////////



}
