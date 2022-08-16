package com.qingniu.toastlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * @author: hyr
 * @date: 2022/8/16 16:11
 * @desc:
 */
public class ToastUtil {
    public static void toast(Context context){
        Toast.makeText(context,"我是测试",Toast.LENGTH_SHORT).show();
    }
}
