package com.estsh.kotlin_wanandroid.main

import android.animation.Animator
import com.airbnb.lottie.LottieAnimationView
import com.estsh.kotlin_wanandroid.R
import com.estsh.kotlin_wanandroid.base.BaseActivity
import com.estsh.kotlin_wanandroid.utils.gotoActivity

/**
 *
 * author WuMeng
 * date 2019/11/26
 * desc:
 */
class SplashActivity : BaseActivity() {

    private lateinit var logoLottieView: LottieAnimationView;

    override fun getLayoutResId(): Int {
        return R.layout.activity_splash;
    }

    override fun initView() {
        logoLottieView = findViewById(R.id.lav_logo);
        logoLottieView.addAnimatorListener(object : Animator.AnimatorListener {
            override fun onAnimationRepeat(animation: Animator?) {

            }

            override fun onAnimationEnd(animation: Animator?) {
                gotoMainActivity();
            }

            override fun onAnimationCancel(animation: Animator?) {

            }

            override fun onAnimationStart(animation: Animator?) {

            }

        })
    }

    fun gotoMainActivity(): Unit {
        gotoActivity(this,MainActivity().javaClass);
        finish();
    }
}
