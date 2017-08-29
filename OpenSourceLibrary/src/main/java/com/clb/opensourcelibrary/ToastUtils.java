package com.clb.opensourcelibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2017.08.29.0029.
 */

public class ToastUtils {
    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }

}
