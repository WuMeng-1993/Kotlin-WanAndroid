package com.estsh.kotlin_wanandroid.main

import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.viewpager.widget.ViewPager
import com.estsh.kotlin_wanandroid.R
import com.estsh.kotlin_wanandroid.base.mvp.BaseMVPActivity
import com.estsh.kotlin_wanandroid.main.contract.MainContract
import com.google.android.material.navigation.NavigationView
import com.google.android.material.tabs.TabLayout
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : BaseMVPActivity<MainContract.View, >, MainContract.View, View.OnClickListener {

    private lateinit var mainMenu: ImageView;
    private lateinit var mainSearch: ImageView;
    private lateinit var mainTabLayout: TabLayout;
    private lateinit var mainViewPager: ViewPager;
    private lateinit var drawerLayout: DrawerLayout;
    private lateinit var navigationView: NavigationView;
    private lateinit var avabarBackground: CircleImageView;
    private lateinit var usernameTextView: TextView;

    override fun getLayoutResId(): Int {
        return R.layout.activity_main;
    }

    override fun initView() {
        mainMenu = findViewById(R.id.iv_main_menu);
        mainSearch = findViewById(R.id.iv_main_search);
        mainTabLayout = findViewById(R.id.tl_main_tab);
        mainViewPager = findViewById(R.id.vp_main_pager);
        drawerLayout = findViewById(R.id.dl_drawer_layout);
        navigationView = findViewById(R.id.nv_left_navigation);

        val headerView: View = navigationView.getHeaderView(0);
        avabarBackground = headerView.findViewById(R.id.iv_nav_avatar);
        usernameTextView = headerView.findViewById(R.id.tv_nav_username);

        mainMenu.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                openDrawer();
            }
        })

        usernameTextView.setOnClickListener(this);

        navigationView.setNavigationItemSelectedListener(object :
            NavigationView.OnNavigationItemSelectedListener {
            override fun onNavigationItemSelected(p0: MenuItem): Boolean {
                closeDrawer();
                when (p0.itemId) {
                    // 轻松一刻
                    R.id.item_nav_happy_minute -> {

                    }
                    // 我的收藏
                    R.id.item_nav_favorite -> {

                    }
                    // 设置
                    R.id.item_nav_setting -> {

                    }
                    // 关于
                    R.id.item_nav_about -> {

                    }
                }
                return true;
            }
        })
    }

    override fun initData() {
        super.initData()
    }

    /**
     * 打开侧滑
     */
    private fun openDrawer(): Unit {
        drawerLayout.openDrawer(Gravity.LEFT);
    }

    /**
     * 关闭侧滑
     */
    private fun closeDrawer(): Unit {
        drawerLayout.closeDrawer(Gravity.LEFT);
    }

    override fun onClick(v: View?) {

    }

    override fun onDestroy() {
        super.onDestroy()
    }

}
