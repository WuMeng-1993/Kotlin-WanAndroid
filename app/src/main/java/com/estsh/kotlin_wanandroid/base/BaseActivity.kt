package com.estsh.kotlin_wanandroid.base

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.estsh.kotlin_wanandroid.R
import com.estsh.kotlin_wanandroid.common.annotation.EventBusSubscribe
import com.estsh.kotlin_wanandroid.utils.EventBusUtils
import com.jaeger.library.StatusBarUtil

/**
 *
 * author WuMeng
 * date 2019/11/27
 * desc:
 */
abstract class BaseActivity : AppCompatActivity() {

    protected lateinit var mContext: Context;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutResId());
        mContext = this;
        // 5.0 以上才支持设置状态栏颜色
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
        }

        StatusBarUtil.setColor(this,ContextCompat.getColor(mContext,R.color.colorPrimary),0);

        if (isEventBusAnnotationPresent()) {
            EventBusUtils.register(this);
        }

        initView();
        initData();

    }

    /**
     * 获取布局
     */
    abstract fun getLayoutResId(): Int;

    private fun isEventBusAnnotationPresent(): Boolean {
        return javaClass.isAnnotationPresent(EventBusSubscribe::class.java);
    }

    /**
     * 初始化视图
     */
    abstract fun initView();

    /**
     * 初始化数据
     */
    open fun initData(){};


    override fun onDestroy() {
        super.onDestroy()
        if (isEventBusAnnotationPresent()) {
            EventBusUtils.unregister(this);
        }
    }

}