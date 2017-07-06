package hemant.curlpagerdemo;

import android.content.Context;
import android.widget.LinearLayout;

/**
 * Created by Hemant Saini on 01-09-2016.
 */
public class ModelClass extends LinearLayout{

    public ModelClass(Context context) {
        super(context);
        layout(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
        setOrientation(VERTICAL);
    }
}
