package com.estsh.kotlin_wanandroid.utils

import org.greenrobot.eventbus.EventBus

/**
 *
 * author WuMeng
 * date 2019/11/27
 * desc:
 */
class EventBusUtils {

    companion object {

        fun register(obj: Any): Unit {
            EventBus.getDefault().register(obj);
        }

        fun unregister(obj: Any): Unit {
            EventBus.getDefault().unregister(this);
        }

        fun post(obj: Any): Unit {
            EventBus.getDefault().post(obj);
        }

    }

}