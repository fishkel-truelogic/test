package ar.com.lfishkel.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by lfishkel on 25/03/15.
 */
public class TestActivity extends Activity {

    //////////////////////////////////////////////////////////////////////
    // Constants
    //////////////////////////////////////////////////////////////////////

    public static final String COUNTER = "counter";

    //////////////////////////////////////////////////////////////////////
    // Attributes
    //////////////////////////////////////////////////////////////////////

    private int counter = 0;

    //////////////////////////////////////////////////////////////////////
    // The activity is being created.
    //////////////////////////////////////////////////////////////////////
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ActivityManager.getInstance().setTestActivity(this);
        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt(COUNTER);
        }
        System.out.println("Activity1: The activity is being created - Saved count:" + counter);
    }


    //////////////////////////////////////////////////////////////////////
    // The activity is about to become visible.
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onStart() {
        super.onStart();

        System.out.println("Activity1: The activity is about to become visible. Count: " + counter);
        counter++;
    }

    //////////////////////////////////////////////////////////////////////
    // The activity is about to become visible again.
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Activity1: The activity is about to become visible again.");
    }


    //////////////////////////////////////////////////////////////////////
    // The activity has become visible (it is now "resumed").
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Activity1: The activity has become visible (it is now \"resumed\").");

    }


    //////////////////////////////////////////////////////////////////////
    // Another activity is taking focus (this activity is about to be "paused").
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Activity1: Another activity is taking focus (this activity is about to be \"paused}\").");

    }


    //////////////////////////////////////////////////////////////////////
    // The activity is no longer visible (it is now "stopped")
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Activity1: The activity is no longer visible (it is now \"stopped\")");
    }


    //////////////////////////////////////////////////////////////////////
    // The activity is about to be destroyed.
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Activity1: The activity is about to be destroyed.");
    }

    //////////////////////////////////////////////////////////////////////
    // Submethods
    //////////////////////////////////////////////////////////////////////



    //////////////////////////////////////////////////////////////////////
    // View Controls
    //////////////////////////////////////////////////////////////////////

    public void openActivity(View v) {
        if (ActivityManager.getInstance().getTestActivity() == null) {
            ActivityManager.getInstance().openActivity(this, TestActivity.class);
        } else {
            this.
            this.onStop();
            ActivityManager.getInstance().getTestActivity().onStart();
        }
    }

    public void openActivity2(View v) {
        if (ActivityManager.getInstance().getTestActivity2() == null) {
            ActivityManager.getInstance().openActivity(this, TestActivity2.class);
        } else {
            this.onStop();
            ActivityManager.getInstance().getTestActivity2().onStart();
        }
    }

    public void openActivity3(View v) {
        if (ActivityManager.getInstance().getTestActivity3() == null) {
            ActivityManager.getInstance().openActivity(this, TestActivity3.class);
        } else {
            this.onStop();
            ActivityManager.getInstance().getTestActivity3().onStart();
        }
    }

}
