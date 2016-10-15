package sbin.com.javacodefrag;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;

// This is how to calculate device independent pixels..
public class ScreenUtility {

    private float dpWidth;
    private float dpHeight;

    public ScreenUtility(Activity activity) {
        Display display = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics outMetrics = new DisplayMetrics();
        display.getMetrics(outMetrics);

        float density = activity.getResources().getDisplayMetrics().density;
        dpHeight = outMetrics.heightPixels / density;
        dpWidth = outMetrics.widthPixels / density;
    }

    public float getDpWidth() {
        return dpWidth;
    }

    public float getDpHeight() {
        return dpHeight;
    }

}
