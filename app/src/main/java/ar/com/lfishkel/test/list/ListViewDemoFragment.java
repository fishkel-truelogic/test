package ar.com.lfishkel.test.list;

import android.app.ListFragment;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ar.com.lfishkel.test.R;
import ar.com.lfishkel.test.TestActivity2;

/**
 * Created by lfishkel on 25/03/15.
 */
public class ListViewDemoFragment extends ListFragment {

    private int width;

    private List<ListViewItem> mItems;        // ListView items list


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // initialize the items list
        mItems = new ArrayList<ListViewItem>();
        Resources resources = getResources();

        mItems.add(new ListViewItem(resources.getDrawable(R.drawable.icon), "1", "asdasd"));
        mItems.add(new ListViewItem(resources.getDrawable(R.drawable.icon), "2", "asdasd"));
        mItems.add(new ListViewItem(resources.getDrawable(R.drawable.icon), "3", "asdasd"));
        mItems.add(new ListViewItem(resources.getDrawable(R.drawable.icon), "4", "asdasd"));
        mItems.add(new ListViewItem(resources.getDrawable(R.drawable.icon), "5", "asdasd"));
        mItems.add(new ListViewItem(resources.getDrawable(R.drawable.icon), "6", "asdasd"));
        mItems.add(new ListViewItem(resources.getDrawable(R.drawable.icon), "7", "asdasd"));

        // initialize and set the list adapter
        setListAdapter(new ListViewDemoAdapter(getActivity(), mItems));

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        // remove the dividers from the ListView of the ListFragment
        getListView().setDivider(null);
        ViewGroup.LayoutParams params = view.getLayoutParams();
        params.width = width;
        view.setLayoutParams(params);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // retrieve theListView item
        ListViewItem item = mItems.get(position);
        // do something
        Toast.makeText(getActivity(), item.title, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getActivity(), TestActivity2.class);
        intent.putExtra("item", item.title);
        startActivity(intent);
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
