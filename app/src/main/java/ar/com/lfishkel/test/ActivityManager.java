package ar.com.lfishkel.test;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by lfishkel on 25/03/15.
 */
public class ActivityManager {

    private static ActivityManager ourInstance = new ActivityManager();

    private TestActivity testActivity;

    private TestActivity2 testActivity2;

    private TestActivity3 testActivity3;

    public static ActivityManager getInstance() {
        return ourInstance;
    }

    private ActivityManager() {
    }

    public void openActivity(Activity activity, Class clazz) {
        Intent intent = new Intent(activity, clazz);
        activity.startActivity(intent);
    }

    public TestActivity getTestActivity() {
        return testActivity;
    }

    public void setTestActivity(TestActivity testActivity) {
        this.testActivity = testActivity;
    }

    public TestActivity2 getTestActivity2() {
        return testActivity2;
    }

    public void setTestActivity2(TestActivity2 testActivity2) {
        this.testActivity2 = testActivity2;
    }

    public TestActivity3 getTestActivity3() {
        return testActivity3;
    }

    public void setTestActivity3(TestActivity3 testActivity3) {
        this.testActivity3 = testActivity3;
    }
}
