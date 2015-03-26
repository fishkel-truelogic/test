package ar.com.lfishkel.test.list;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ar.com.lfishkel.test.R;

/**
 * Created by lfishkel on 26/03/15.
 */
public class RightLayoutFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.right_menu_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
       /* Fragment f  = getFragmentManager().findFragmentByTag(LIST_TAG);
        if (f != null && f.getView() != null) {
            ViewGroup.LayoutParams params = f.getView().getLayoutParams();
            params.width = (int) (params.width * 0.85);
            f.getView().setLayoutParams(params);
        }*/


    }
}
