package com.estsh.kotlin_wanandroid.main.contract

import com.estsh.kotlin_wanandroid.base.mvp.IView

/**
 *
 * author WuMeng
 * date 2019/12/4
 * desc:
 */
interface MainContract {

    interface View : IView {
        fun onUserInfo();
    }

    interface Presenter {
        fun getUserInfo();
    }

}