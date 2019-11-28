package com.estsh.kotlin_wanandroid.utils

import android.app.Activity
import android.content.Intent

/**
 *
 * author WuMeng
 * date 2019/11/28
 * desc:
 */

fun gotoActivity(activity: Activity,clazz: Class<Any>) {
    val intent = Intent(activity,clazz);
    activity.startActivity(intent);
}