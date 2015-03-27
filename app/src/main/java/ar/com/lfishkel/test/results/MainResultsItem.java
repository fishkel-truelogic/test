package ar.com.lfishkel.test.results;

import android.graphics.drawable.Drawable;

/**
 * Created by lfishkel on 25/03/15.
 */
public class MainResultsItem {
    public final Drawable icon;       // the drawable for the ListView item ImageView
    public final String title;        // the text for the ListView item title
    public final String description;  // the text for the ListView item description

    public MainResultsItem(Drawable icon, String title, String description) {
        this.icon = icon;
        this.title = title;
        this.description = description;
    }
}
