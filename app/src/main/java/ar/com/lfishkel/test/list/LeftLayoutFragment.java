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
public class LeftLayoutFragment extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListViewDemoFragment list = new ListViewDemoFragment();
        View view = null;
        if (getActivity().findViewById(R.id.activity_test) != null) {
            view = getActivity().findViewById(R.id.activity_test);
        } else if (getActivity().findViewById(R.id.activity2_test) != null) {
            view = getActivity().findViewById(R.id.activity2_test);
        } else if (getActivity().findViewById(R.id.activity3_test) != null) {
            view = getActivity().findViewById(R.id.activity3_test);
        }
        list.setWidth((int) (view.getWidth() * 0.85));
        FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.left_menu_fragment, list).commit();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.left_menu_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
