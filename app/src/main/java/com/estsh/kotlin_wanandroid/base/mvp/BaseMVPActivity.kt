package com.estsh.kotlin_wanandroid.base.mvp

import com.estsh.kotlin_wanandroid.base.BaseActivity

/**
 *
 * author WuMeng
 * date 2019/12/4
 * desc:
 */
abstract class BaseMVPActivity<in V : IView, P : IPresenter<in V>> : BaseActivity(), IView {

    protected lateinit var presenter: P;

    override fun initData() {
        super.initData()
        presenter = createPresenter();
        presenter.attachView(this as V);
    }

    abstract fun createPresenter(): P;
}