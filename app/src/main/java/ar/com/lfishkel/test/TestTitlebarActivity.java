package ar.com.lfishkel.test;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import ar.com.lfishkel.test.list.ListViewDemoFragment;

/**
 * Created by lfishkel on 26/03/15.
 */
public abstract class TestTitlebarActivity extends Activity {

    //////////////////////////////////////////////////////////////////////
    // Constants
    //////////////////////////////////////////////////////////////////////

    public static final String LIST_FRAGMENT_TAG = "list_fragment_tag";

    //////////////////////////////////////////////////////////////////////
    // Attributes
    //////////////////////////////////////////////////////////////////////


    protected int layout_id;
    protected int frame_id;
    protected int title_bar_id;
    private ListViewDemoFragment list;


    //////////////////////////////////////////////////////////////////////
    // The activity is being created.
    //////////////////////////////////////////////////////////////////////


    public void onCreate(Bundle savedInstanceState, int layout_id, int title_bar_id, int frame_id) {
        this.title_bar_id = title_bar_id;
        this.frame_id = frame_id;
        this.layout_id = layout_id;
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(layout_id);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, title_bar_id);
      //  addShowHideListener(R.id.btn_list, LIST_FRAGMENT_TAG);
    }


    //////////////////////////////////////////////////////////////////////
    // The activity is about to become visible.
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("The activity is about to become visible.");
    }

    //////////////////////////////////////////////////////////////////////
    // The activity is about to become visible again.
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("The activity is about to become visible again.");
    }


    //////////////////////////////////////////////////////////////////////
    // The activity has become visible (it is now "resumed").
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("The activity has become visible (it is now \"resumed\").");

    }


    //////////////////////////////////////////////////////////////////////
    // Another activity is taking focus (this activity is about to be "paused").
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Another activity is taking focus (this activity is about to be \"paused\").");

    }


    //////////////////////////////////////////////////////////////////////
    // The activity is no longer visible (it is now "stopped")
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("The activity is no longer visible (it is now \"stopped\")");
    }


    //////////////////////////////////////////////////////////////////////
    // The activity is about to be destroyed.
    //////////////////////////////////////////////////////////////////////
    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("The activity is about to be destroyed.");
    }


    //////////////////////////////////////////////////////////////////////
    // Submethods
    //////////////////////////////////////////////////////////////////////
    /*private void addShowHideListener(int buttonId, final String fragmentTag) {
        final View button = findViewById(buttonId);
        final Fragment fragment = getFragmentManager().findFragmentByTag(fragmentTag);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment animatedFragment = null;
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.setCustomAnimations(android.R.anim.slide_in_left, android.R.anim.slide_out_right);

                if (fragment == null) {
                    animatedFragment = new ListViewDemoFragment();
                    ft.add(frame_id, animatedFragment, LIST_FRAGMENT_TAG).commit();
                } else {
                    animatedFragment = fragment;
                }

                if (fragment.isHidden()) {
                    ViewGroup fl = (ViewGroup) findViewById(frame_id);
                    list.setWidth((int) (fl.getWidth() * 0.85));
                    ft.show(animatedFragment);
                } else {
                    ft.hide(animatedFragment);
                }
                button.bringToFront();
                ft.commit();
            }
        });
    }

*/

    //////////////////////////////////////////////////////////////////////
    // View Controls
    //////////////////////////////////////////////////////////////////////
    public void goToHome(View v) {
        finish();
    }

    public void openActivity2(View v) {
        Intent intent = new Intent(this, TestActivity2.class);
        startActivity(intent);

    }

    public void openActivity3(View v) {
        Intent intent = new Intent(this, TestActivity3.class);
        startActivity(intent);
    }


    public void toggleList(View v) {
        Fragment f = getFragmentManager().findFragmentByTag(LIST_FRAGMENT_TAG);

        if (f != null) {
            getFragmentManager().popBackStack();
        } else {
            ListViewDemoFragment fragment = (ListViewDemoFragment) Fragment.instantiate(this, ListViewDemoFragment.class.getName());
            ViewGroup fl = (ViewGroup) findViewById(frame_id);
            fragment.setWidth((int) (fl.getWidth() * 0.85));
            getFragmentManager()
                    .beginTransaction()
                    .setCustomAnimations(R.anim.slide_left_in_test, R.anim.slide_right_out_test,
                            R.anim.slide_left_in_test, R.anim.slide_right_out_test)

                    .add(frame_id, fragment,
                         LIST_FRAGMENT_TAG).addToBackStack(null).commit();
        }
    }

}
