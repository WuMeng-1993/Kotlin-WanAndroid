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

        fun register(obj:Any) {
            EventBus.getDefault().register(obj);
        }

        fun unregister(obj: Any) {
            EventBus.getDefault().unregister(obj);
        }

        fun post(obj: Any) {
            EventBus.getDefault().post(obj);
        }

    }

}