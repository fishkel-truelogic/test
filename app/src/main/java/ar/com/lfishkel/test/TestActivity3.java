package ar.com.lfishkel.test;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

import ar.com.lfishkel.test.list.ListViewDemoFragment;

/**
 * Created by lfishkel on 25/03/15.
 */
public class TestActivity3 extends Activity {

    //////////////////////////////////////////////////////////////////////
    // Constants
    //////////////////////////////////////////////////////////////////////


    //////////////////////////////////////////////////////////////////////
    // Attributes
    //////////////////////////////////////////////////////////////////////

    private ListViewDemoFragment list;


    //////////////////////////////////////////////////////////////////////
    // The activity is being created.
    //////////////////////////////////////////////////////////////////////
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity3_test);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.title2);
        FragmentManager fm = getFragmentManager();
        list = (ListViewDemoFragment) fm.findFragmentById(R.id.list);
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
        ft.hide(list);
        ft.commit();

        addShowHideListener(R.id.btn_list, list);
    }


    //////////////////////////////////////////////////////////////////////
    // The activity is about to become visible.
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Activity3: The activity is about to become visible.");
    }

    //////////////////////////////////////////////////////////////////////
    // The activity is about to become visible again.
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("Activity3: The activity is about to become visible again.");
    }


    //////////////////////////////////////////////////////////////////////
    // The activity has become visible (it is now "resumed").
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Activity3: The activity has become visible (it is now \"resumed\").");

    }


    //////////////////////////////////////////////////////////////////////
    // Another activity is taking focus (this activity is about to be "paused").
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Activity3: Another activity is taking focus (this activity is about to be \"paused}\").");

    }


    //////////////////////////////////////////////////////////////////////
    // The activity is no longer visible (it is now "stopped")
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Activity3: The activity is no longer visible (it is now \"stopped\")");
    }


    //////////////////////////////////////////////////////////////////////
    // The activity is about to be destroyed.
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Activity3: The activity is about to be destroyed.");
    }


    //////////////////////////////////////////////////////////////////////
    // Submethods
    //////////////////////////////////////////////////////////////////////
    private void addShowHideListener(int buttonId, final Fragment fragment) {
        final View button = findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
                if (fragment.isHidden()) {
                    LinearLayout fl = (LinearLayout) findViewById(R.id.activity3_test);
                    list.setWidth((int) (fl.getWidth() * 0.85));
                    ft.show(fragment);
                } else {
                    ft.hide(fragment);
                }
                button.bringToFront();
                ft.commit();
            }
        });
    }



    //////////////////////////////////////////////////////////////////////
    // View Controls
    //////////////////////////////////////////////////////////////////////
    public void goToHome(View v) {
        finish();
    }



}
