package com.estsh.kotlin_wanandroid.base.mvp

/**
 *
 * author WuMeng
 * date 2019/12/4
 * desc:
 */
interface IPresenter<V : IView> {

    fun attachView(view: V);

    fun detachView();

    fun isViewAttached(): Boolean;

    fun getView(): V?;

}