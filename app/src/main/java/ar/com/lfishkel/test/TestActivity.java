package ar.com.lfishkel.test;

import android.os.Bundle;

/**
 * Created by lfishkel on 25/03/15.
 */
public class TestActivity extends TestTitlebarActivity {

    //////////////////////////////////////////////////////////////////////
    // Constants
    //////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////
    // Attributes
    //////////////////////////////////////////////////////////////////////


    //////////////////////////////////////////////////////////////////////
    // The activity is being created.
    //////////////////////////////////////////////////////////////////////
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_test, R.layout.title1, R.id.activity_test);
    }

    //////////////////////////////////////////////////////////////////////
    // The activity is about to become visible.
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onStart() {
        super.onStart();
    }

    //////////////////////////////////////////////////////////////////////
    // The activity is about to become visible again.
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onRestart() {
        super.onRestart();
    }


    //////////////////////////////////////////////////////////////////////
    // The activity has become visible (it is now "resumed").
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onResume() {
        super.onResume();
    }


    //////////////////////////////////////////////////////////////////////
    // Another activity is taking focus (this activity is about to be "paused").
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onPause() {
        super.onPause();
    }


    //////////////////////////////////////////////////////////////////////
    // The activity is no longer visible (it is now "stopped")
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onStop() {
        super.onStop();
    }


    //////////////////////////////////////////////////////////////////////
    // The activity is about to be destroyed.
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    //////////////////////////////////////////////////////////////////////
    // Submethods
    //////////////////////////////////////////////////////////////////////


    //////////////////////////////////////////////////////////////////////
    // View Controls
    //////////////////////////////////////////////////////////////////////


}
